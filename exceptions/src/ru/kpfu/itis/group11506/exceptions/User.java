package ru.kpfu.itis.group11506.exceptions;

public class User {
	private String name;
	private String adress;
	private String phoneNumber;
	private String card;
	
	public User(String name, String adress, String phoneNumber) {
		this.name = name;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getAdress() {
		return adress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}
}
