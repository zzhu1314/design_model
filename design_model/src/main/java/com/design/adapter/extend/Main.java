package com.design.adapter.extend;

/**
 * 客户端
 */
public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner("hello");
        print.printWeek();
        print.printStrong();
    }
}
