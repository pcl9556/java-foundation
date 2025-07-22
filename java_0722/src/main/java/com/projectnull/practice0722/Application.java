package com.projectnull.practice0722;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* 프로그램 개요
        * 승객이 회전목마를 타는 프로그램
        *
        * 시스템 요구사항
        * 1. 승객은 탑승하기, 손잡이 올리기 ,손잡이 내리기, 멈추기 를 할 수 있다.
        * 2. 회전목마는 출발하기, 올라가기 ,내려가기, 멈추기를 할 수 있다.
        * 3. 회전목마는 멈춤 상태로 대기하고 있다.
        * 4. 승객은 회전목마 탐승 후 대기한다.
        * 5. 승객이 손잡이를 위로 올리면 회전목마가 위로 올라간다.
        * 6. 승객이 손잡이를 아래로 내리면 회전목마가 아래로 내려간다.
        * 7. 운행 시작 전에 손잡이를 조작 할 수 없다.
        * 8. 가장 아래로 내려가면 더이상 내려 갈 수 없다.
        * 9. 운행 종료시 손잡이는 움직이지 않는다.
        * */

        /* 프로그램 설계
        * 필요한 객체도출
        * - 회전목마, 승객, 플레이어
        *
        * 객체간 상호작용
        *
        * -회전목마 메세지
        * 출발하기
        * 올라가기
        * 내려가기
        * 운행 중단하기
        *
        * - 승객
        * 탑승하기
        * 손잡이 위로 올리기
        * 손잡이 아래로 내리기
        * 멈추기
        *
        * */

        Passenger passenger = new Passenger();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=========화전목마 타보자 ! ==========");
            System.out.println("1. 탑승하기");
            System.out.println("2. 손작이 위로 올리기");
            System.out.println("3. 손잡이 아래로 내리기");
            System.out.println("4. 멈추기");
            System.out.println("9. 회전목마 운행 종료");
            System.out.print("번호 선택 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : passenger.start(); break;
                case 2 : passenger.up(); break;
                case 3 : passenger.down(); break;
                case 4 : passenger.end(); break;
                case 9 :
                    System.out.println("프로그램 종료됩니다."); break;
                default:
                    System.out.println("잘못된 번호를 선택했습니다.");
            }

            if (no == 9) {
                break;
            }
        }

    }
}
