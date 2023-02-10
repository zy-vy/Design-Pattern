package contohQuiz1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import factory.CakeFactory;
import model.Cake;
import repo.History;

public class Main {
	
	Scanner sc = new Scanner(System.in);

	public Main() {
		// TODO Auto-generated constructor stub
		
		Integer input =0;
		do {
			System.out.println("1. Bake Confectionary");
			System.out.println("2. View Confectionary");
			System.out.println("3. Exit");
			System.out.println(">>");
			input = sc.nextInt();
			sc.nextLine();
			
			if (input==1) {
				menu1();
			}
			else if (input ==2) {
				menu2();
				
			}
			
			
			
		} while (input!=3);
	}
	
	
	private void menu1() {
		String name, type, softness,payment,input;
		List<String> topping = new ArrayList<>();
		int price;
		
		
		System.out.println("Input cake type :");
		type = sc.nextLine();
		
		System.out.println("Input cake name :");
		name = sc.nextLine();
		System.out.println("Softness : ");
		softness = sc.nextLine();
		
		System.out.println("topping :");
		input = sc.nextLine();
		
		if (input.equals("Y")) {
			for (int i = 0; i < 3; i++) {
				System.out.println("input toping :");
				input = sc.nextLine();
				topping.add(input);
			}
		}else {
			topping.add("-");
		}
		
		System.out.println("Price :");
		price = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Payment type : ");
		payment = sc.nextLine();
		
		
		CakeFactory cakeFactory = new CakeFactory();
		Cake cake = cakeFactory.createCake(type, name, softness, topping, price, payment);
		
		History history = History.getInstance();
		
		history.addCake(cake);
		
		
	}
	
	private void menu2() {
		History history = History.getInstance();
		history.printHistory();
	}
	
	
	public static void main(String[] args) {
		new Main();
	}

}
