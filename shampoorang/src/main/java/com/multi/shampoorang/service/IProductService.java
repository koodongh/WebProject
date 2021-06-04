package com.multi.shampoorang.service;

import java.util.ArrayList;
import com.multi.shampoorang.model.ProductVO;

public interface IProductService {
	ArrayList<ProductVO> ingdList();
	void insertProduct(ProductVO ingd);
	void updateProduct(ProductVO ingd);
	void deleteProduct(String ingd_name);
	ProductVO productDetailView(String ingd_name);
}
