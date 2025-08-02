package com.projectnull.practice.hw1.view;

import com.projectnull.practice.hw1.controller.BookManager;
import com.projectnull.practice.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public void menu() {
        while (true) {
            System.out.println("==== 도서 관리 프로그램 ====");
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 삭제");
            System.out.println("3. 도서 검색");
            System.out.println("4. 전체 출력");
            System.out.println("5. 정렬 후 출력");
            System.out.println("6. 종료");
            System.out.print("메뉴 선택 >> ");

            //사용자의 입력, 화면 결과 출력할꺼임
            //메뉴 번호를 입력시 BookManager 동작하게함

            int menu = sc.nextInt();
            sc.nextLine();

            //switch.....짜증나..................

            switch (menu) {
                case 1:
                    bm.addBook(inputBook());
                    break;
                case 2:
                    System.out.print("삭제할 도서 제목 >> ");
                    String delTitle = sc.nextLine();
                    int delIdx = bm.searchBook(delTitle);
                    if (delIdx != -1) {  //책 있음
                        bm.deleteBook(delIdx);
                        System.out.println("도서가 삭제되었습니다.");
                    } else {
                        System.out.println("해당 도서가 존재하지 않습니다.");
                    }
                    break;
                case 3:
                    System.out.print("검색할 도서 제목 >> ");
                    String searchTitle = sc.nextLine();
                    int idx = bm.searchBook(searchTitle);
                    if (idx != -1) { //
                        bm.printBook(idx);
                    } else {
                        System.out.println("도서를 찾을 수 없습니다.");
                    }
                    break;
                case 4:
                    bm.displayAll();
                    break;
                case 5:
                    System.out.print("정렬 기준 선택 (1. 오름차순 , 2. 내림차순)  ");
                    int sortType = sc.nextInt();
                    ArrayList<BookDTO> sortedList = bm.sortedBookList(sortType);  //sortType 매개변수를 받아서 도서 리스트(ArrayList<BookDTO>) 반환
                    bm.printBookList(sortedList); //담아라
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    //메서드로 BookDTO 객체 만들어

    public BookDTO inputBook() {
        System.out.print("도서 번호 >> ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("도서 제목 >> ");
        String title = sc.nextLine();

        System.out.print("도서 저자 >> ");
        String author = sc.nextLine();

        System.out.print("카테고리 (1. 인문 / 2. 자연과학 / 3. 의료 / 4. 기타) >> ");
        int category = sc.nextInt();
        sc.nextLine();

        return new BookDTO(number, title, author, category);
    }
}

