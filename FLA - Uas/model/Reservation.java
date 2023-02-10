package model;

import singleton.ReservationHistory;
import strategy.Room;

public class Reservation {
	
	private User user; 
	
	private Room room;
	
	private int price=0;
	
	public Reservation() {
		// TODO Auto-generated constructor stub
	}

	public Reservation(User user, Room room) {
		super();
		this.user = user;
		this.room = room;
	}
	
	public void makeReservation() {
		price = room.getPrice();
		
		ReservationHistory.getInstance().addReservation(this);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


}
