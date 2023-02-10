package observer;

public class Passenger implements IObserver {
	
	String name;
	String station;

	public Passenger() {
		// TODO Auto-generated constructor stub
	}


	public Passenger(String name,String station) {
		super();
		this.name = name;
		this.station= station;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	

	public String getStation() {
		return station;
	}


	public void setStation(String station) {
		this.station = station;
	}


	@Override
	public void update(String msg) {
		// TODO Auto-generated method stub
		if (station.equals(msg))
		System.out.println(name+" has left the train...");
	}
	
	

}
