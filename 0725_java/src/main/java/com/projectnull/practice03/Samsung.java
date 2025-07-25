package com.projectnull.practice03;

public abstract class Samsung {

    private int cold;
    private static int freeze;

    public Samsung() {}

    public void cold() {

        System.out.println("냉장고는 차갑다");
    }

    public static void freeze() {

        System.out.println("냉장고는 얼린다.");
    }

    public abstract void tv();
}
