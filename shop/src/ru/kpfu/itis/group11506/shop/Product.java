package ru.kpfu.itis.group11506.shop;

public interface Product {

	void price(double price);

	void name(String name);

	void rating(int rating);

	double getPrise();

	String getName();

	int getRating();

}
