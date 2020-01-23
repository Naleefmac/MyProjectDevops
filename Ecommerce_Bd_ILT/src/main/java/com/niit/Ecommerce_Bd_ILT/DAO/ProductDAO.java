package com.niit.Ecommerce_Bd_ILT.DAO;

import java.util.List;

import com.niit.Ecommerce_Bd_ILT.Model.ProductModel;

public interface ProductDAO
{
	//create 
			public void addProduct(ProductModel product);
			public ProductModel findById(int id);
			public List<ProductModel> getAll();
			public List<ProductModel> getFilterProducts(int categoryid);
			//public void update(ProductModel product);
			public void update(ProductModel p);
			public void delete(ProductModel p);
}