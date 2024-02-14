package org.nallume.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.nallume.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;

	public List<MemberDTO> memberList() {		
		return sqlSession.selectList("member.memberList"); //mapper만들어야지
	}

	public List<Map<String, Object>> memberList2() {
		return sqlSession.selectList("member.memberList2");
	}
	
	
}
