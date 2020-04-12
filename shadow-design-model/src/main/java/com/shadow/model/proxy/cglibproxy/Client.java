package com.shadow.model.proxy.cglibproxy;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 * 1. 目标对象没有实现接口使用 cglib 代理，也可以不显示继承父类
 * 2. jdk代理必须实现接口
 * 3. cglib代理的类不能是final类，代理的方法不能是final/static的
 * 4. cglib需要引入cglib相关依赖
 * 5. 需要实现接口 MethodInterceptor重写 intercept方法
 */
public class Client {

    public static void main(String[] args) {
        // 1.创建被代理对象
        TeacherDao target = new TeacherDao();
        // 2.获取代理对象
        TeacherDao proxyInstance = (TeacherDao) new CglibProxyFactory(target).getProxyInstance();
        // 3.执行代理对象的方法
        String res = proxyInstance.teach("张三");
        System.out.println("res = " + res);

    }
}
