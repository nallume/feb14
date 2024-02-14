package org.nallume.controller;

import java.util.List;
import java.util.Map;

import org.nallume.dto.MemberDTO;
import org.nallume.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService; //만들것 1
	
	
	@GetMapping("/member")
	public String member(Model model) {
		
		//service가 줍니당 - model에 값 붙이기
		List<MemberDTO> lists = memberService.memberList(); //만들것 2
		
		model.addAttribute("list", lists);
		
		return "member";  //만들것 3
	}
	
	
	@GetMapping("/member2")
	public ModelAndView member2() {
		List<Map<String, Object>> lists = memberService.memberList2();
		//model.addAttribute("list", lists);
		ModelAndView mv = new ModelAndView("member2"); //jsp name
		mv.addObject("list", lists);				
		return mv;
		//return "member";
	}
	
	@GetMapping("/member3")
	public @ResponseBody MemberDTO member3() {	
		List<MemberDTO> lists = memberService.memberList();
		return lists.get(0);
	}
}
