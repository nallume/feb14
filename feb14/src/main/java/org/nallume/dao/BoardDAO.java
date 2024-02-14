package org.nallume.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<Map<String, Object>> boardList(){
		
		return sqlSession.selectList("board.boardList"); //board-Mapper 에 있는 namespace.id 로 sql 불러오기
	}
	
	
	public List<Map<String, Object>> boardList2(){
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		Map<String, Object> map = new HashMap();
		map.put("board_no", 1);
		map.put("board_title", "첫번째 글");
		map.put("board_write", "홍길동");
		map.put("board_date", "2024-02-01");
		map.put("board_count", 1);
		map.put("comment", 0);
		list.add(map);
		
		map = new HashMap();
		map.put("board_no", 2);
		map.put("board_title", "두번째 글");
		map.put("board_write", "홍길동");
		map.put("board_date", "2024-02-02");
		map.put("board_count", 1);
		map.put("comment", 0);
		list.add(map);
		
		map = new HashMap();
		map.put("board_no", 3);
		map.put("board_title", "세번째 글");
		map.put("board_write", "홍길동");
		map.put("board_date", "2024-02-03");
		map.put("board_count", 1);
		map.put("comment", 0);
		list.add(map);		
		
		return list;
	}


	public Map<String, Object> detail(String no) {
		
		return sqlSession.selectOne("board.detail", no); // 결과가 하나 - selectOne / board-Mapper board.detail에 보내는데 no값도 같이 보내야 함
	}
	
	
	
}
