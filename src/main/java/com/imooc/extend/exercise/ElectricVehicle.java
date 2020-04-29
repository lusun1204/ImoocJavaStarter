package com.imooc.extend.exercise;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ElectricVehicle extends NonMotor {
    // 私有属性：电池品牌
    private String batteryBrand;
    // 公有的get***/set***方法完成属性封装

    // 重写运行方法，描述内容为：这是一辆使用**牌电池的电动车。其中**的数据由属性提供
    @Override
    public String work() {
        String str = "这是一辆使用" + this.getBatteryBrand() + "牌电池的电动车，" + "其中**的数据由属性提供";
        return str;
    }
}

