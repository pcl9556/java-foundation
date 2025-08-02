package com.projectnull.practice.hw1.model.comparator;

import com.projectnull.practice.hw1.model.dto.BookDTO;

import java.util.Comparator;

public class AscCategory implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o1.getCategory() - o2.getCategory();  //숫자 작은게 앞으로
    }
}
