package ru.kpfu.itis.group11506.queueExample;

public class Client {
	
	private int rating;
	
	public int getRating() {
		return rating;
	}
	
	private String order;
	
	public String getOrder() {
		return order;
	}
	
	public Client(String order, int rating) {
		this.rating = rating;
		this.order = order;
	}
}
