package com.imooc.wrapproject.wrap;

public class wrapperTestOne {
    public static void main(String[] args) {
        /**
         * 装箱
         * 把基本数据类型转换成包装类
         */
        //自动装箱
        int t1=2;
        Integer t2=t1;
        System.out.println("自动装箱的Integer值：t2="+t2);
        //手动装箱
        Integer t3 = new Integer(t1);
        System.out.println("手动装箱Integer值：t3="+t3);
        //自动拆箱
        double t6=t2.intValue();
        System.out.println("自动拆箱Integer值：t6="+t6);
        //手动拆箱
        int t5=t2;
        System.out.println("手动拆箱Integer值：t5="+t5);

    }
}
