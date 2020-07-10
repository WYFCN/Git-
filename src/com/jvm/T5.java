package com.jvm;

public class T5 {
    public static void main(String[] args) throws ClassNotFoundException {
//        ClassLoader loader = ClassLoader.getSystemClassLoader();
//        Class<?> aClass = loader.loadClass("com.jvm.C");
//        System.out.println(aClass);
//        System.out.println("-----------");
//        Class<?> aClass1 = Class.forName("com.jvm.C");
//        System.out.println(aClass);
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        System.out.println(loader);
        while(loader!=null)
        {
            ClassLoader cl = loader.getParent();
            System.out.println(cl);
            loader=cl;
        }
    }
}
class C{
    static {
        System.out.println("构造方法.....");
    }
}
