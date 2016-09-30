package me.south10.data.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by south10 on 2016-09-30.
 */
public class MyVector implements List, Iterator {
    Object[] data = null;
    int capacity = 0;
    int size = 0;

    int cursor = 0;
    int lastRet = -1;


    public MyVector(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("유효하지 않은 값입니다. : " + capacity);
        this.capacity = capacity;
        data = new Object[capacity];
    }

    public MyVector(){
        this(10);
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity - data.length > 0)
            setCapacity(minCapacity);
    }

    @Override
    public boolean add(Object obj) {
        ensureCapacity(size + 1);
        data[size++] = obj;
        return true;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        return data[index];
    }

    @Override
    public Object remove(int index) {
        Object oldObj = null;

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        oldObj = data[index];

        if (index != size-1) {
            System.arraycopy(data, index+1, data, index, size-index-1);
        }

        data[size-1] = null;
        size--;
        return oldObj;
    }

    @Override
    public boolean remove(Object obj) {
        for (int i = 0; i < size; i++) {
            if (obj.equals(data[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public void trimToSize() {
        setCapacity(size);
    }

    public void setCapacity(int capacity) {
        if (this.capacity == capacity)
            return;

        Object[] tmp = new Object[capacity];
        System.arraycopy(data, 0, tmp, 0 ,size);
        data = tmp;
        this.capacity = capacity;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        System.arraycopy(data, 0, result, 0, size);
        return result;
    }

    public int capacity() {
        return capacity;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        cursor = 0;
        lastRet = -1;
        return this;
    }

    @Override
    public boolean hasNext() {
        return cursor != size;
    }

    @Override
    public Object next() {
        Object next = get(cursor);
        lastRet = cursor++;
        return next;
    }

    public void remove() {
        if (lastRet == -1) {
            throw new IllegalStateException();
        } else {
            remove(lastRet);
            cursor--;
            lastRet = -1;
        }
    }

    public String toString() {
        String tmp = "";
        Iterator it = iterator();

        for(int i = 0; it.hasNext(); i++) {
            if(i != 0) tmp+=", ";
            tmp += it.next(); 	// tmp += next().toString();
        }

        return "["+ tmp +"]";
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }


    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }



    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
