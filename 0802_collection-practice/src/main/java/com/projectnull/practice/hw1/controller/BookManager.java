package com.projectnull.practice.hw1.controller;

import com.projectnull.practice.hw1.model.comparator.AscCategory;
import com.projectnull.practice.hw1.model.comparator.DescCategory;
import com.projectnull.practice.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookManager {

    //도서를 ArrayList에 저장, 실제 작업 수행.....
    //ArrayList.......

    private ArrayList<BookDTO> bookList;

    public BookManager() {
        bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book) {
        bookList.add(book);
    }

    public void deleteBook(int index) {
        //index가 리스트 안에 있는지 확인
        if (index >= 0 && index < bookList.size()) {
            bookList.remove(index);
        }
    }

    public int searchBook(String title) {
        for (int i = 0; i < bookList.size(); i++) {  //향상된 for문!!!
            if (bookList.get(i).getTitle().equals(title)) {  //bookList에 있는 i번째 책의 제목과 사용자가 입력한 title을 같은지 비교
                                         //문자열 비교!!!!!!
                return i;
            }
        }
        return -1;
    }

    public void printBook(int index) {
        if (index >= 0 && index < bookList.size()) {
            //try-catch 쓸 수 있는데 잘 모르겠음.....
            System.out.println(bookList.get(index));
        }
    }

    public void displayAll() {
        if (bookList.isEmpty()) {
            System.out.println("출력할 도서가 없습니다.");
        } else {
            for (BookDTO book : bookList) {
                System.out.println(book);
            }
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {
        ArrayList<BookDTO> sortedList = new ArrayList<>(bookList);  //복사 비슷함......

        Comparator<BookDTO> comparator = null;

        if (select == 1) {  // 1 선택하면 오름차순
            comparator = new AscCategory();
        } else if (select == 2) {   // 2선택하면 내림차순
            comparator = new DescCategory();
        }

        if (comparator != null) {
            Collections.sort(sortedList, comparator);
        }

        return sortedList;
    }

    public void printBookList(ArrayList<BookDTO> list) {
        for (BookDTO book : list) {
            System.out.println(book);
        }
    }

    //리스트에 아무것도 없으면 isEmpty, 있으면 displayAll
    //책 있냐? 없냐?
    public boolean isEmpty() {
        return bookList.isEmpty();
    }
}
