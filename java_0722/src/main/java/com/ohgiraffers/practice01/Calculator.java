package com.ohgiraffers.practice01;

public class Calculator {

    public void checkMethod() {
        System.out.println("메소드 호출 확인");
    }

    // 1부터 10까지의 합 리턴
    public int sum1to10() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    // 두 수 중 큰 수 출력
    public void checkMaxNumber(int a, int b) {
        int max = (a > b) ? a : b;
        System.out.println("두 수 중 큰 수는 " + max + "이다.");
    }

    // 두 수의 합 리턴
    public int sumTwoNumber(int a, int b) {
        return a + b;
    }

    // 두 수의 차 리턴
    public int minusTwoNumber(int a, int b) {
        return a - b;
    }
}





