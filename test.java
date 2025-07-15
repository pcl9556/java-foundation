package com.ohgiraffers.section5.typecasting;

public class test {
    public static void main(String[] args) {

        /*1번문제*/
        System.out.println(20+30);
        System.out.println(20-30);
        System.out.println(20*30);
        System.out.println(20/30);
        System.out.println(20%30);


        /*2번문제*/
        double widthSquare = 12.5;
        double heightSquare = 36.4;

        double area = widthSquare * heightSquare;
        double circumference = (widthSquare + heightSquare)*2;

        System.out.println(area);
        System.out.println(circumference);



        /*3번문제*/
        double koreaScore = 80.5;
        double mathScore = 50.6;
        double englishScore = 70.8;

        double totalScore = koreaScore + mathScore + englishScore;
        double average = totalScore/3;

        System.out.println("총점 :" + (int) totalScore);
        System.out.println("평균 :"+  (int) average);
    }
}
