/**
 * 
 */
package com.vajramapps.screeningUI.beans;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author smadasu
 *
 */
@Getter @Setter @NoArgsConstructor @ToString
public class Question {
	
	String questionText;
	String answer;
	static List<Question> questions = new ArrayList<Question>();
	
	public static List<Question> getAllQuestions() {
		return questions;
	}
	
	public static void addQuestion(Question q) {
		questions.add(q);
	}

}
