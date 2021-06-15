package com.multi.shampoorang.service;

import java.util.ArrayList;

import com.multi.shampoorang.model.DislikeVO;

public interface IDislikeService {
	ArrayList<DislikeVO> dislikeList(String member_id);
	void insertDislike(String ingd_name, String member_id);
	void deleteDislike(String dislikes_id);
}