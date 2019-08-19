/**
 * 
 */
package com.vajramapps.screeningUI.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.vajramapps.screeningUI.beans.Question;

/**
 * @author smadasu
 *
 */
@Controller
public class HomeController {

	@GetMapping("/")
	public String homePage(Model model) {
		return "home";
	}
	
	@GetMapping("/browse")
	public String browseQuestionsPage(Model model) {
		model.addAttribute("questions", Question.getAllQuestions());
		return "browsequestions";
	}
	@GetMapping("/addquestion")
	public String addQuestionsPage(Model model) {
		 model.addAttribute("question", new Question()); 		 
		return "addquestions";
	}
}
