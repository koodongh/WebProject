package com.multi.shampoorang.service;

import java.util.ArrayList;

import com.multi.shampoorang.model.DislikeVO;

public interface IDislikeService {
	ArrayList<DislikeVO> dislikeList(String member_id);
	void insertDislike(DislikeVO dislike);
}