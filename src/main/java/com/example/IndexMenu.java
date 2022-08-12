package com.example;

import java.util.Scanner;

import com.example.medic.view.MedicMenu;
import com.example.patient.view.PatientMenu;
import com.example.product.controller.ProductController;
import com.example.product.view.ProductMenu;

public class IndexMenu {
    private final Scanner sc = new Scanner(System.in);
    private final PatientMenu pm = new PatientMenu();
    private final MedicMenu mm = new MedicMenu();
    
//    private final ProductMenu prom = new ProductMenu();
    ProductController proControll = new ProductController();

    public void mainMenu() {
        while (true) {
        	System.out.println("=====의료도구 재고관리=====");
        	System.out.println("1. 재고 조회");
        	System.out.println("2. 재고 추가");
        	System.out.println("3. 재고 수정");
        	System.out.println("4. 재고 삭제");
        	System.out.println("9. 프로그램 종료");
        	System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    proControll.selectAllProduct();  // 사용자의 요청
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    pm.main();
                    break;
                case 6:
                    break;
                case 9:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("올바른 메뉴번호를 선택하세요.");
                    break;
            }
        }
    }// mainMenu 끝
    
    
}
