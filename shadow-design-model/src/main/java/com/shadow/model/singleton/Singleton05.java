package com.shadow.model.singleton;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
// 懒汉式（线程不安全,同步代码块）
public class Singleton05 {

    private static Singleton05 instance;

    // 1. 私有构造器，禁止外部new
    private Singleton05(){

    }

    // 2.提供外部获取实例的方法,方法调用的时候才初始化
    public static Singleton05 getInstance(){
        if(instance == null){
            synchronized (Singleton05.class){
                instance = new Singleton05();
            }
        }
        return instance;
    }

}
