package com.projectNull.practice0718;

import java.util.Scanner;

public class test3 {

    public void testTest() {

        //===============3번 문제

        Scanner sc = new Scanner(System.in);
        System.out.println("7단");
        int gugu = sc.nextInt();
        int i = 1;
        while (i <= 9) {
            System.out.println("7 x " + i + " = " + (7 * i));
            i++;
        }


        //=================4번 문제

        Scanner sc2 = new Scanner(System.in);
        System.out.println("정수를 입력하세요 :");

        int num = sc2.nextInt();

        int i2 = 1;
        while (i2 <= num) {
            if (i2 % 2 == 0) {
                System.out.println(i2);
            }
            i2++;
        }

        //=============5번문제

        Scanner sc3 = new Scanner(System.in);
        System.out.println("문자열 입력 :");
        String str = sc3.nextLine();

        int index = 0;
        while (index < str.length()) {
            char ch = str.charAt(index);

            System.out.println(index + ":" + ch);

            index++;
        }

        //=============6번 문제

        Scanner sc4 = new Scanner(System.in);
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch);
                }

        //================7번 문제

        Scanner sc5 = new Scanner(System.in);

        int i3 = 1;




        System.out.println("정수를 입력하세요 : ");



        //==============내가 만든 문제

        /* 1부터 10까지의 정수 중 하나를 입력받아, 입력 숫자 이하의 홀수를 반복문을 사용해 구구단으로 출력하세요!

        ========출력 예시 =======
        3 x 1 = 3
        3 x 2 = 6
        3 x 3 = 9
        .
        .
        .
        .
        3 x 9 = 27

        *  */




            }
        }






