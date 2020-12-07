package com.design.iterator;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的集合----书架
 */
@Getter
@NoArgsConstructor
public class BookShelf implements Aggregate {

    /**
     * 书
     */
    //private Book[] books;

    private List<Book> books;
    /**
     * 最后一本书的坐标
     */
    private int last = 0;

    /*public BookShelf(int max){
        this.books = new Book[max];
    }*/
    public BookShelf(int size) {
        this.books = new ArrayList<Book>(size);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        //books[last] = book;
        books.add(book);
        last++;
    }

    public int getLength() {
        return last;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }


}
