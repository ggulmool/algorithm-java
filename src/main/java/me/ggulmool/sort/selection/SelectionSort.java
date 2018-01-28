package me.ggulmool.sort.selection;

import java.util.Arrays;

/**
 * Created by ggulmool on 2016-03-16.
 */
public class SelectionSort {
	public static void main(String[] args) {
		int[] data = { 7, 5, 6, 1, 9 };
		// System.out.println(Arrays.toString(data));
		// Arrays.sort(data);
		// System.out.println(Arrays.toString(data));

		int temp = 0;
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
			System.out.println(Arrays.toString(data));
		}

		System.out.println("선택정렬 결과");
		System.out.println(Arrays.toString(data));
	}
}
