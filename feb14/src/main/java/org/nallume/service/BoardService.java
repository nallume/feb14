package org.nallume.service;

import java.util.List;
import java.util.Map;

import org.nallume.dao.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO boardDAO;
	
	public List<Map<String, Object>> boardList(){
		return boardDAO.boardList();
	}

	public Map<String, Object> detail(String no) {
		return boardDAO.detail(no);
	}
	
}
