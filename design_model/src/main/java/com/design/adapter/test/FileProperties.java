package com.design.adapter.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO {
    public Properties properties;
    public FileProperties(Properties properties){
        this.properties = properties;
    }
    public void readFromFile(String fileName) throws IOException {
        properties.load(new FileInputStream(fileName));
    }

    public void writeToFile(String fileName) throws IOException {
        properties.store(new FileOutputStream(fileName),"测试适配器");
    }

    public void setValue(String key, String value) {
        properties.setProperty(key,value);
    }

    public String getValue(String key) {
        return properties.getProperty(key);
    }
}
