package com.imooc.generic;

/**
 * @author lusun
 */
public class Generic<T> {
    private T key;


    public T getKey() {
        return key;
    }

    public Generic(T key) {
        this.key=key;
    }

    public void setkey(T key){
        this.key=key;
    }
}
