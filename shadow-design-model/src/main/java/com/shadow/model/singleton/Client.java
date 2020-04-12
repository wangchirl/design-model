package com.shadow.model.singleton;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
public class Client {
    public static void main(String[] args) {
        // 1.饿汉式（静态变量）;
        Singleton01 instance1 = Singleton01.getInstance();
        Singleton01 instance2 = Singleton01.getInstance();
        System.out.println(instance1 == instance2);
        // 2.饿汉式（静态代码块）
        Singleton02 instance3 = Singleton02.getInstance();
        Singleton02 instance4 = Singleton02.getInstance();
        System.out.println(instance3 == instance4);
        // 3.懒汉式（线程不安全）
        Singleton03 instance5 = Singleton03.getInstance();
        Singleton03 instance6 = Singleton03.getInstance();
        System.out.println(instance5 == instance6);
        // 4.懒汉式（线程安全，同步方法）
        Singleton04 instance7 = Singleton04.getInstance();
        Singleton04 instance8 = Singleton04.getInstance();
        System.out.println(instance7 == instance8);
        // 5.懒汉式（线程不安全，同步代码块）
        Singleton05 instance9 = Singleton05.getInstance();
        Singleton05 instance10 = Singleton05.getInstance();
        System.out.println(instance9 == instance10);
        // 6.双重检查（线程安全）
        Singleton06 instance11 = Singleton06.getInstance();
        Singleton06 instance12 = Singleton06.getInstance();
        System.out.println(instance11 == instance12);
        // 7.静态内部类（线程安全，懒加载）
        Singleton07 instance13 = Singleton07.getInstance();
        Singleton07 instance14 = Singleton07.getInstance();
        System.out.println(instance13 == instance14);
        // 8.枚举
        Singleton08 instance15 = Singleton08.INSTANCE;
        Singleton08 instance16 = Singleton08.INSTANCE;
        System.out.println(instance15 == instance16);
    }
}
