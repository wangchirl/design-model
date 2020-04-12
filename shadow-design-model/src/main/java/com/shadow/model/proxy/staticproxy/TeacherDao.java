package com.shadow.model.proxy.staticproxy;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
// 实现类
public class TeacherDao implements ITeacherDao {
    public void teach() {
        System.out.println("teacher teaching....");
    }
}
