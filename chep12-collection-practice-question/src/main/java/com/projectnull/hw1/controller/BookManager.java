package com.projectnull.hw1.controller;

import com.projectnull.hw1.model.dto.BookDTO;

import java.awt.print.Book;
import java.util.ArrayList;

public class BookManager {

    private ArrayList<BookDTO> booksList = new ArrayList<>();

    public BookManager() {
        super();
    }
    public void addBook(ArrayList<BookDTO> booksList) {
        this.booksList = booksList;
    }
    public void deleteBook(int index) {
        booksList.remove(index);
    }
    public int searchBook(String title) {
        for (int i = 0; i<booksList.size();i++) {

            return 1;
        } return -1;
    }
}
