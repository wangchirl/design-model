package com.shadow.model.protoype;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
// 实现 Cloneable
// 重写 clone方法
public class Sheep implements Cloneable {

    private String name;
    private String color;
    private int age;
    // 深浅拷贝问题
    public Sheep child;

    // 克隆该实例，使用默认的clone方法来完成
    @Override
    protected Object clone(){

        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (Exception e){
            e.printStackTrace();
        }

        return sheep;
    }

    public Sheep() {
    }

    public Sheep(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
