package com.design.adapter.aggregate;

/**
 * 对象适配器，集成目标类对象，并聚合了被适配对象
 * 适配器对象
 */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(Banner banner) {
        this.banner = banner;
    }

    void printWeek() {
        banner.showWithParen();
    }

    void printStrong() {
        banner.showWithAster();
    }
}
