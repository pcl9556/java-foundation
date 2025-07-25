package com.projectnull.practice0725;

public class Peach extends Fruit{

    @Override
    public void color() {
        System.out.println("과일의 색은 분홍색입니다.");
    }

    @Override
    public void season() {
        System.out.println("과일의 게절은 여름입니다.");
    }

    @Override
    public void classification() {
        System.out.println("과일의 분류는 핵과류 입니다.");
    }

    public void allergy() {
        System.out.println("복숭아 털 알러지 가능성 있습니다.");
    }
}
