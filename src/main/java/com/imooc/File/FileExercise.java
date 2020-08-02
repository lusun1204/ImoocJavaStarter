package com.imooc.File;

import java.io.File;
import java.io.IOException;

public class FileExercise {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\Downloads\\Monday.docx";
        File file = new File(filePath);
        file.createNewFile();
        if(file.exists()){
            System.out.println("创建成功");
            System.out.println(file.getName());
            System.out.println(file.getParentFile());

        }
        if(file.isDirectory()){
            System.out.println("这是一个目录");
        }else if(file.isFile()) {
            System.out.println("这个一个文件");
        }
        System.out.println(file.canRead());
    }
}
