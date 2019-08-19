/**
 * 
 */
package com.vajramapps.screeningUI.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import com.vajramapps.screeningUI.beans.Question;

/**
 * @author smadasu
 *
 */
@Controller
public class QuestionController {

	@PostMapping("/submitquestion")
	public String submitQuestion(Question question, BindingResult result, Model model) {
		Question.addQuestion(question);
		return "redirect:/browse";
	}
}
