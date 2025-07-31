package com.projectnull.hw1.model.compartor;

import com.projectnull.hw1.model.dto.BookDTO;

import java.util.Comparator;

public class AscCategory implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO b1, BookDTO b2) {
        return b1.getCategory() - b2.getCategory(); // 오름차순 정렬
    }
}

