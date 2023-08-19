package com.ticket;

public class Passenger {
	int seatno;
	String name;
	int age;
	String gender;
	float ticketCost;

	public Passenger(int seatno, String name, int age, String gender, float ticketCost) {
		super();
		this.seatno = seatno;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.ticketCost = ticketCost;
	}

	public int getSeatno() {
		return seatno;
	}

	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(float ticketCost) {
		this.ticketCost = ticketCost;
	}

}
