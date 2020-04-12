package com.shadow.model.singleton;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
// 懒汉式（线程不安全）
public class Singleton03 {

    private static Singleton03 instance;

    // 1. 私有构造器，禁止外部new
    private Singleton03(){

    }

    // 2.提供外部获取实例的方法,方法调用的时候才初始化
    public static Singleton03 getInstance(){
        if(instance == null){
            instance = new Singleton03();
        }
        return instance;
    }

}
