package com.shadow.model.proxy.cglibproxy;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
// 实现类 - 非接口
public class TeacherDao extends AbstractTeacherDao {
    public String teach(String name) {
        System.out.println("teacher teaching..." + name);
        return "success";
    }
}
