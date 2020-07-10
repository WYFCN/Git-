package com.jvm;

public class T1 {
    public static void main(String[] args) {
        System.out.println(Child.x);
    }
}
class Parent{
    public static int x=5;
    static {
        System.out.println("Paraent.........");
    }
}
class Child extends Parent{
    public static int y=4;
    static {
        System.out.println("Child..........");
    }
}
