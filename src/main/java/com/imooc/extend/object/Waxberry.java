package com.imooc.extend.object;

import lombok.Getter;
import lombok.Setter;

//要求Waxberry类不允许有子类
@Getter
@Setter
final public class Waxberry extends Fruits{
    // 私有属性：颜色（color）
    private String color;

	//创建构造方法，完成调用父类的构造方法，完成属性赋值
    Waxberry(String color,String shape,String taste){
        this.setColor(color);
        this.setShape(shape);
        this.setTaste(taste);
    }

    //创建不允许重写的face方法，描述为：杨梅：**、**，果味酸甜适中
    final void face(){
        System.out.println("杨梅:"+this.getColor()+","+this.getShape()+","+"果味"+this.getTaste());
    }

    //重写父类eat方法，描述为：杨梅酸甜适中，非常好吃！
    void eat(){
        System.out.println("杨梅酸甜适中，非常好吃！");
    }
    //重写toString方法，输出的表现形式不同（输出shape,color,taste）
    public String toString(){
        return "杨梅的信息: 果实为"+getShape()+","+getColor()+","+getTaste()+",非常好吃!";
    }
}
