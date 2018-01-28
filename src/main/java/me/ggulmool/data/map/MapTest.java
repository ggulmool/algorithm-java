package me.ggulmool.data.map;

import java.util.Calendar;

/**
 * Created by ggulmool on 2016-09-30.
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("abc", 1);
        map.put("de", 2);
        map.put("fg", 3);
        map.put("vg", 4);
        map.put("zx", 5);
        map.put("yh", 6);
        map.put("pl", 7);
        map.put("lk", 8);
        map.put("mg", 9);
        map.put("qs", 10);
        map.put("rf", 11);
        map.put("bv", 12);
        map.put("kf", 13);
        map.put("ty", 15);
        map.put("op", 16);
        map.put("vc", 17);
        map.put("qwer", 18);
        map.put("plokij", 19);
        map.put("zxcv", 20);

        System.out.println(map);

        Calendar cal = Calendar.getInstance();
        System.out.println("Value for key zxcv: " + map.get("zxcv") + '\n');

        map.remove("rf");
        System.out.println(map);
        map.remove("kf");
        System.out.println(map);
    }
}
