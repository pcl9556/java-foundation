package com.projectnull.practice2;

public class Fruit implements InterFruit {

    private String taste;

    @Override
    public void taste (String taste) {
        this.taste = taste;
        System.out.print("과일의 맛은 ");

        System.out.println(this.taste);

    }




}
