package com.multi.shampoorang.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.multi.shampoorang.dao.IDislikeDAO;
import com.multi.shampoorang.model.DislikeVO;

@Service
public class DislikeService implements IDislikeService {
	@Autowired
	@Qualifier("IDislikeDAO")
	IDislikeDAO dao;
	
	@Override
	public ArrayList<DislikeVO> dislikeList() {
		return dao.dislikeList();
	}
}