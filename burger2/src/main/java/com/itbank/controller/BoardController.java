package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

	@GetMapping("/board")
	public ModelAndView news() {
		ModelAndView mav = new ModelAndView("board/news");
		
		return mav;
	}
	
	@GetMapping("/board")
	public ModelAndView question() {
		ModelAndView mav = new ModelAndView("board/question");
		
		return mav;
	}
}
