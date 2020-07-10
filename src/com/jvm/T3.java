package com.jvm;

public class T3 {
    public static void main(String[] args) {
        System.out.println(my_child.y);
    }
}
interface my_parent{
    public static final int x=5;
}
interface my_child extends my_parent{
    public static final int y=(int)Math.random();
}
