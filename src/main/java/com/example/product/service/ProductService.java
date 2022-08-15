package com.example.product.service;

import java.util.List;

import com.example.product.model.dao.ProductDao;
import com.example.product.model.dto.Product;
import com.example.product.view.ProductMenu;

public class ProductService {
	ProductDao productDao = new ProductDao();
	
	public List<Product> findAllProduct() {
		List<Product> list = productDao.findAll();
		return list;
	} // findAllProduct 끝
	
	public int addProduct(Product product) {
		int result = productDao.insert(product); // 성공시 1 실패시 0 반환		
		return result;
	} // addProduct 끝

	public int modifyProduct(int pId, int amount) {
		int result = productDao.update(pId, amount);
		return result;
	} // modifyProduct 끝

	public int deleteProduct(int pId) {
		return productDao.delete(pId);
	} // deleteProduct 끝
	
}
