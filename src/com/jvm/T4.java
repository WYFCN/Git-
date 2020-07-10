package com.jvm;

public class T4 {
    public static void main(String[] args) {
        Singleton s=Singleton.getInstance();
        System.out.println(s.x+" "+s.y);
    }
}
class Singleton{
    public static int x;
    private static Singleton s=new Singleton();
    private Singleton(){
        x++;
        y++;
        System.out.println(x+" "+y);
    }
    public static int y=0;
    public static Singleton getInstance(){
        return s;
    }
}
