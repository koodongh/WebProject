package com.multi.shampoorang.dao;

import java.util.ArrayList;

import com.multi.shampoorang.model.DislikeVO;

public interface IDislikeDAO {
	public ArrayList<DislikeVO> dislikeList(String member_id);
	public void insertDislike(DislikeVO dislike);
}
