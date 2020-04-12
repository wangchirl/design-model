package com.shadow.model.template;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
// 抽象类
public abstract class TemplateClass {

    // 模板方法，make，模板方法可以做成final，不让子类去覆盖
    final void make() {

        stepOne();
        if (hook()) {
            stepTwo();
        }
        stepThird();
        stepFourth();

    }

    // 步骤1
    void stepOne() {
        System.out.println("first step...");
    }

    // 步骤2
    abstract void stepTwo();

    // 步骤3
    abstract void stepThird();

    // 步骤4
    abstract void stepFourth();


    // 钩子方法
    public boolean hook() {
        return true;
    }

}
