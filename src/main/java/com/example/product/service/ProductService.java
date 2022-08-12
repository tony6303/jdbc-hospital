package com.example.product.service;

import java.util.List;

import com.example.product.model.dao.ProductDao;
import com.example.product.model.dto.Product;
import com.example.product.view.ProductMenu;

public class ProductService {
	ProductDao productDao = new ProductDao();
	ProductMenu productMenu = new ProductMenu();
	
	public void findAllProduct() {
		List<Product> list = productDao.findAll();
		if(!list.isEmpty()) {
			productMenu.displayProductList(list);
		}else {
			System.out.println("조회된 재고가 없습니다");
		}
	}
	
}
