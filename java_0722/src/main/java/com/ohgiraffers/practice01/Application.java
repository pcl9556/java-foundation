package com.ohgiraffers.practice01;

public class Application {

    public static void main(String[] args) {

        Calculator cal = new Calculator();

        // 메소드 호출 확인용 메소드 호출
        cal.checkMethod();

        // 1부터 10까지의 합 출력
        int sum = cal.sum1to10();
        System.out.println("1부터 10까지의 합 : " + sum);

        // 10, 20 중 큰 수 출력
        cal.checkMaxNumber(10, 20);

        // 10, 20의 합 출력
        int sumResult = cal.sumTwoNumber(10, 20);
        System.out.println("10과 20의 합은 : " + sumResult);

        // 10, 5의 차 출력
        int minusResult = cal.minusTwoNumber(10, 5);
        System.out.println("10과 5의 차는 : " + minusResult);

    }
}
