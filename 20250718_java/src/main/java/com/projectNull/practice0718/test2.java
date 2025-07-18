package com.projectNull.practice0718;

import java.util.Scanner;

public class test2 {

    public void testTest() {

        //=================== 1번 문제
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum = i;
        }
        System.out.println("1부터100까지의 합은" + sum + "입니다.");


        //================2번 문제

        Scanner sc2 = new Scanner(System.in);

        System.out.println("정수를 입력하세요 :");
        int num1 = sc2.nextInt();

        int sum2 = 0;

        for (int i = 1; i <= num1; i++) {
            sum2 += i;
        }
        System.out.println(num1 +"부터" + "까지의 합" + sum2);
            }
        }
















