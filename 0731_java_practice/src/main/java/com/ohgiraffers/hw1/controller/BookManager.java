package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {

    private ArrayList<BookDTO> bookList;

    public BookManager() {
        bookList = new ArrayList<>();
    }
    public void addBook(BookDTO book) {
        bookList.add(book);
    }
    public void deleteBook(int index) {
        bookList.remove(index);
    }
    public int searchBook(String title) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    public void printBook(int index) {
        System.out.println(bookList.get(index));
    }
    public void displayAll() {
        for (BookDTO book : bookList) {
            System.out.println(book);
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {
        ArrayList<BookDTO> sortedList = new ArrayList<>(bookList);

        for (int i = 0; i < sortedList.size() - 1; i++) {
            for (int j = i + 1; j < sortedList.size(); j++) {
                BookDTO b1 = sortedList.get(i);
                BookDTO b2 = sortedList.get(j);

                if (select == 1 && b1.getCategory() > b2.getCategory()) {
                    // 오름차순
                    sortedList.set(i, b2);
                    sortedList.set(j, b1);
                } else if (select == 2 && b1.getCategory() < b2.getCategory()) {
                    // 내림차순
                    sortedList.set(i, b2);
                    sortedList.set(j, b1);
                }
            }
        }

        return sortedList;
    }


    public void printBookList(ArrayList <BookDTO> list) {
        for (BookDTO book : list) {
            System.out.println(book);
        }

    }
    public boolean isEmpty() {
        return bookList.isEmpty();
    }

}
