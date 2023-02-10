package strategy;

import java.util.Scanner;

public class FamilyRoom implements Room{

	int price=0;
	String name = "Family";

	public FamilyRoom() {
		// TODO Auto-generated constructor stub
	}
	
	public FamilyRoom(int price) {
		super();
		this.price = price;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		if (price!=0)return price;
		while (!validatePrice()) {
			System.out.println("Input Room Price (Family Room min.2000.000) :");

			Scanner sc = new Scanner(System.in);
			price = sc.nextInt();
			sc.nextLine();
			
		}
		return price;
	}

	@Override
	public boolean validatePrice() {
		// TODO Auto-generated method stub
		if (price>=2000000) {
			return true;
		}
		return false;
	}

	public String getName() {
		return name;
	}

	@Override
	public Room upgradeRoom() {
		// TODO Auto-generated method stub
		return new RoyalRoom(this.price);
	}
	
}
