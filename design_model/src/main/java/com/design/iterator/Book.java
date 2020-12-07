package com.design.iterator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public Book() {
    }
}
