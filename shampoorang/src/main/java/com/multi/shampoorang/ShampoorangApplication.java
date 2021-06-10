package com.multi.shampoorang;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.multi.shampoorang.controller.TilesController;
import com.multi.shampoorang.dao.IMemberDAO;
import com.multi.shampoorang.dao.IProductDAO;


@SpringBootApplication
@ComponentScan(basePackageClasses = TilesController.class)
@ComponentScan
@MapperScan(basePackageClasses = IProductDAO.class)
@MapperScan(basePackageClasses = IMemberDAO.class)

public class ShampoorangApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShampoorangApplication.class, args);
	}

}
