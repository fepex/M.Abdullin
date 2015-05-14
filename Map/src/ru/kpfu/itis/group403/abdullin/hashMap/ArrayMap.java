package ru.kpfu.itis.group403.abdullin.hashMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;


public class ArrayMap<K, V> implements Map<K, V> {

    private Object[] elems;

    private int size = 0;

    public ArrayMap(int length) {

        elems = new Object[length];

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
    public boolean containsKey(Object key) {


        return false;
    }

    @Override
    public boolean containsValue(Object value) {

        return false;
    }

    @Override
    public V get(Object key) {


        return null;
    }

    @Override
    public V put(K key, V value) {

        return value;
    }

    @Override
    public V remove(Object key) {


        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

        for (Entry<? extends K, ? extends V> entry : m.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }

    }

    @Override
    public void clear() {

        size = 0;
        elems = new Object[elems.length];

    }


    @Override
    public Set<K> keySet() {

        return null;
    }


    @Override
    public Collection<V> values() {

        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {

        return null;
    }

    private int getIndex(Object key) {
        return key.hashCode() % elems.length;
    }


}
