package com.shadow.model.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
// cglib 代理工厂
public class CglibProxyFactory implements MethodInterceptor {

    // 被代理对象
    private Object target;

    // 构造器注入被代理对象
    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    // 返回target代理对象
    public Object getProxyInstance() {
        // 1.创建一个工具类
        Enhancer enhancer = new Enhancer();
        // 2.设置父类
        enhancer.setSuperclass(target.getClass());
        // 3. 设置回调函数
        enhancer.setCallback(this);
        // 4.创建子类对象，即代理对象
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] agrs, MethodProxy methodProxy) throws Throwable {

        System.out.println("cglib动态代理开始...");
        Object res = method.invoke(target, agrs);
        System.out.println("cglib动态代理结束...");
        return res;
    }
}
