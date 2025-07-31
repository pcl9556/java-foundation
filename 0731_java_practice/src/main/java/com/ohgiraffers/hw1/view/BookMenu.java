package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public void menu() {
        while (true) {
            System.out.println("=== 도서관리 프로그램 ===");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색 출력");
            System.out.println("5. 전체출력");
            System.out.println("6. 끝내기");
            System.out.print("메뉴 번호 선택 : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    bm.addBook(inputBook());
                    break;
                    case 2:
                        System.out.println("정렬방식을 선택하세요 1- 오름차순, 2- 내림차순 :");
                        int sortOption = sc.nextInt();
                        sc.nextLine();
                        ArrayList<BookDTO> sorted = bm.sortedBookList(sortOption);
                        if (sorted != null) {
                            bm.printBookList(sorted);
                        }else {
                            System.out.println("번호를 잘못입력하셨습니다.");
                        }
                        break;
                        case 3:
                            String delTitle = inputBookTitle();
                            int dellndex = bm.searchBook(delTitle);
                            if (dellndex != -1) {
                                System.out.println("삭제 할 도서가 없습니다.");
                            } else {
                                bm.deleteBook(dellndex);
                                System.out.println("성공적으로 삭제하였습니다.");
                            }
                            break;
                            case 4:
                                String searchBook =inputBookTitle();
                                int searchdex = bm.searchBook(searchBook);
                                if (searchdex != -1) {
                                    System.out.println("조회한 도서가 존재하지 않습니다. ");
                                } else {
                                    bm.searchBook(searchBook);
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
                                        System.out.println("프로그램을 종료합니다.");
                                        return;
                                        default:
                                            System.out.println("질못된 메뉴 번호 입니다. ");

            }
        }
    }
    public BookDTO inputBook() {
        System.out.println("도서번호 : ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.println("도서 제목 :");
        String title = sc.nextLine();

        System.out.println(" 도서 장르 (1: 인문 / 2: 자연과학 /3: 의료/ 4:기타):");
        int category = sc.nextInt();
        sc.nextLine();

        System.out.println("도서저자 :");
        String author = sc.nextLine();

        return new BookDTO(number, title, category, author);

    }

    public String inputBookTitle() {
        System.out.println("도서 제목 :");
        return sc.nextLine();
    }
}
