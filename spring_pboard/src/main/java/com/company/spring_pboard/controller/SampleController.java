package com.company.spring_pboard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/testInterceptor.do")
	public ModelAndView testInterceptor() throws Exception{
		System.out.println("짱나");
		ModelAndView mv = new ModelAndView("");
		log.debug("인터셉터테스트");
		return mv;
	}
} 
