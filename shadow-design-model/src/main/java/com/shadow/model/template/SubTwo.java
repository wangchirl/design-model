package com.shadow.model.template;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
public class SubTwo extends TemplateClass {

    void stepTwo() {
        System.out.println("SubTwo...stepTwo");
    }

    void stepThird() {
        System.out.println("SubTwo...stepThird");
    }

    void stepFourth() {
        System.out.println("SubTwo...stepFourth");
    }

    // 重写钩子方法

    @Override
    public boolean hook() {
        return false;
    }
}
