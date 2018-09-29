package com.StreetLife.Clothing.dao;

import java.util.List;

import com.StreetLife.Clothing.model.Category;

public interface CategoryRepository {
	public boolean addCategory(Category category);
	public boolean updateCategory(Category category);
	public boolean deleteCategory(int categoryId);
	public List<Category> getAllCategory();
	public Category getCategoryById(int categoryId);
	
		}
