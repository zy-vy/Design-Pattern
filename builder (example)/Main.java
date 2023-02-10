import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Builder.BeefBuilder;
import Builder.BigChickenBuilder;
import Builder.BurgerBuilder;
import Builder.ChickenBuilder;
import Builder.SpecialBuilder;
import Model.Burger;

public class Main {
	
	Scanner sc = new Scanner(System.in);

	public Main() {
		// TODO Auto-generated constructor stub
		int input = -1;
		
		while (input!=0) {
			
			System.out.println("Builder \n========================");
			System.out.println("What do you want to order");
			System.out.println("1. Chicken Burger (4 pieces)");
			System.out.println("2. Big Chicken Burger (3 pieces)");
			System.out.println("3. Beef Burger (3 pieces)");
			System.out.println("4. Special Burger (5 pieces)");
			System.out.println("0. exit");
			
			input = sc.nextInt();
			sc.nextLine();
			BurgerBuilder builder;
			Director director = new Director();
			Burger burger;
			int total =0;
			switch (input) {
			case 1:
				builder = new ChickenBuilder();
				director.setBuilder(builder);;
				burger = director.buildChicken();
				System.out.println("Burger Created");
				List<Burger>  listChicken = new ArrayList<>();
				total=0;
				for (int i=0;i<4 ;i++) {
					try {
						burger = (Burger)burger.clone();
					} catch (CloneNotSupportedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					listChicken.add(burger);
					total+= burger.getPrice();
					System.out.println("Chicken Burger - "+burger.getPrice());
				}
				break;
			case 2:
				builder = new BigChickenBuilder();
				director.setBuilder(builder);;
				burger = director.buildBigChicken();
				System.out.println("Burger Created");
				List<Burger>  listTwoChicken = new ArrayList<>();
				total =0;
				for (int i=0;i<3 ;i++) {
					try {
						burger = (Burger)burger.clone();
					} catch (CloneNotSupportedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					listTwoChicken.add(burger);
					total+= burger.getPrice();
					System.out.println("Two Chicken Burger - "+burger.getPrice());
				}
				break;
			case 3:
				builder = new BeefBuilder();
				director.setBuilder(builder);
				burger = director.buildBeef();
				System.out.println("Burger Created");
				List<Burger>  listBeef = new ArrayList<>();
				total =0;
				for (int i=0;i<3 ;i++) {
					try {
						burger = (Burger)burger.clone();
					} catch (CloneNotSupportedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					listBeef.add(burger);
					total+= burger.getPrice();
					System.out.println("Beef Burger - "+burger.getPrice());
				}
				break;
			case 4:
				builder = new SpecialBuilder();
				director.setBuilder(builder);
				burger = director.buildSpecial();
				System.out.println("Burger Created");
				List<Burger>  listSpecial = new ArrayList<>();
				total =0;
				for (int i=0;i<5 ;i++) {
					try {
						burger = (Burger)burger.clone();
					} catch (CloneNotSupportedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					listSpecial.add(burger);
					total+= burger.getPrice();
					System.out.println("Special Burger - "+burger.getPrice());
				}
				break;
			default:
				break;
			}
			System.out.println("========================");
			System.out.println("total: "+total);
		}
		
		
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}
