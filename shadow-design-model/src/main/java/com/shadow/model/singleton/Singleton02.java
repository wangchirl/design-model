package com.shadow.model.singleton;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
// 饿汉式（静态代码块）
public class Singleton02 {

    // 1. 私有构造器，禁止外部new
    private Singleton02(){

    }

    // 2.对象定义
    private static Singleton02 instance;

    // 在静态代码块中创建单例对象
    static {
        instance = new Singleton02();
    }

    // 3.提供外部获取实例的方法
    public static Singleton02 getInstance(){
        return instance;
    }

}
