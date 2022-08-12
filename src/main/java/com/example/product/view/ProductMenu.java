package com.example.product.view;

import java.util.List;

import com.example.product.model.dto.Product;

public class ProductMenu {
	public void main() {
		
	}
	
	public void displayProductList(List<Product> list) {
    	System.out.println("\n조회된 전체 회원정보는 다음과 같습니다.");
		System.out.println("\n재품아이디\t제품이름\t현재수량\t입고날짜");
		System.out.println("---------------------------------");

		for (Product pro : list) {
			System.out.println(pro.toString());
		}
    }
}
