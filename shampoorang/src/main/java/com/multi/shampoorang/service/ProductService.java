package com.multi.shampoorang.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.multi.shampoorang.dao.IProductDAO;
import com.multi.shampoorang.model.ProductVO;

@Service
public class ProductService implements IProductService {
	
	@Autowired
	@Qualifier("IProductDAO")
	IProductDAO dao;

	@Override
	public ArrayList<ProductVO> ingdList() {
		return dao.ingdList();
	}

	@Override
	public void insertProduct(ProductVO ingd) {
		dao.insertProduct(ingd);

	}

	@Override
	public void updateProduct(ProductVO ingd) {
		dao.updateProduct(ingd);

	}

	@Override
	public void deleteProduct(String ingd_name) {
		dao.deleteProduct(ingd_name);

	}

	@Override
	public ProductVO productDetailView(String ingd) {
		return dao.productDetailView(ingd);
	}

}

