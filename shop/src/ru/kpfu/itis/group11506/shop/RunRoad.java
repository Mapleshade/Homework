package ru.kpfu.itis.group11506.shop;

public class RunRoad implements Trenagers {

	private double price;
	private String name;
	private int rating;
	private String muscle;
	private String type;

	public void price(double price) {
		this.price = price;
	}

	public void name(String name) {
		this.name = name;
	}

	public void rating(int rating) {
		this.rating = rating;
	}

	public void muscle(String muscle) {
		this.muscle = muscle;
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

	public String getMuscle() {
		return muscle;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public RunRoad(double price, String name, int rating, String type) {
		price(price);
		name(name);
		rating(rating);
		muscle("legs");
		setType(type);
	}
}
