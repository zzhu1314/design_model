package com.design.adapter.extend;

/**
 * 类适配器模式 集成被适配的对象同时实现目标对象
 * 适配器
 * 集成
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String name) {
        super(name);
    }

    public void printWeek() {
        showWithParen();
    }

    public void printStrong() {
        showWithAster();
    }
}
