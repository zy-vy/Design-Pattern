import java.util.ArrayList;
import java.util.List;

import factory.QuestionFactory;
import model.Essay;
import model.Form;
import model.MultipleChoice;
import model.Question;
import model.Section;
import repository.FormRepo;
import repository.QuestionRepo;

public class InitClass {

	public InitClass() {
		// TODO Auto-generated constructor stub
		FormRepo formRepo = FormRepo.getInstance();
		QuestionRepo questionRepo = QuestionRepo.getInstance();
		QuestionFactory questionFactory = new QuestionFactory();
		
		List<Question> questions = new ArrayList<>();
		List<Section> sections = new ArrayList<>();
		
		Question q= new Question();
		
		q = questionFactory.createNewQuestion("Penjualan produk tertinggi, a.HP b.laptop c.kamera", "");
		questions.add(q); questionRepo.addQuestion(q);
		q = questionFactory.createNewQuestion("Target penjualan, a.<100  b. 100-200 c. >200", "");
		questions.add(q); questionRepo.addQuestion(q);
		q = questionFactory.createNewQuestion("Kondisi etalase, a.bagus b.butuh perbaikan", "");
		questions.add(q); questionRepo.addQuestion(q);
		
		Section section = new MultipleChoice();
		section.setTitle("Section penjualan").setQuestion(questions);
		sections.add(section);
		Form form = new Form();
		form.setTitle("FORM Penjualan Agustus").setListSections(sections);

		questions = new ArrayList<>();
		
		q = questionFactory.createNewQuestion("Jumlah stok barang: ", "");
		questions.add(q); questionRepo.addQuestion(q);
		q = questionFactory.createNewQuestion("Jumlah barang rusak: ", "");
		questions.add(q); questionRepo.addQuestion(q);
		
		section = new Essay();
		section.setTitle("Section inventaris").setQuestion(questions);
		sections.add(section);
		form.setListSections(sections);
		
		formRepo.addForm(form);
		
		
		
		
	}

}
