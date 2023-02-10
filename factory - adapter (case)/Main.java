import java.util.Scanner;

public class Main {
	
	Scanner sc = new Scanner (System.in);

	public Main() {
		// TODO Auto-generated constructor stub
		int input = 0;
		while (input !=3) {
			System.out.println("1. bake confetionary");
			System.out.println("2. view confetionary");
			System.out.println("3. exit");
			
			input = sc.nextInt();
			sc.nextLine();
			
			if (input ==1 ) {
				menu1();
			}
			else if (input ==2 ) {
				menu2();
			}
			else if (input ==3 ) {
				break;
			}
			
			
			
		}
		
	}
	
	public void menu1() {
		String name,type, softness,topping, payment;
		Integer price;
		
		System.out.println("type");
		type =sc.nextLine();
		
		System.out.println("name");
		name= sc.nextLine();
		
		System.out.println("softness");
		softness = sc.nextLine();
		
		System.out.println("topping");
		topping = sc.nextLine();
		
		System.out.println("price");
		price= sc.nextInt();
		sc.nextLine();
		
		System.out.println("payment");
		payment = sc.nextLine();
		
		CakeFactory factory = new CakeFactory();
		Cake cake = factory.createCake(name, type, softness, topping, price, payment);
		
		System.out.println("baked...");
		
		History history = History.getInstance();
		
		history.addHistory(cake);
		
	}
	
	public void menu2() {
		History history = History.getInstance();
		
		history.printHistory();
		System.out.println("enter to continue....");
		sc.nextLine();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
