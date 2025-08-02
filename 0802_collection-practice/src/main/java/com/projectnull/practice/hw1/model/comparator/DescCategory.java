package com.projectnull.practice.hw1.model.comparator;


import com.projectnull.practice.hw1.model.dto.BookDTO;

import java.util.Comparator;

public class DescCategory implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o2.getCategory() - o1.getCategory();
    }
}
