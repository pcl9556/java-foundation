package com.projectnull.hw1.model.compartor;

import com.projectnull.hw1.model.dto.BookDTO;

import java.util.Comparator;

public class DescCategory implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO b1, BookDTO b2) {
        return b2.getCategory() - b1.getCategory(); // 내림차순 정렬
    }
}
