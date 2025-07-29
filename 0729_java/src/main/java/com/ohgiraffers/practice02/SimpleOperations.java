package com.ohgiraffers.practice02;

public class SimpleOperations {

    //  함수 호출 확인용 메소드
    public void printMessage() {
        System.out.println("메소드 호출 확인");
    }

    //  start부터 end까지의 숫자들의 합 리턴
    public int sumNumbers(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }

    // 문자열에서 특정 문자 개수 리턴
    public int countCharacter(String input, char ch) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    //  문자열을 뒤집어서 리턴
    public String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}

