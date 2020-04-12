package com.shadow.model.decorator;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
// 具体装饰类
public class SubDecoratorMan2 extends DecoratorMan {

    public SubDecoratorMan2(Human human) {
        super(human);
    }


    @Override
    void description() {
        System.out.println("sub2 decorator....");
        super.description();
    }
}
