package com.imooc.tel;

public interface INet {
     void message();
     void network();

    /**
     * 默认方法,无需调用interface的class override
     */
    default void connection(){
         System.out.println("this is default method");
     };

    /**
     * 静态方法
     */
    static void showStatic() {
        System.out.println("this is static method");
    }
}
