import java.util.Scanner;

import Factory.*;
import Model.MilkTea;

public class Main {
	
	Scanner sc = new Scanner(System.in);

	public Main() {
		// TODO Auto-generated constructor stub
		TeaFactory topFactory = new TopFactory();
		TeaFactory tapFactory = new TapFactory();
		TeaStore teaStore;
		
		System.out.println("1. Tap tap coffe store");
		System.out.println("2. Top top coffe store");
		
		int input;
		input = sc.nextInt();
		sc.nextLine();
		
		switch (input) {
		case 1:
			System.out.println("welcome to tap tap");
			System.out.println("1. milk tea");
			System.out.println("2. tea");
			input = sc.nextInt();
			sc.nextLine();
			teaStore = new TeaStore(tapFactory);
			if (input == 1) {
				
				teaStore.BrewMilkTea();
				
				
				
			}else if (input ==2) {
				teaStore.BrewTea();
			}
			
			break;

		case 2:
			System.out.println("welcome to top top");
			System.out.println("1. milk tea");
			System.out.println("2. tea");
			input = sc.nextInt();
			sc.nextLine();
			teaStore = new TeaStore(topFactory);
			if (input == 1) {
				
				teaStore.BrewMilkTea();
				
				
				
			}else if (input ==2) {
				teaStore.BrewTea();
			}
			
			break;
		default:
			break;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
