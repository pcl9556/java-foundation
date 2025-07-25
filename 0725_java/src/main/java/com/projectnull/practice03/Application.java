package com.projectnull.practice03;

public class Application {

    public static void main(String[] args) {

        Refrigerator refrigerator = new Refrigerator();

        System.out.println(refrigerator instanceof Refrigerator);
        System.out.println(refrigerator instanceof Samsung);

        Samsung samsung = new Refrigerator();

        samsung.tv();

        samsung.cold();

        Samsung.freeze();
    }
}
