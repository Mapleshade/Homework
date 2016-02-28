package ru.kpfu.itis.group11506.shop;

public class Pants implements SportWear {

	private double price;
	private String name;
	private int rating;
	private int size;
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

	public void size(int size) {
		this.size = size;
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

	public int getSize() {
		return size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Pants(double price, String name, int rating, int size, String type) {
		price(price);
		name(name);
		rating(rating);
		size(size);
		setType(type);
	}
}
