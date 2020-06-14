package com.imooc.String;

public class StringTestOne {
    public static void main(String[] args) {
        String str="Hello World";
        int len=3;
        char ch = str.charAt(3);
        /*已知字符串"abcdefg"，使之经过处理得到字符串"CDE",并进一步
        将“DE”替换为“MM”，得到结果：CMM */
        String s="abcdefg";
        String s1=s.substring(2,5).toUpperCase().replaceAll("DE","MM");
        System.out.println(s1);
    }
}
