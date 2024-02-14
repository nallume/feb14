package org.nallume.service;

import java.util.List;
import java.util.Map;

import org.nallume.dao.MemberDAO;
import org.nallume.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memberDAO;  // 만들어줘야 함
	
	public List<MemberDTO> memberList(){
		return memberDAO.memberList();  //만들어줘야 함
	}

	public List<Map<String, Object>> memberList2() {		
		return memberDAO.memberList2();
	}
}
