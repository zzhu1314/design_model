package com.design.iterator;

public class BookShelfIterator implements Iterator<Book> {

    private BookShelf bookShelf;

    private int index;
    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
    }
    public boolean hashNext() {
       return bookShelf.getLength()>index;
    }
    public Book next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
