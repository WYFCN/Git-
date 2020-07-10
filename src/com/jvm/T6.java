package com.jvm;

import sun.misc.Launcher;

public class T6 {
    public static void main(String[] args) throws ClassNotFoundException, InterruptedException, IllegalAccessException, InstantiationException {
        System.out.println(ClassLoader.class.getClassLoader());
        System.out.println(Launcher.class.getClassLoader());
    }
}
