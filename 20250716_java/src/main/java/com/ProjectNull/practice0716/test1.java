package com.ProjectNull.practice0716;

public class test1 {

    public static void main(String[] args) {



        /*4.*/
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;

        System.out.println("두 수 중 큰 수는 " + max + "입니다.");


        /* 5. */

        int score = 80;

        String result = (score >= 60) ? "합격입니다~~!!!" : "아쉽지만 불합격입니다…";
        System.out.println(result);


        /* 6. */


       int num =5;
        String result1 = (num%2 == 0) ? "입력하신 수는 짝수입니다" : "홀수입니다.";

        System.out.println(result1);


    }


}
