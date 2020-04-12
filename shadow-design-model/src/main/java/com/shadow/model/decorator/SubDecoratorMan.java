package com.shadow.model.decorator;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
// 具体装饰类
public class SubDecoratorMan extends DecoratorMan {

    public SubDecoratorMan(Human human) {
        super(human);
    }


    @Override
    void description() {
        System.out.println("sub decorator....");
        super.description();
    }
}
