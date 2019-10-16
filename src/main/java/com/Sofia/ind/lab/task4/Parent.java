package com.Sofia.ind.lab.task4;

public abstract class Parent {
    int a=1;

    public abstract void print();

    public static void main(String[] args) {
        new Child().print();
    }
}
