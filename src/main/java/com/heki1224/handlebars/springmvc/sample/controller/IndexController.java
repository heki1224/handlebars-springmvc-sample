package com.heki1224.handlebars.springmvc.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	@RequestMapping(value = { "/", "" }, method = { RequestMethod.GET })
	public String index(Model model) {
		model.addAttribute("name", "Heki1224");
		return "index";
	}
}
