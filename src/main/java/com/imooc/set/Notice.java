package com.imooc.set;

import lombok.Data;

import java.util.Date;

@Data
public class Notice {
    private int id;
    private String title;
    private String creator;
    private Date createTime;

    Notice(){

    }
    Notice(int id,String title,String creator,Date createTime){
        this.id=id;
        this.title=title;
        this.creator=creator;
        this.createTime=createTime;


    }
}
