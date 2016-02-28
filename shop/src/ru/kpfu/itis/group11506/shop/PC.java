package ru.kpfu.itis.group11506.shop;

public class PC implements Computers {
	
	private double price;
	private String name;
	private int rating;
	private String performance;
	private String coolingType;
	
	public void price(double price) {
		this.price = price;
	}
	
	public void name(String name) {
		this.name = name;
	}
	
	public void rating(int rating) {
		this.rating = rating;
	}
	
	public void performance(String performance) {
		this.performance = performance;
	}
	
	public double getPrise() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRating() {
		return rating;
	}
	
	public String getPerformance() {
		return performance;
	}
	
	public String getCoolingType() {
		return coolingType;
	}

	public void setCoolingType(String coolingType) {
		this.coolingType = coolingType;
	}
	
	public PC(double price, String name, int rating,String performance, String coolingType) {
		price(price);
		name(name);
		rating(rating);
		performance(performance);
		setCoolingType(coolingType);
	}
}
