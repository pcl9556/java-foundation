package com.projectNull.practice0717;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {

        //====7번
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("양수다.");
        } else {
            System.out.println("양수가 아니다.");
        }

        //====8번
        Scanner sc1 = new Scanner(System.in);

        System.out.print("정수를 입력하세요. :");
        int num1 = sc1.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("짝수다.");
        } else {
            System.out.println("홀수다");
        }

        //====9번
        Scanner sc2 = new Scanner(System.in);

        System.out.print("월을 입력하세요 :");
        int month = sc2.nextInt();

        System.out.print("일을 입력하세요 :");
        int day = sc2.nextInt();

        if (month >= 1 && month <= 6 && day >= 1 && day <= 15) {

            System.out.println("배민쿠폰");

        } else if (month >= 7 && month <= 12 && day >= 16 && day <= 31) {

            System.out.println("스타벅스 커피");

        } else {
            System.out.println("사탕");
        }

        //====10번
        Scanner sc3 = new Scanner(System.in);

        System.out.print("나이가 어떻게 되세요?");
        int age = sc3.nextInt();

        if (age >=0 && age <= 19) {
            System.out.println("판매 불가능합니다. 음료 코너에서 골라주세요.");
        } else {
            System.out.println("판매 가능합니다");
        }

        //=====11번
        Scanner sc4 = new Scanner(System.in);

        System.out.print("당첨 번호가 어떻게 되세요?");
        int num2 = sc4.nextInt();

        if (num2 % 2 == 1) {
            System.out.println("홀수네요, 인형 선물입니다!.");
        } else if (num2 >= 0 && num2 <= 10) {
            System.out.println("짝수네요, 모자 선물입니다!.");

        } else {
            System.out.println("당첨번호는 1~10 사이에만 있어요.");
        }

        //======12번
        Scanner sc5 =new Scanner(System.in);

        System.out.print("성실 점수: ");
        int sincerity = sc5.nextInt();

        System.out.print("서비스 점수: ");
        int service = sc5.nextInt();

        System.out.print("미소 점수: ");
        int smile = sc5.nextInt();


        double average = (sincerity + service + smile) / 3.0;

        boolean isPass = true;

        if (average < 60) {
            System.out.println("평균 점수 미달로 불합격입니다.");
            isPass = false;
        }
        if (sincerity <40) {
            System.out.println("성실 점수 미달로 불합격입니다.");
            isPass = false;
        }
        if (service <40) {
            System.out.println("서비스 점수 미달로 불합격 입니다.");
            isPass = false;
        }
        if (smile <40) {
            System.out.println("미소 점수 미달로 불합격 입니다.");
            isPass = false;
        }
        if (average >= 60 && sincerity >= 40 && service >= 40 && smile >= 40) {
            System.out.println("합격입니다!");
        }

        //=========13번

    }

}
