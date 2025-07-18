package com.projectNull.practice0718;

public class test1 {

    public void testTest() {

        /* comment 실습 문제 풀어보자 */

        /* gpt가 만들어준 문제
        * 1~10까지 정수 중 짝수만 출력!!!!!!!!!!!
        */

        // for 문

        for (int i = 1; i <= 10; i++ ) {
            if (i % 2 == 0) {

                System.out.println(i);
            }
        }

        //while문

        int i =1;
        while (i <= 10 ) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

        //do-while 문

        int ii =1;
        do {
            if (ii % 2 == 0) {
                System.out.println(ii);
            }
            ii++;
        } while (ii <= 10);
    }
}
