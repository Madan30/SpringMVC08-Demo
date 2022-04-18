package com.NepalCode.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestApp {
	
	@RequestMapping("/home")
	public String getHome() {
		return "home-page";
	}

}
