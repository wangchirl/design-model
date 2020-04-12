package com.shadow.model.singleton;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
// 静态内部类（线程安全，懒加载）
public class Singleton07 {

    private  static Singleton07 instance;

    // 1. 私有构造器，禁止外部new
    private Singleton07(){

    }

    // 2.写一个静态内部类，该类中有一个静态属性Singleton07
    private static class SingletonInstance{
        private static final Singleton07 INSTANCE = new Singleton07();
    }

    // 3.提供外部获取实例的方法
    public static Singleton07 getInstance(){
        return SingletonInstance.INSTANCE;
    }

}
