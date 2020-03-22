package com.jvcdp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class HomeController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index()
	{
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("version", "0.1");
		return mav;
	}


}
