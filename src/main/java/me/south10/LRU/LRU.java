package me.south10.LRU;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by south10 on 2016-03-08.
 */
public class LRU<K,V> extends LinkedHashMap<K,V> {
    private int maxSize;

    public LRU(int size) {
        super(size+1, 1, true);
        this.maxSize = size;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        System.out.println("여기호출" + size());
        return size() > maxSize;
    }

    public static void main(String[] args) {
        LRU<String, Integer> lru = new LRU<String, Integer>(2);
        lru.put("A",1);
        System.out.println("A1");
        lru.put("B",2);
        System.out.println("B2");
        lru.put("C",3);
        System.out.println("C3");

        System.out.println("lru.size() : " + lru.size());
        if(lru.containsKey("A"))
            System.out.println("LRU is failed");
        else
            System.out.println("Yes " + lru.size());

    }
}
