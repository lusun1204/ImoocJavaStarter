package com.imooc.List;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {
    public static void main(String[] args) {
        Notice notice1 = new Notice(1, "欢迎来到慕课网", "管理员", new Date());
        Notice notice2 = new Notice(2, "请同学按时交作业", "老师", new Date());
        Notice notice3 = new Notice(3, "考勤通知", "老师", new Date());

        //添加公告
        ArrayList noticeList = new ArrayList();
        noticeList.add(notice1);
        noticeList.add(notice2);
        noticeList.add(notice3);

        //show notice
        System.out.println("this notice content: ");
        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println(i + 1 + ":" + ((Notice) (noticeList.get(i))).getTitle());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //add new notice before the first notice
        Notice notice4 = new Notice(4, "在线编辑可以使用了", "管理员", new Date());
        noticeList.add(1, notice4);
        System.out.println("this notice content: ");
        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println(i + 1 + ":" + ((Notice) (noticeList.get(i))).getTitle());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //删除公告
        noticeList.remove(2);
        System.out.println("this notice content: ");
        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println(i + 1 + ":" + ((Notice) (noticeList.get(i))).getTitle());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        notice4.setTitle("Java在线编辑器可以使用啦~~~~~~");
        noticeList.set(0,notice4);
        System.out.println("this notice content: ");
        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println(i + 1 + ":" + ((Notice) (noticeList.get(i))).getTitle());
        }
    }
}
