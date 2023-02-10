package template;

import java.util.Scanner;

import model.IceCream;

public class IceCreamCone extends IceCreamTemplate{

	@Override
	public String prepare() {
		System.out.println("Prepare a Cone");
		Scanner scan = new Scanner(System.in);
		String flavour;
		do {
			System.out.print("What flavour do you want? [Chocolate | Strawberry]: ");
			flavour = scan.nextLine();
		}while(!flavour.equals("Strawberry") && !flavour.equals("Chocolate"));
		return flavour;
	}

	@Override
	public IceCream generateIceCream(String flavour) {
		return new IceCream("Ice cream "+flavour, "Cone", flavour);
	}

}
