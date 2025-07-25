package com.projectnull.practice0725;

public class Strawberry extends Fruit{

    @Override
    public void color() {
        System.out.println("과일의 색은 빨간색입니다.");
    }

    @Override
    public void season() {
        System.out.println("과일의 게절은 겨울입니다.");
    }

    @Override
    public void classification() {
        System.out.println("과일의 분류는 장과류 입니다.");
    }

    public void vegetable(){
        System.out.println("딸기는 채소류로 분류합니다.");
    }
}
