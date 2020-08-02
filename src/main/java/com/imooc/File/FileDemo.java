package com.imooc.File;

import java.io.File;
import java.io.IOException;


public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Downloads\\test.txt");

        System.out.println("文件是否存在:"+file.exists());
        if (file.exists()){
            System.out.println(file.getParentFile());
            file.createNewFile();

        }
    }
}

