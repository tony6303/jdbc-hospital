package com.example.product.service;

import java.util.List;

import com.example.product.model.dao.ProductDao;
import com.example.product.model.dto.Product;
import com.example.product.view.ProductMenu;

public class ProductService {
	ProductDao productDao = new ProductDao();
	
	public List<Product> findAllProduct() {
		List<Product> list = productDao.findAll();
		if(list.isEmpty()) {
			System.out.println("조회된 재고가 없습니다");
			return list;
		}else {
			return list;
		}
	}
	
	public int addProduct(Product product) {
		int result = productDao.insert(product); // 성공시 1 실패시 0 반환		
		return result;
	}	
	
}
