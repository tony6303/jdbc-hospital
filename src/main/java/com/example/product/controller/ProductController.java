package com.example.product.controller;

import java.util.List;

import com.example.product.model.dto.Product;
import com.example.product.service.ProductService;

public class ProductController {  // 딱 서비스만 호출하고 끝
	private final ProductService productService = new ProductService();
	
	public List<Product> selectAllProduct() {
		return productService.findAllProduct();
			
	} // selectAllProduct 끝

	public int addProduct(Product product) {
		
		return productService.addProduct(product); // 성공시 1 실패시 0 반환
	} // insertProduct 끝

	public int modifyProduct(int pId, int amount) {
		return productService.modifyProduct(pId, amount); 
	} // modifyProduct 끝
}
