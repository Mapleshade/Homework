package ru.kpfu.itis.group11506.shop;

public class AllProducts {

	Product[] all = new Product[16];
	Sorting sorting = new Sorting();
	
	public AllProducts() {

		all[0] = new Bicycle(20000, "Kettler Cycle M", 3, "mechanical");
		all[1] = new Bicycle(32000, "Torneo Siesta", 4, "electronic");
		all[2] = new RunRoad(14000, "Torneo Cross", 3, "mechanical");
		all[3] = new RunRoad(28000, "Torneo Smarta", 4, "electronic");
		all[4] = new Tshort(200, "DOMYOS", 5, 40, "white");
		all[5] = new Tshort(1000, "SIMOND", 5, 42, "pink and blue");
		all[6] = new Pants(1000, "ASIC S", 4, 42, "short");
		all[7] = new Pants(1200, "WED'ZE", 5, 40, "long");
		all[8] = new PlayStation(14000, "Sony PS3 Super Slim", 5, "black", "stationary");
		all[9] = new PlayStation(10000, "Sony PS Vita", 4, "white", "portable");
		all[10] = new Xbox(15000, "Microsoft Xbox 360Е", 4, "black", "stationary");
		all[11] = new Xbox(30000, "Microsoft Xbox One", 5, "white", "stationary");
		all[12] = new PC(17000, "HP 110-504ur", 3, "low", "cooler");
		all[13] = new PC(50000, "Lenovo H50-50", 5, "very high", "water cooling");
		all[14] = new Laptop(45000, "Asus X555UF", 5, "high", 2.3);
		all[15] = new Laptop(19000, "HP 15-af002ur", 3, "low", 2.2);

	}

	public Product get(int index) {
		return all[index];
	}
	
	public void sortPrice() {
	sorting.priceSort(all);
	}
	
	public void sortRating() {
	sorting.ratingSort(all);
	}
}
