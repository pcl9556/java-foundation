package com.projectnull.practice2;

public class Apple extends Fruit{

    private String taste;

    @Override
    public void taste(String taste) {
        this.taste= taste;
        System.out.print("사과는 ");

        System.out.println(this.taste);
    }
}
