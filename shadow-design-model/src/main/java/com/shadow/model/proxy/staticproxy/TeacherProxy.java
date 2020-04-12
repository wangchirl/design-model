package com.shadow.model.proxy.staticproxy;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
// 代静态理类
public class TeacherProxy implements ITeacherDao {

    // 目标对象，提高接口来聚合
    private ITeacherDao target;

    // 构造器传入代理对象
    public TeacherProxy(ITeacherDao target) {
        this.target = target;
    }

    public void teach() {
        System.out.println("静态代理开始...");
        target.teach();
        System.out.println("静态代理结束...");
    }
}
