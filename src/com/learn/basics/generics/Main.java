package com.learn.basics.generics;

class Generic<T> {
    private T obj;

    public Generic(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public String getName() {
        return obj.getClass().getName();
    }
}

class DoubleGeneric<T, V> {
    private T obj1;
    private V obj2;

    public DoubleGeneric(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public V getObj2() {
        return obj2;
    }

    public String getName() {
        return obj1.getClass().getName() + ", " + obj2.getClass().getName();
    }
}

public class Main {
    public static void main(String[] args) {
        DoubleGeneric<Integer, Integer> nums = new DoubleGeneric<>(10, 15);
        DoubleGeneric<String, String> words = new DoubleGeneric<>("Hello", "World");

        System.out.println(nums.getName());
        int sum = nums.getObj1() + nums.getObj2();
        System.out.println("Result: " + sum);

        String res = words.getObj1() + ", " + words.getObj2() + "!";
        System.out.println(res);

    }
}
