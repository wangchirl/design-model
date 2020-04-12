package com.shadow.model.singleton;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
// 饿汉式（静态变量）
public class Singleton01 {

    // 1. 私有构造器，禁止外部new
    private Singleton01(){

    }

    // 2.本类内部创建对象实例
    private final static Singleton01 instance = new Singleton01();

    // 3.提供外部获取实例的方法
    public static Singleton01 getInstance(){
        return instance;
    }

}
