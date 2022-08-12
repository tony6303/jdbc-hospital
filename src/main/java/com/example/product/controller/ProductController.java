package com.example.product.controller;

import com.example.product.service.ProductService;
import com.example.product.view.ProductMenu;

public class ProductController {  // 딱 서비스만 호출하고 끝
	ProductService productService = new ProductService();
	
	public void selectAllProduct() {
		productService.findAllProduct();
	} // selectAllProduct 끝
}
