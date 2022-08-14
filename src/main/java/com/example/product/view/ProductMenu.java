package com.example.product.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.example.product.controller.ProductController;
import com.example.product.model.dto.Product;

public class ProductMenu {
	private final Scanner sc = new Scanner(System.in);
	private final ProductController proControll = new ProductController();
	
	
	 public void main() {
	        while (true) {
	        	System.out.println("=====의료도구 재고관리=====");
	        	System.out.println("1. 재고 조회");
	        	System.out.println("2. 재고 추가");
	        	System.out.println("3. 재고 수정");
	        	System.out.println("4. 재고 삭제");
	        	System.out.println("9. 뒤로가기");
	        	System.out.print("메뉴 선택 : ");
	            int menu = sc.nextInt();
	            switch (menu) {
	                case 1:
	                    selectAllProduct();  // 사용자의 요청
	                    break;
	                case 2:
	                	addProduct();
	                    break;
	                case 3:
	                    break;
	                case 4:
	                    break;
	                case 9:
	                    
	                    return;
	                default:
	                    System.out.println("올바른 메뉴번호를 선택하세요.");
	                    break;
	            }
	        }
	    }// mainMenu 끝
	 
	 public void displayProductList(List<Product> list) {
	    	System.out.println("\n조회된 전체 회원정보는 다음과 같습니다.");
			System.out.println("\n재품아이디\t제품이름\t현재수량\t입고날짜");
			System.out.println("---------------------------------");

			for (Product pro : list) {
				System.out.println(pro.toString());
			}
	    }
	 
	 private void selectAllProduct() {
		 List<Product> list = proControll.selectAllProduct();
		 displayProductList(list);
	 }
	
	 
	 private void addProduct() {
	        System.out.println("===== 재고 추가 =====");
	        System.out.print("제품이름 입력 : ");
	        String name = sc.next();
	        System.out.print("수량 입력 : ");
	        int amount = sc.nextInt();		        

	        Product product = new Product(name,amount);  // pId 와 receiveDate 는 자동으로 생성하게 만들어놔서 2개값만 받도록 함

	        // request
	        int result = proControll.addProduct(product);

	        // response
	        if (result == 1) {
	            System.out.println("재고 추가가 완료되었습니다.");
	        } else if (result == 0) {
	            System.out.println("재고 추가를 실패했습니다.");
	        }
	    }
	 
	
}
