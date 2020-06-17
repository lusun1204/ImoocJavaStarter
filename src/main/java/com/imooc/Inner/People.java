package com.imooc.Inner;

public class People {
    int age;

    //获取类内部的方法
    public Heart getHeart(){
        new Heart().temp=22;
        //temp=33
        return new Heart();
    }

    public void eat(){
        System.out.println("吃东西的方法");
    }

    //内部类

    /**
     * 内部类再外部使用时，无法直接实例化，需要通过先实例化外部类，再实例化内部类实现
     * 内部类的访问修饰符任意，但访问范围会受到限制，比如在同一个class里，内部类不用加public修饰符，而跨包调用时，需要加public
     * 内部类可以直接访问外部类成员属性方法，如果有出现同名的，以内部类的属性方法为准
     * 可以使用this.关键字，访问外部类的信息；
     * 外部类访问内部类信息，无法直接访问，需要通过内部实例，无法直接访问；
     */
    class  Heart {
        int temp=11;
        public void eat(){
            System.out.println("我是内部类的eat方法");
        }
        public String beat(){
            int age=15;
            int temp=11;
            People.this.eat();
            return People.this.age+"岁的心脏在跳动";
        }
    }

}
