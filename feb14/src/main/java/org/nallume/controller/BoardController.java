package org.nallume.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.nallume.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * 스프링에서 객체를 생성하는 방법은 
 * @Controller
 * @Service
 * @Repository
 * @Component
 * 
 */

@Controller
public class BoardController {

	//데이터 흐름
	//controller -> service -> repository -> mybatis -> DB
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/board")
	public String board(Model model) {
		
		//값 붙이기
		List<Map<String, Object>> list = boardService.boardList();
		model.addAttribute("list", list);		
		//model.addAttribute("list", boardService.boardList());
		return "board";  // /WEB-INF/views/board.jsp
	}
	
	
	@GetMapping("/detail")
	public String detail(HttpServletRequest request, Model model) {
		//서블릿에서 보내는 no값을 잡아주기
		String no = request.getParameter("no");
		//System.out.println(no);
		
		Map<String, Object> detail = boardService.detail(no); // 지금은 String이지만 int값으로 보내야함
		model.addAttribute("detail", detail);
		//System.out.println(detail);
		
		return "detail";
	}
	
	
}
