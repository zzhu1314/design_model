package com.design.adapter.test;

import java.io.IOException;
import java.util.Properties;

/**
 * 对象适配器小练习
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileProperties fileProperties = new FileProperties(properties);
        fileProperties.readFromFile("src/main/resources/in.properties");
        System.out.println(fileProperties.getValue("year")+","+fileProperties.getValue("month")+","+fileProperties.getValue("day"));
        fileProperties.writeToFile("out.properties");
    }
}
