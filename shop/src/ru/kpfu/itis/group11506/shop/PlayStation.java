package ru.kpfu.itis.group11506.shop;

public class PlayStation implements Consoles {

	private double price;
	private String name;
	private int rating;
	private String color;
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

	public void color(String color) {
		this.color = color;
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

	public String getColor() {
		return color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public PlayStation(double price, String name, int rating, String color, String type) {
		price(price);
		name(name);
		rating(rating);
		color(color);
		setType(type);
	}
}
