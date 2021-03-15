package com.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.domain.BoardVO;
import com.board.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	BoardService service;

	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	public void getList(Model model) throws Exception {
		System.out.println("ggggg");
		
		List<BoardVO> list = null;
		list = service.list();
		System.out.println(list);
		
		model.addAttribute("list", list);
		
	}
}


