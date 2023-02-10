package builder;

import java.util.ArrayList;
import java.util.List;

import model.Essay;
import model.Form;
import model.MultipleChoice;
import model.Question;
import model.Section;
import repository.FormRepo;

public class FormBuilder {
	
	FormRepo formRepo;
	Form form;
	Section section;
	List<Section> sections;	
	List<Question> questions;

	public FormBuilder() {
		// TODO Auto-generated constructor stub
		formRepo = FormRepo.getInstance();
		sections = new ArrayList<>();
		questions = new ArrayList<>();
	}
	
	public Form buildForm(String title) {
		form = new Form();
		form = form.setTitle(title).setSectionCount(sections.size()).setListSections(sections);
		
		return form;
	}
	
	public Section buildSection (String sectionType ,String title) {
		
		if (sectionType.equalsIgnoreCase("multiple")) {
			section = new MultipleChoice();
		}
		else {
			section  = new Essay();
		}
		section = section.setTitle(title).setQuestion(questions);
		sections.add(section);
		questions = new ArrayList<>();
		return section;
	}
	
	public void addQuestion (Question question) {
		questions.add(question);
	}

}
