package repository;

import java.util.ArrayList;
import java.util.List;

import model.Form;

public class FormRepo {
	
	List<Form> forms;
	
	static FormRepo instance;

	private FormRepo() {
		// TODO Auto-generated constructor stub
		forms = new ArrayList<>();
	}
	
	public static FormRepo getInstance() {
		if (instance == null) {
			instance = new FormRepo();
		}
		return instance;
	}
	
	public void addForm(Form form ) {
		this.forms.add(form);
	}
	
	public Form getFormByTitle (String title) {
		for (Form form : forms) {
			if (form.getTitle().equalsIgnoreCase(title)) {
				return form;
			}
		}
		return null;
	}
	
	public List<Form> getAll(){
		return this.forms;
	}

}
