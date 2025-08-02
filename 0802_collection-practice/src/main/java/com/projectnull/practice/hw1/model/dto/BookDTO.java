package com.projectnull.practice.hw1.model.dto;

public class BookDTO {

    private int number;
    private String title;
    private String author;
    private int category;

    public BookDTO() {}

    //number, title, author, category 필드가지고있음
    public BookDTO(int number, String title, String author, int category) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    @Override
    public String toString() {
        String categoryStr;

        //category는 숫자로 저장, 출력 시 switch가 문자열로 바꿔줌
        //switch 어렵다..............
        switch (category) {
            case 1:
                categoryStr = "인문";
                break;
            case 2:
                categoryStr = "자연과학";
                break;
            case 3:
                categoryStr = "의료";
                break;
            case 4:
                categoryStr = "기타";
                break;
            default:
                categoryStr = "알 수 없음";
                break;
        }

        return "번호: " + number + ", 제목: " + title + ", 저자: " + author + ", 카테고리: " + categoryStr;
    }
}


