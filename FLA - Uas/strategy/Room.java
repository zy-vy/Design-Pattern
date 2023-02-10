package strategy;

public interface Room {
	

	int getPrice ();
	
	boolean validatePrice();
	
	String getName();
	
	Room upgradeRoom();
	
}
