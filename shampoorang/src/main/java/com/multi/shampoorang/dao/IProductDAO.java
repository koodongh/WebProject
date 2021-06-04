package com.multi.shampoorang.dao;

import java.util.ArrayList;

import com.multi.shampoorang.model.ProductVO;

public interface IProductDAO {
	 ArrayList<ProductVO> ingdList(); 
	 void insertProduct(ProductVO ingd); 
	 ProductVO productDetailView(String ingd_name); 
	 void updateProduct(ProductVO ingd); 
	 void deleteProduct(String ingd_name); 
}

