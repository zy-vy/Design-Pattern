package model;

public class Question {
	
	Integer id;
	
	String title;
	
	String answer;
	


	public Question() {
		// TODO Auto-generated constructor stub
	}

	public Question(Integer id, String title, String answer) {
		this.id = id;
		this.title = title;
		this.answer = answer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer (String asnwer) {
		this.answer = asnwer;
	}
	
	public void print () {
		System.out.println("id      : " + id);
		System.out.println("title 	: "+title);
		System.out.println("answer 	: "+ answer);
		System.out.println();
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", title=" + title + ", answer=" + answer + "]";
	}

	
	

}
