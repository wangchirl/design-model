package com.shadow.model.singleton;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
// 懒汉式（线程安全,同步方法）
public class Singleton04 {

    private static Singleton04 instance;

    // 1. 私有构造器，禁止外部new
    private Singleton04(){

    }

    // 2.提供外部获取实例的方法,方法调用的时候才初始化
    public static synchronized Singleton04 getInstance(){
        if(instance == null){
            instance = new Singleton04();
        }
        return instance;
    }

}
