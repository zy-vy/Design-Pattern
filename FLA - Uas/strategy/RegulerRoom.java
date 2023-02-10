package strategy;

import java.util.Scanner;

public class RegulerRoom implements Room{

	int price=0;
	String name = "Reguler";

	public RegulerRoom() {
		// TODO Auto-generated constructor stub
	}
	
	public RegulerRoom(int price) {
		super();
		this.price = price;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		if (price!=0)return price;
		while (!validatePrice()) {
			System.out.println("Input Room Price (Reguler Room min.1000.000) :");

			Scanner sc = new Scanner(System.in);
			price = sc.nextInt();
			sc.nextLine();
			
		}
		return price;
	}

	@Override
	public boolean validatePrice() {
		// TODO Auto-generated method stub
		if (price>=1000000) {
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
		return new FamilyRoom(this.price);
	}
	
}
