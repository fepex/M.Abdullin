package ru.kpfu.itsi.group403.abdullin.stack;


public interface MyStack<T> extends Iterable {


    public T pop();

    public T push(T i);

    public T peek();

    public int size();

    public boolean isEmpty();


}