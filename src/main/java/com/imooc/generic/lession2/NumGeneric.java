package com.imooc.generic.lession2;

public class NumGeneric<T> {
    private T num;
    public void setNum(T num){
        this.num=num;
    }

    public T getNum() {
        return num;
    }

    //test
    public static void main (String[] args){
        NumGeneric<Integer> intNum = new NumGeneric<>();
        intNum.setNum(10);
        System.out.println("Integer:"+intNum.getNum());

        NumGeneric<Float> floatNum = new NumGeneric<>();
        floatNum.setNum(10.11f);
        System.out.println("Float:"+floatNum.getNum());

        NumGeneric<String> stringNum = new NumGeneric<>();
        stringNum.setNum("test");
        System.out.println("String:"+stringNum.getNum());
    }
}
