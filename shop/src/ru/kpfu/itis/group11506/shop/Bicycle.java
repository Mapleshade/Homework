package ru.kpfu.itis.group11506.shop;

public class Bicycle implements Trenagers {

	private double price;
	private String name;
	private int rating;
	private String muscle;
	private String loadRegulation;

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

	public String getLoadRegulation() {
		return loadRegulation;
	}

	public void setLoadRegulation(String loadRegulation) {
		this.loadRegulation = loadRegulation;
	}

	public Bicycle(double price, String name, int rating, String loadRegulation) {
		price(price);
		name(name);
		rating(rating);
		muscle("legs");
		setLoadRegulation(loadRegulation);
	}
}
