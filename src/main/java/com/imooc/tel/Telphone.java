package com.imooc.tel;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Telphone {
    private String brand;
    private int price;

    public void call(){
        System.out.println("手机可以打电话");
    }
}
