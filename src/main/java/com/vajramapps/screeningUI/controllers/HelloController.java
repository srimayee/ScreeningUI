package com.vajramapps.screeningUI.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/sayHello")
	public String sayHello(Model model) {
		System.out.println("sayHello");
		model.addAttribute("message", "Hellooooo world");
		return "greeting";
	}
}
