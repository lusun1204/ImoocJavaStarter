package com.imooc.set;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {
    public static void main(String[] args) {
        //创建notice的累的公告，生成3条公告
        Notice notice1 = new Notice(1,"欢迎","管理员",new Date());
        Notice notice2 = new Notice(2,"请提交作业","老师",new Date());
        Notice notice3 = new Notice(3,"考勤通知","老师",new Date());

        //添加公告
        ArrayList ar = new ArrayList();
        ar.add(notice1);
        ar.add(notice2);
        ar.add(notice3);

        //显示公告
        System.out.println("公告的内容为：");
        for (int i =0;i<ar.size();i++){
            System.out.println((i+1)+":"+((Notice)ar.get(i)).getTitle());
        }
    }

}
