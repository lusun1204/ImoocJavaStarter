package com.imooc.generic.lession2;

public class TwoNumGeneric<K, V> {
    private K num1;
    private V num2;

    public void genNum(K num1, V num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(K num1) {
        this.num1 = num1;
    }

    public K getNum1() {
        return num1;
    }

    public void setNum2(V num2) {
        this.num2 = num2;
    }

    public V getNum2() {
        return num2;
    }

    public static void main(String[] args) {
        TwoNumGeneric<Integer, Float> twoNumGeneric = new TwoNumGeneric<>();
//        twoNumGeneric.genNum(123,123f);
        twoNumGeneric.setNum1(222);
        twoNumGeneric.setNum2(223f);
        System.out.println(twoNumGeneric.getNum1());
        System.out.println(twoNumGeneric.getNum2());

    }
}
