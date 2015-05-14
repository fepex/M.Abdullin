package ru.kpfu.itis.group403.abdullin.dynamiclist;


import java.util.*;

public class DynamicList<T> implements List<T> {

    private T[] arr;

    private int size;
    private Object[] elementData;

    @Override
    public int size() {
        return this.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public boolean add(T t) {

        size++;
        elementData = Arrays.copyOf(elementData, size);
        elementData[size - 1] = t;
        return true;
    }

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {
            private int iter;

            @Override
            public boolean hasNext() {
                return iter != size;
            }

            @Override
            public T next() {
                if (iter == size) {
                    throw new NoSuchElementException();
                }
                return (T) elementData[iter++];

            }
        };
    }


    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {

        Object[] a = c.toArray();
        int numNew = a.length;
        System.arraycopy(a, 0, elementData, size, numNew);
        size += numNew;
        return numNew != 0;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {

        Object[] a = c.toArray();
        int numNew = a.length;

        int numMoved = size - index;
        if (numMoved > 0)
            System.arraycopy(elementData, index, elementData, index + numNew,
                    numMoved);

        System.arraycopy(a, 0, elementData, index, numNew);
        size += numNew;
        return numNew != 0;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

        elementData = new Object[0];
    }

    @Override
    public T get(int index) {
        return arr[index];
    }

    @Override
    public T set(int index, T element) {
        return arr[index] = element;
    }

    @Override
    public void add(int index, T element) {

        T[] b = new T[size() + 1];

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {

        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elementData[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elementData[i]))
                    return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {

        if (o == null) {
            for (int i = size - 1; i >= 0; i--)
                if (elementData[i] == null)
                    return i;
        } else {
            for (int i = size - 1; i >= 0; i--)
                if (o.equals(elementData[i]))
                    return i;
        }
        return -1;
    }

    @Override
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

}
