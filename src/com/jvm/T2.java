package com.jvm;

public class T2 {
    public static void main(String[] args) {
        System.out.println(My_parent.str);
    }
}
class My_parent{
    public static final double str=Math.random();
    static {
        System.out.println("parent......");
    }
}
