package template;

import java.util.Scanner;

import model.IceCream;

public class IceCreamBucket extends IceCreamTemplate{

	@Override
	public String prepare() {
		System.out.println("Prepare a bucket");
		Scanner scan = new Scanner(System.in);
		String flavour;
		do {
			System.out.print("What flavor do you want? [Strawberry | Vanilla]: ");
			flavour = scan.nextLine();
		}while(!flavour.equals("Strawberry") && !flavour.equals("Vanilla"));
		return flavour;
	}

	@Override
	public IceCream generateIceCream(String flavour) {
		return new IceCream("Ice cream "+flavour, "Bucket", flavour);
	}


}
