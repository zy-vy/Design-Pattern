package model;

import java.util.List;

public interface Section {
	
	void displayQuestion();
	
	void printTitle();

	Section setTitle(String title);

	Section setQuestion(List<Question> questions);
}
