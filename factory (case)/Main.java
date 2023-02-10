package creational.topposhop;

import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	
	public Main() {
		// TODO Auto-generated constructor stub
		
		while(true) {
			Integer input = 0;
			System.out.println("Where do you want to go?");
			System.out.println("1. Cone ice scream stall");
			System.out.println("2. Bucket Ice Cream Stall");
			System.out.println("0. Exit");
			System.out.print("Input >>");
			input = sc.nextInt();
			sc.nextLine();
			String flavour,type;
			switch (input) {
			case 1:
				System.out.print("what flavour ? 'chocolate' or 'strawberry' >>");
				flavour = sc.nextLine();
				System.out.print("what type ? 'regular' or 'special' >>");
				type = sc.nextLine();
				IceCreamFactory coneIceFactory = new ConeIceFactory();
				IceCream coneIceCream = coneIceFactory.createIceCream(flavour, type);
				System.out.println(coneIceCream.getFlavour()+coneIceCream.getType()+((ConeIceCream)coneIceCream).getName());
				break;
			case 2:
				System.out.print("what flavour ? 'chocolate' or 'strawberry' >>");
				flavour = sc.nextLine();
				System.out.print("what type ? 'regular' or 'special' >>");
				type = sc.nextLine();
				IceCreamFactory bucketIceFactory = new BucketIceFactory();
				IceCream bucketIceCream = bucketIceFactory.createIceCream(flavour, type);
				System.out.println(bucketIceCream.getFlavour()+bucketIceCream.getType()+((BucketIceCream)bucketIceCream).getName());
				break;
				
			case 0:
				History history = History.getHistory();
				history.printHistory();
				
				
				return;
			default:
				break;
			}
		}
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
