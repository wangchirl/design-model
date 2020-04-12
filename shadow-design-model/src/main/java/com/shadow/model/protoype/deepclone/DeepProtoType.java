package com.shadow.model.protoype.deepclone;

import java.io.*;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
public class DeepProtoType implements Serializable, Cloneable {

    private String name;

    private DeepCloneableTarget target;

    public DeepProtoType() {
    }

    // 深拷贝 - 方式1 重写 clone 方法
    @Override
    public Object clone() {
        Object deep = null;
        try {
            // 这里完成对基本数据类型（属性）和String的克隆
            deep = super.clone();
            // 对引用类型的属性，进行单独的处理
            DeepProtoType deepProtoType = (DeepProtoType) deep;
            deepProtoType.target = (DeepCloneableTarget) target.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return deep;
    }


    // 深拷贝 - 序列化方式 推荐使用
    public Object deepClone() {

        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {

            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); // 当前这个对象以对象流的方式输出

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copy = (DeepProtoType) ois.readObject();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭流
            try {
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getTarget() {
        return target;
    }

    public void setTarget(DeepCloneableTarget target) {
        this.target = target;
    }
}
