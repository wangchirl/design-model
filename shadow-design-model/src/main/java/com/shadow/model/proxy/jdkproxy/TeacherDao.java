package com.shadow.model.proxy.jdkproxy;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
// 接口实现类
public class TeacherDao implements ITeacherDao{
    public String teach() {
        System.out.println("teacher teaching...");
        return "sucess";
    }
}
