//package com.jvm;
//
//public class ThreadLocalTest {
//    public static ThreadLocal<String> threadLocal = new ThreadLocal<>();
//    public static void main(String[] args) {
//        Thread thread_1=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                threadLocal.set("-------thread_1-------");
//                Print("thread_1");
//                System.out.println("thread_1 after remove:"+threadLocal.get());
//            }
//        });
//        Thread thread_2=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                threadLocal.set("-------thread_2-------");
//                Print("thread_2");
//                System.out.println("thread_2 after remove:"+threadLocal.get());
//            }
//        });
//        thread_1.start();
//        thread_2.start();
//    }
//    public static void Print(String name)
//    {
//        System.out.println(name+"："+threadLocal.get());
//        threadLocal.remove();
//    }
//    public void set(T value)
//    {
//        //获取当前线程
//        Thread t = Thread.currentThread();
//        //将当前线程当作key，去查找相应的本地变量threadLocals
//        ThreadLocalMap map  = getMap(t);
//        //如果map不为空，说明不是第一次调用set方法
//        if(map!=null)
//        {
//            map.set(this,value);
//        }
//        //如果为空，要先创建当前线程的threadLocals变量
//        else
//            createMap(t,value);
//    }
//    public T get()
//    {
//        //获取当前线程
//        Thread t = Thread.currentThread();
//        //将当前线程当作key，去查找相应的本地变量threadLocals
//        ThreadLocalMap map  = getMap(t);
//        //如果map不为空，说明不是第一次调用get方法
//        if(map!=null)
//        {
//            ThreadLocalMap.Entry e = map.getEntry(this);
//            if(e!=null)
//            {
//                T result = (T)e.value;
//                return result;
//            }
//        }
//        //如果为空，初始化threadLocals
//        else
//            return setInitialValue();
//    }
//    private T setInitialValue() {
//        T value = null;
//        set(value);
//        return null;
//    }
//    public ThreadLocalMap getMap(Thread t)
//    {
//        return t.threadLocals;
//    }
//    public void createMap(Thread t,T value)
//    {
//        t.threadLocals=new ThreadLocalMap(this,value);
//    }
//}
