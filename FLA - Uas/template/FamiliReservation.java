package template;

public class FamiliReservation extends ReservationTemplate {


	@Override
	protected void prepareFasilities() {
		// TODO Auto-generated method stub
		System.out.println("Preparing Private Jacuzzi\r\n" + 
				"Free breakfast for 3\r\n" + 
				"Eligible to request menu (dinner only)");
	}

}
