package net.sb.eCommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/index", "/home" })
	public ModelAndView Index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "Welcome to the spring MVC framework");
		return mv;
	}
}
