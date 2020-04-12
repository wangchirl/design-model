package com.shadow.model.protoype;

import com.shadow.model.protoype.deepclone.DeepCloneableTarget;
import com.shadow.model.protoype.deepclone.DeepProtoType;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom","red",1);
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep1 == sheep2); // false
        System.out.println(sheep1 == sheep3); // false
        // 1.浅拷贝[引用类型的没有进行拷贝]
        sheep.child = new Sheep("jerry","black",2);
        Sheep clone4 = (Sheep) sheep.clone();
        Sheep clone5 = (Sheep) sheep.clone();
        System.out.println(clone4.child.hashCode());
        System.out.println(clone5.child.hashCode());
        // 2.深拷贝[引用类型也进行拷贝]
        DeepProtoType d = new DeepProtoType();
        d.setName("松江");
        d.setTarget(new DeepCloneableTarget("测试1","测试1的类"));

        // 2.1 clone方式
        DeepProtoType d2 = (DeepProtoType) d.clone();
        System.out.println(d.getTarget().hashCode());
        System.out.println(d2.getTarget().hashCode());

        // 2.2 序列化方式
        DeepProtoType d3 = (DeepProtoType) d.deepClone();
        System.out.println(d3.getTarget().hashCode());

    }
}
