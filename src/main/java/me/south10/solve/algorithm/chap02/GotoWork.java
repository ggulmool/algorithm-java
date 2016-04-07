package me.south10.solve.algorithm.chap02;

/**
 * Created by south10 on 2016-04-07.
 * 출근길 수 세기 (배열 중 0값은 공사장)
 * 공사장 길은 피해서 가야한다.
 */
public class GotoWork {
    final static int M = 5;
    final static int N = 5;

    static int[][] path = new int[M][N];
    static int[][] map = new int[M][N];

    public static void main(String[] args) {
        /*
        1  1  1  1  0
        1  1  1  1  1
        1  1  1  1  1
        1  0  0  1  1
        1  1  1  1  1
        */
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if((i==0 && j==4) ||(i==3 && j==1) || (i==3 && j==2))
                    map[i][j] = 0;
                else
                    map[i][j] = 1;
            }
        }

        // 방법1
        showArr(map, 5, 5);
        //System.out.printf("%d\n", num_path(M-1, N-1));

        // 방법2
        calculate_path(5, 5);
        showArr(path, 5, 5);
        System.out.printf("%d\n", path[M - 1][N - 1]);
    }

    // 방법1(재귀 호출)
    private static int num_path(int m, int n) {
        if(map[m][n] == 0)
            return 0;
        if(m == 0 && n == 0)
            return 1;

        return ((m>0) ? num_path(m-1, n) : 0) + ((n>0) ? num_path(m, n-1) : 0);
    }

    // 방법2(동적 프로그래밍)
    private static void calculate_path(int m, int n) {
        int i, j;

        path[0][0] = map[0][0];
        for (i = 1; i < m; i++) {
            if (map[i][0] == 0)
                path[i][0] = 0;
            else
                path[i][0] = path[i - 1][0];

        }
        for (j = 1; j < n; j++) {
            if (map[0][j] == 0)
                path[0][j] = 0;
            else
                path[0][j] = path[0][j - 1];
        }
        for (i = 1; i < m; i++) {
            for (j = 1; j < n; j++) {
                if (map[i][j] == 0)
                    path[i][j] = 0;
                else
                    path[i][j] = path[i - 1][j] + path[i][j - 1];
            }
        }

    }

    // 배열 출력
    private static void showArr(int[][] arr, int m, int n) {
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++)
                System.out.printf("%2d ",arr[i][j]);

            System.out.println();
        }
    }
}
