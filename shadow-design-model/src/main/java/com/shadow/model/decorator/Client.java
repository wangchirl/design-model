package com.shadow.model.decorator;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
public class Client {
    public static void main(String[] args) {
        // 1.创建目标对象
        Human man = new ShadowMan();
        // 2. 创建装饰对象
        DecoratorMan decoratorMan = new DecoratorMan(new SubDecoratorMan(new SubDecoratorMan2(man)));
        decoratorMan.description();
    }
}
