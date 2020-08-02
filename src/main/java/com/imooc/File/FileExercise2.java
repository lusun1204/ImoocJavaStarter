package com.imooc.File;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExercise2 {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Lu_Win10\\IdeaProjects\\immocjavastarter\\src\\main\\java\\com\\imooc\\File\\speech.txt");
            int n = fileInputStream.read();
            System.out.print("文本内容:");
            int count = 0;
            while (n != -1) {
                System.out.print((char) n);
                n = fileInputStream.read();
                count++;
            }
            System.out.println();
            System.out.println("统计结果:speech.txt文件中共有" + count+"个字节");

            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
