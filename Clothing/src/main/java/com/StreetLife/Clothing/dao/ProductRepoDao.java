package com.StreetLife.Clothing.dao;

import java.util.List;

import com.StreetLife.Clothing.model.Product;

public interface ProductRepoDao {

	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(int productId);
	public List<Product> getAllProduct();
	public Product getproductById(int productId);
	
}
