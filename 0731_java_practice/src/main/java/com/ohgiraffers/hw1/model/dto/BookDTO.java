package com.ohgiraffers.hw1.model.dto;

public class BookDTO {

    private int number;
    private String title;
    private int category;
    private String author;

    public BookDTO(int number, String title, int category, String author) {
        this.number = number;
        this.title = title;
        this.category = category;
        this.author = author;
    }

    public int getNumber() {
        return number;
    }
    public String getTitle() {
        return title;
    }
    public int getCategory() {
        return category;
    }
    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        String cStr = "";
        switch (category){
            case 1 :
                cStr = "인문";
                break;
            case 2 :
                cStr = "자얀과학";
                break;
            case 3 :
                cStr = "의료";
                break;
            case 4 :
                cStr = "기타";
                break;
        };
        return number + "번 제목 : " + title + "장르 : " + cStr + "저자" + author;
    }

}
