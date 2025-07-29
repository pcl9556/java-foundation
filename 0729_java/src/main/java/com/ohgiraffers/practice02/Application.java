package com.ohgiraffers.practice02;

public class Application {
    public static void main(String[] args) {
        SimpleOperations operations = new SimpleOperations();

        // 메소드 호출
        operations.printMessage();

        // start부터 end까지의 숫자들의 합 출력
        int sum = operations.sumNumbers(1, 10);
        System.out.println("1부터 10까지의 숫자들의 합은 : " + sum);

        // 숫자가 짝수인지 판별
        int number = 10;
        if (operations.isEvenNumber(number)) {
            System.out.println(number + "은 짝수입니다.");
        } else {
            System.out.println(number + "은 홀수입니다.");
        }

        // 특정 문자의 개수 출력
        String text = "Hello World";
        char targetChar = 'o';
        int charCount = operations.countCharacter(text, targetChar);
        System.out.println("\"" + text + "\"에서 '" + targetChar + "'의 개수는 : " + charCount);

        // 문자열 뒤집은 결과 출력
        String reversed = operations.reverseString(text);
        System.out.println("\"" + text + "\"를 뒤집은 결과는 : " + reversed);
    }
}

