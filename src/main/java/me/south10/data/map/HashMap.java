package me.south10.data.map;

/**
 * Created by south10 on 2016-09-30.
 */
public class HashMap<K, V> {
    private static final double LOAD_FACTOR = 0.75;
    private static final int DEFAULT_CAPACITY = 16;

    private Entry[] table;
    private int elemCount;

    public HashMap() {
        table = new Entry[DEFAULT_CAPACITY];
        elemCount = 0;
    }

    public HashMap(int capacity) {
        table = new Entry[capacity];
        elemCount = 0;
    }

    public V put(K key, V value) {
        int hash = (key == null) ? 0 : hash(key.hashCode());
        int i = indexFor(hash, table.length);
        for (Entry<K, V> e = table[i]; e != null; e = e.getNext()) {
            if (e.getKey().equals(key)) {
                V oldValue = e.getValue();
                e.setValue(value);
                return oldValue;
            }
        }
        addEntry(hash, key, value, i);
        return null;
    }

    public V get(K key) {
        int hash = (key == null) ? 0 : hash(key.hashCode());
        int i = indexFor(hash, table.length);
        for (Entry<K, V> e = table[i]; e != null; e = e.getNext()) {
            if (e.getKey().equals(key)) {
                return e.getValue();
            }
        }
        return null;
    }

    public V remove(K key) {
        int hash = (key == null) ? 0 : hash(key.hashCode());
        int i = indexFor(hash, table.length);

        Entry<K, V> prev = table[i];
        Entry<K, V> e = prev;

        while (e != null) {
            if (e.getKey().equals(key)) {
                if (prev == e) {
                    table[i] = e.getNext();
                } else {
                    prev.setNext(e.getNext());
                }
                elemCount--;
                return e.getValue();
            }
            prev = e;
            e = e.getNext();
        }
        return null;
    }

    private void addEntry(int hash, K key, V value, int bucketIndex) {
        Entry<K, V> e = table[bucketIndex];
        table[bucketIndex] = new Entry(hash, key, value, e);
        elemCount++;
        if (elemCount >= LOAD_FACTOR * table.length)
            resize();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                sb.append(i + ": ");
                Entry<K, V> curr = table[i];
                while (curr != null) {
                    sb.append("(" + curr.getKey() + ", " + curr.getValue() + ") ");
                    curr = curr.getNext();
                }
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    private void resize() {
        Entry[] newTable = new Entry[table.length * 2];

        for (int j = 0; j < table.length; j++) {
            Entry<K, V> e = table[j];

            if (e != null) {
                while (e != null) {
                    Entry<K, V> next = e.getNext();
                    int i = indexFor(e.getHash(), newTable.length);
                    e.setNext(newTable[i]);
                    newTable[i] = e;
                    e = next;
                }
            }
        }
        table = newTable;
    }

    private int indexFor(int h, int length) {
        return h & (length - 1);
    }

    private int hash(int h) {
        h ^= (h >>> 20) ^ (h >>> 12);
        h ^= (h >>> 7) ^ (h >>> 4);
        return (h < 0) ? h * -1 : h;
    }

}

