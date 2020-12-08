package com.design.adapter.extend;

/**
 * 被适配的对象（Adaptee）
 */
public class Banner {

    private String name;

    public Banner(String name) {
        this.name = name;
    }

    public void showWithParen() {
        System.out.println("("+name+")");
    }
    public void showWithAster(){
        System.out.println("*"+name+"*");
    }
}
