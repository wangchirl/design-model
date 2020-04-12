package com.shadow.model.protoype.deepclone;

import java.io.Serializable;

/**
 * @author shadow
 * @create 2020-04-12
 * @description
 */
public class DeepCloneableTarget implements Serializable,Cloneable {


    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    // 这里使用默认的clone方法，没有引用类型，实现浅拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
