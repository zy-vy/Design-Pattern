package lUap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Dev;

public class Main {

	Scanner sc = new Scanner(System.in);
	public Main() {
		// TODO Auto-generated constructor stub
		int input =0;
		
		List<Dev> devs = new ArrayList<>();
		while(input !=3) {
			ViewMenu();
			input = sc.nextInt();
			sc.nextLine();
			
			String code="code";
			String name;
			int exp;
			String jobPref;
			
			switch (input) {
			case 1:
				
				System.out.println("input name");
				name = sc.nextLine();
				System.out.println("input experience");
				exp = sc.nextInt();
				sc.nextLine();
				System.out.println("input jobpref [Backend Dev | Frontend Dev]");
				jobPref = sc.nextLine();
				Dev dev = new Dev(code, name, exp, jobPref);
				devs.add(dev);
				
				break;
			case 2:
				String a = "A";
				while(! a.equals("Q")) {
					viewDev(devs);
					System.out.println("next phase N | Q");
					a = sc.nextLine();
					if (a.equals("N")) {
						devs.forEach(dev1-> {
							dev1.getCurrentState().setState(dev1);
						});
					}
				}
				break;

			default:
				break;
			}
		}
	}
	
	private void viewDev(List<Dev> devs) {
		for (Dev dev : devs) {
			System.out.println("Code : "+dev.getCode());
			System.out.println("Name : "+dev.getName());
			System.out.println("Job : "+dev.getExp());
			System.out.println("Jb Pref : "+dev.getJobPref());
			System.out.print("Curent phase : ");
			dev.getCurrentState().action();
			System.out.println("");
			
		}
	}

	private void ViewMenu() {
		System.out.println("Jekpedia");
		System.out.println("1. register");
		System.out.println("2. view form");
		System.out.println("3. exit");
		System.out.println(">>");
	}
	
	public static void main (String[] args) {
		new Main();
	}

}
