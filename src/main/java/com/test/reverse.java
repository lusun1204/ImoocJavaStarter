package com.test;

import org.apache.logging.log4j.util.Strings;

public class reverse {
    public static String reverse(String s) {
//        String s1=null;
//        for (int n = s.length()-1; n >= 0; n--) {
//                  s1 = String.valueOf(s.charAt(n));
//                  String s2="";
//                  s2.concat(s1);
//                  //return s1;
//        }
//        return s1;
        String s2="哈哈";
        for (int i = 0; i<s.length();i++){
            s2=s.charAt(i)+s2;
        }
        return s2;
    }

    public static void main(String[] args) {
        System.out.println("abc".length());
        System.out.println(reverse("abc"));
    }
}
