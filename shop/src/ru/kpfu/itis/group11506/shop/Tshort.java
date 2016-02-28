package ru.kpfu.itis.group11506.shop;

public class Tshort implements SportWear {

	private double price;
	private String name;
	private int rating;
	private int size;
	private String color;

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Tshort(double price, String name, int rating, int size, String color) {
		price(price);
		name(name);
		rating(rating);
		size(size);
		setColor(color);
	}
}
