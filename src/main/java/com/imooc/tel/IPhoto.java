package com.imooc.tel;

/**
 * 接口，描述不同的行为具有相似的行为特征
 */
public interface IPhoto {
    //具有拍照能力
    void photo();
    default void surface(){
        System.out.println("我是接口原始的default_surface方法");
    };
}
