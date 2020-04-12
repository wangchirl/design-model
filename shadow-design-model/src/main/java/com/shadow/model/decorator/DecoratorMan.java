package com.shadow.model.decorator;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
// 装饰类父类
public class DecoratorMan extends Human {

    private Human human;


    public DecoratorMan(Human human) {
        this.human = human;
    }

    @Override
    void description() {
        human.description();
    }
}
