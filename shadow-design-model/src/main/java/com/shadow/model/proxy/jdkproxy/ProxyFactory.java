package com.shadow.model.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
// 代理工厂
public class ProxyFactory {

    // 被代理对象
    private Object target;

    // 构造方法，初始化被代理对象
    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 给目标对象生成代理对象

    /**
     * public static Object newProxyInstance(ClassLoader loader,
     *                                           Class<?>[] interfaces,
     *                                           InvocationHandler h)
     *
     * 1. ClassLoader loader 类加载器
     * 2. Class<?>[] interfaces 接口集合
     * 3. InvocationHandler h 业务处理，执行目标对象的方法时会被调用
     */
    Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("JDK动态代理开始...");
                        Object res = method.invoke(target, args);
                        System.out.println("JDK动态代理结束...");
                        return res;
                    }
                }
        );
    }

}
