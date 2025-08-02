package com.projectnull.hw1.view;

import com.projectnull.hw1.controller.BookManager;
import com.projectnull.hw1.model.dto.BookDTO;
import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public void menu() {
        while (true) {
            System.out.println("===== 도서 관리 프로그램 =====");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색 출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.print("메뉴 번호 선택 : ");

            int choice = sc.nextInt();
            sc.nextLine(); // 개행 제거

            switch (choice) {
                case 1:
                    bm.addBook(inputBook());
                    break;

                case 2:
                    System.out.println("정렬방식을 선택하세요 1 - 오름차순, 2 - 내림차순 : ");
                    break;

                case 3:
                    String delTitle = inputBookTitle();
                    int delIndex = bm.searchBook(delTitle);
                    if (delIndex == -1) {
                        System.out.println("삭제할 도서가 존재하지 않습니다.");
                    } else {
                        bm.deleteBook(delIndex);
                        System.out.println("성공적으로 삭제하였습니다.");
                    }
                    break;

                case 4:
                    String searchTitle = inputBookTitle();
                    int searchIndex = bm.searchBook(searchTitle);
                    if (searchIndex == -1) {
                        System.out.println("조회한 도서가 존재하지 않습니다.");
                    } else {
                        bm.printBook(searchIndex);
                    }
                    break;

                case 5:
                    if (bm.isEmpty()) {
                        System.out.println("출력할 도서가 없습니다.");
                    } else {
                        bm.displayAll();
                    }
                    break;

                case 6:
                    System.out.println("도서 프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("잘못된 메뉴 번호입니다.");
            }
        }
    }

    public BookDTO inputBook() {
        System.out.print("도서 번호 : ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("도서 제목 : ");
        String title = sc.nextLine();

        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = sc.nextInt();
        sc.nextLine();

        System.out.print("도서 저자 : ");
        String author = sc.nextLine();

        return new BookDTO(number, title, category, author);
    }

    public String inputBookTitle() {
        System.out.print("도서 제목 : ");
        return sc.nextLine();
    }
}
