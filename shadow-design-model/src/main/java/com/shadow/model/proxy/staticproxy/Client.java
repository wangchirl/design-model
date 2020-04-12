package com.shadow.model.proxy.staticproxy;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
public class Client {
    public static void main(String[] args) {
        // 1.创建被代理对象
        ITeacherDao target = new TeacherDao();
        // 2.创建代理对象
        TeacherProxy proxy = new TeacherProxy(target);
        // 3.调用代理对象的方法
        proxy.teach();
    }
}
