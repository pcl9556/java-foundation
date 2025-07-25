package com.projectnull.practice2;

public class Peach extends Fruit{

    private String taste;

    @Override
    public void taste (String taste){
        this.taste = taste;
        System.out.print("복숭아는 " );

        System.out.println(this.taste);


    }
}
