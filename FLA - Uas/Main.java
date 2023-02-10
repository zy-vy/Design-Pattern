import java.util.Scanner;

import menu.AddReservationMenu;
import menu.ManageReservationMenu;
import menu.PrepareReservationMenu;

public class Main {
	
	Scanner sc = new Scanner(System.in);

	public Main() {
		// TODO Auto-generated constructor stub
		int input =0;
		
		while (input!=4) {
			showMenu();
			input = sc.nextInt();
			sc.nextLine();
			
			switch (input) {
			case 1:
				new AddReservationMenu();
				break;
			case 2:
				new PrepareReservationMenu();
				break;
				
			case 3:
				new ManageReservationMenu();
				break;
			case 4:
				return;
			default:
				break;
			}
		}
		
		
	}
	
	private void showMenu()
	{
		System.out.println("==============================");
		System.out.println("Welcome to Hotel Indah Bersari");
		System.out.println("==============================");
		System.out.println("1. new reservation");
		System.out.println("2. prepare reservation");
		System.out.println("3. manage reservation");
		System.out.println("4. exit");
		System.out.print(">>");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
