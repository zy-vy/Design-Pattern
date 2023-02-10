package model;

import java.util.List;

	
public class Form {
	
	String title;
	
	List<Section> listSections ;
	
	int sectionCount;

	public Form() {
		// TODO Auto-generated constructor stub
	}
	
	Form setSection( List<Section> listSections) {
		this.listSections = listSections;
		return this;
	}
	
	public void displayForm () {
		System.out.println("title : "+title);
		for (Section section : listSections) {
			System.out.println("---------------------------------------------------------");
			section.printTitle();
			System.out.println("---------------------------------------------------------");
			section.displayQuestion();
			System.out.println();
		}
		System.out.println("=========================================================");
		System.out.println("");
	}

	public Form(String title, List<Section> listSections, int sectionCount) {
		this.title = title;
		this.listSections = listSections;
		this.sectionCount = sectionCount;
	}

	public String getTitle() {
		return title;
	}

	public Form setTitle(String title) {
		this.title = title;
		return this;
	}

	public List<Section> getListSections() {
		return listSections;
	}

	public Form setListSections(List<Section> section) {
		this.listSections=section;
		return this;
	}

	public int getSectionCount() {
		return sectionCount;
	}

	public Form setSectionCount(int sectionCount) {
		this.sectionCount = sectionCount;
		return this;
	}
	
	public void print() {
		System.out.println("Form 	: " + title);
		System.out.println("section number : "+sectionCount);
		System.out.println("all section ");
		System.out.println("----------------------");
		for (Section section : listSections) {
			section.printTitle();
			section.displayQuestion();
		}
	}

	@Override
	public String toString() {
		return "Form [title:" + title + "\nlistSections=" + listSections + "\nsectionCount=" + sectionCount + "]";
	}

	
}
