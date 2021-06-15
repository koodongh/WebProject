package com.multi.shampoorang.service;

import java.util.ArrayList;
import java.util.HashMap;

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
	public ArrayList<DislikeVO> dislikeList(String member_id) {
		return dao.dislikeList(member_id);
	}
	
	@Override
	public void insertDislike(String ingd_name, String member_id) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("ingd_name", ingd_name);
		map.put("member_id", member_id);
		dao.insertDislike(map);
	}
	
	@Override
	public void deleteDislike(String dislikes_id) {
		dao.deleteDislike(dislikes_id);
	}
}