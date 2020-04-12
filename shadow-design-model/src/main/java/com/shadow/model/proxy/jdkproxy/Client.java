package com.shadow.model.proxy.jdkproxy;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
public class Client {
    public static void main(String[] args) {
        // 1. 创建被代理对象
        ITeacherDao target = new TeacherDao();
        // 2. 使用代理工厂获取代理对象
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        // 3. 调用代理对象方法
        String res = proxyInstance.teach();
        System.out.println("res = " + res);
    }
}
