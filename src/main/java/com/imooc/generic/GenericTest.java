package com.imooc.generic;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;


public class GenericTest {
    public static void main(String[] args) {

        /**
         * 泛型类
         */
        List<String> stringArrayList = new ArrayList<String>();
        List<Integer> integerArrayList = new ArrayList<Integer>();

        Class classStringArrayList = stringArrayList.getClass();
        Class classIntegerArrayList = integerArrayList.getClass();

        if (classStringArrayList.equals(classIntegerArrayList)) {
            System.out.println("泛型测试:泛型相同");
        } else {
            System.out.println("泛型测试:泛型不同");
        }
        /**
         *
         //泛型的类型参数只能是类类型（包括自定义类），不能是简单类型
         //传入的实参类型需与泛型的类型参数类型相同，即为Integer.
         */

        System.out.println("~~~~~~~~~~~~~~~");
        /**/
        Generic<Integer> integerGeneric = new Generic<>(123);
        System.out.println(integerGeneric.getKey());
        Generic<String> stringGeneric = new Generic<>("keyTest");
        System.out.println(stringGeneric.getKey());
        Generic<Float> floatGeneric = new Generic<>(123.f);
        floatGeneric.setkey(555.f);
        stringGeneric.setkey("qqqq");
        System.out.println(stringGeneric.getKey());
        System.out.println(floatGeneric.getKey());

        /**
         * 定义泛型类型, 不一定传入泛型参数<>
         */
        Generic generic1 = new Generic("111");
        Generic generic2 = new Generic(123);
        Generic generic3 = new Generic(false);
        System.out.println(generic1.getKey());
        System.out.println(generic2.getKey());
        System.out.println(generic3.getKey());

        System.out.println("~~~~~~~~~~~~~~~");
        /**/
        /**
         * 泛型接口
         */
        FruitGenerator fruitGenerator = new FruitGenerator();
        System.out.println(fruitGenerator.next());

        NumGenerator numGenerator = new NumGenerator();
        System.out.println(numGenerator.next());


    }
}

