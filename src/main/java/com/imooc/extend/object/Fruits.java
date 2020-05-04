package com.imooc.extend.object;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Fruits {
    // 私有属性：水果的形状（shape）和口感（taste）
    private String shape;
    private String taste;



	public Fruits() {

	}

	// 带参构造函数（参数为shape和taste）
    public Fruits(String shape,String taste){
	    this.shape=shape;
	    this.taste=taste;
    }


    //通过封装实现对私有属性的get/set访问



	// 创建无参无返回值得方法eat（描述内容为：水果可供人们食用！）
    void eat(){
        System.out.println("水果可供人们使用!");
    }



	// 重写equals方法，比较两个对象是否相等（比较shape，taste）

    public boolean equal(Object obj){
    if (obj==null)
        return false;
    Fruits fruits = (Fruits)obj;
    if (this.getShape().equals(fruits.getShape()) && this.getTaste()==fruits.getTaste())
        return true;
    else
        return false;
    }



}
