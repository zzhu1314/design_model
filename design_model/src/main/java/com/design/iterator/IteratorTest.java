package com.design.iterator;

public class IteratorTest {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.appendBook(new Book("语文"));
        bookShelf.appendBook(new Book("数学"));
        bookShelf.appendBook(new Book("英语"));
        bookShelf.appendBook(new Book("体育"));

        Iterator iterator = bookShelf.iterator();
        while (iterator.hashNext()){
            Book book = (Book) iterator.next();
            System.out.println(book);
        }
    }
}
