package com.design.adapter.aggregate;

public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner(new Banner("hello"));
        print.printWeek();
        print.printStrong();
    }
}
