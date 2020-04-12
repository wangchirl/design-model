package com.shadow.model.singleton;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
// 双重检查（DCL）- volatile 关键字禁止指令重排序
// 线程安全
public class Singleton06 {

    // volatile 关键字
    private volatile static Singleton06 instance;

    // 1. 私有构造器，禁止外部new
    private Singleton06(){

    }

    // 2.提供外部获取实例的方法,方法调用的时候才初始化
    public static Singleton06 getInstance(){
        if(instance == null){
            synchronized (Singleton06.class){
                if(instance == null){
                    instance = new Singleton06();
                }
            }
        }
        return instance;
    }

}
