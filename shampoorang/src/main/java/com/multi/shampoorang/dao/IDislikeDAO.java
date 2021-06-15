package com.multi.shampoorang.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.multi.shampoorang.model.DislikeVO;

public interface IDislikeDAO {
	public ArrayList<DislikeVO> dislikeList(String member_id);
	public void insertDislike(HashMap<String, Object> map);
}
