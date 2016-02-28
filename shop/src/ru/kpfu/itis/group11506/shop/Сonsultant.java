package ru.kpfu.itis.group11506.shop;

import java.util.Scanner;

public class Сonsultant {

	AllProducts allProducts = new AllProducts();
	private Scanner sc;

	public void first(String answer) {
		switch (answer) {

		case "Sport":
			System.out.println("We have Trenagers and Sport Wear, what do you need?");
			String secondQuestionSport = sc.next();
			secondSport(secondQuestionSport);
			break;

		case "Electronics":
			System.out.println("We have Consoles and Computers, what do you need?");
			String secondQuestionElectronics = sc.next();
			secondElectronics(secondQuestionElectronics);
			break;

		case "Trenagers":
			System.out.println("We have Bycicle and Run road, what do you need?");
			String thirdQuestionSportTrenagers = sc.next();
			thirdSportTrenagers(thirdQuestionSportTrenagers);
			break;

		case "Sport wear":
			System.out.println("We have T-short and Paints, what do you need?");
			String thirdQuestionSportSportWear = sc.next();
			thirdSportSportWear(thirdQuestionSportSportWear);
			break;

		case "Computers":
			System.out.println("We have Laptop and PC, what do you need?");
			String thirdQuestionElectronicsComputers = sc.next();
			thirdElectronicsComputers(thirdQuestionElectronicsComputers);
			break;

		case "Consoles":
			System.out.println("We have PlayStation and Xbox, what do you need?");
			String thirdQuestionElectronicsConsoles = sc.next();
			thirdElectronicsConsoles(thirdQuestionElectronicsConsoles);
			break;

		case "Run road":
			thirdSportTrenagers("Run road");
			break;

		case "Bycicle":
			thirdSportTrenagers("Bycicle");
			break;

		case "T-short":
			thirdSportSportWear("T-short");
			break;

		case "Paints":
			thirdSportSportWear("Pants");
			break;

		case "Xbox":
			thirdElectronicsConsoles("Xbox");
			break;

		case "PlayStation":
			thirdElectronicsConsoles("PlayStation");
			break;

		case "Laptop":
			thirdElectronicsComputers("Laptop");
			break;

		case "PC":
			thirdElectronicsComputers("PC");
			break;

		default:
			System.out.println("we do not have this product");
		}
	}

	public void secondSport(String answer) {
		switch (answer) {
		case "Trenagers":
			System.out.println("We have Bycicle and Run road, what do you need?");
			String thirdQuestionSportTrenagers = sc.next();
			thirdSportTrenagers(thirdQuestionSportTrenagers);
			break;

		case "Sport wear":
			System.out.println("We have T-short and Paints, what do you need?");
			String thirdQuestionSportSportWear = sc.next();
			thirdSportSportWear(thirdQuestionSportSportWear);
			break;
		default:
			System.out.println("we do not have this product");
			break;
		}
	}

	public void thirdSportTrenagers(String answer) {

		switch (answer) {
		case "Bycicle":

			Bicycle firstBicycle = (Bicycle) allProducts.get(0);
			Bicycle secondBicycle = (Bicycle) allProducts.get(1);

			System.out.println("we can offer you " + firstBicycle.getName() + " that price " + firstBicycle.getPrise()
					+ " have rating " + firstBicycle.getRating() + " have for musckle " + firstBicycle.getMuscle()
					+ " and it's load Regulation is " + firstBicycle.getLoadRegulation());

			System.out.println("or we can offer you " + secondBicycle.getName() + " that price "
					+ secondBicycle.getPrise() + " have rating " + secondBicycle.getRating() + " have for musckle "
					+ secondBicycle.getMuscle() + " and it's load Regulation is " + secondBicycle.getLoadRegulation());

			break;

		case "Run road":

			RunRoad firstRunRoad = (RunRoad) allProducts.get(2);
			RunRoad secondRunRoad = (RunRoad) allProducts.get(3);

			System.out.println("we can offer you " + firstRunRoad.getName() + " that price " + firstRunRoad.getPrise()
					+ " have rating " + firstRunRoad.getRating() + " have for musckle " + firstRunRoad.getMuscle()
					+ " and it's type is " + firstRunRoad.getType());

			System.out.println("or we can offer you " + secondRunRoad.getName() + " that price "
					+ secondRunRoad.getPrise() + " have rating " + secondRunRoad.getRating() + " have for musckle "
					+ secondRunRoad.getMuscle() + " and it's type is " + secondRunRoad.getType());

			break;

		default:
			System.out.println("we do not have this product");
			break;
		}
	}

	public void thirdSportSportWear(String answer) {
		switch (answer) {
		case "T-short":

			Tshort firstTshort = (Tshort) allProducts.get(4);
			Tshort secondTshort = (Tshort) allProducts.get(5);

			System.out.println("we can offer you " + firstTshort.getName() + " that price " + firstTshort.getPrise()
					+ " have rating " + firstTshort.getRating() + " have size " + firstTshort.getSize()
					+ " and it's type is " + firstTshort.getColor());

			System.out.println("or we can offer you " + secondTshort.getName() + " that price " + secondTshort.getPrise()
					+ " have rating " + secondTshort.getRating() + " have size " + secondTshort.getSize()
					+ " and it's type is " + secondTshort.getColor());

			break;

		case "Pants":

			Pants firstPants = (Pants) allProducts.get(6);
			Pants secondPants = (Pants) allProducts.get(7);

			System.out.println("we can offer you " + firstPants.getName() + " that price " + firstPants.getPrise()
					+ " have rating " + firstPants.getRating() + " have size " + firstPants.getSize()
					+ " and it's type is " + firstPants.getType());

			System.out.println("or we can offer you " + secondPants.getName() + " that price " + secondPants.getPrise()
					+ " have rating " + secondPants.getRating() + " have size " + secondPants.getSize()
					+ " and it's type is " + secondPants.getType());

			break;

		default:
			System.out.println("we do not have this product");
			break;
		}
	}

	public void secondElectronics(String answer) {
		switch (answer) {
		case "Consoles":
			System.out.println("We have PlayStation and Xbox, what do you need?");
			String thirdQuestionElectronicsConsoles = sc.next();
			thirdElectronicsConsoles(thirdQuestionElectronicsConsoles);
			break;

		case "Computers":
			System.out.println("We have Laptop and PC, what do you need?");
			String thirdQuestionElectronicsComputers = sc.next();
			thirdElectronicsComputers(thirdQuestionElectronicsComputers);
			break;
		default:
			System.out.println("we do not have this product");
			break;
		}
	}

	public void thirdElectronicsConsoles(String answer) {

		switch (answer) {
		case "PlayStation":

			PlayStation firstPlayStation = (PlayStation) allProducts.get(8);
			PlayStation secondPlayStation = (PlayStation) allProducts.get(9);

			System.out.println("we can offer you " + firstPlayStation.getName() + " that price "
					+ firstPlayStation.getPrise() + " have rating " + firstPlayStation.getRating() + " that color "
					+ firstPlayStation.getColor() + " and it's type is " + firstPlayStation.getType());

			System.out.println("or we can offer you " + secondPlayStation.getName() + " that price "
					+ secondPlayStation.getPrise() + " have rating " + secondPlayStation.getRating() + " that color "
					+ secondPlayStation.getColor() + " and it's type is " + secondPlayStation.getType());

			break;

		case "Xbox":

			Xbox firstXbox = (Xbox) allProducts.get(10);
			Xbox secondXbox = (Xbox) allProducts.get(11);

			System.out.println("we can offer you " + firstXbox.getName() + " that price " + firstXbox.getPrise()
					+ " have rating " + firstXbox.getRating() + " that color " + firstXbox.getColor()
					+ " and it's type is " + firstXbox.getType());

			System.out.println("or we can offer you " + secondXbox.getName() + " that price " + secondXbox.getPrise()
					+ " have rating " + secondXbox.getRating() + " that color " + secondXbox.getColor()
					+ " and it's type is " + secondXbox.getType());

			break;

		default:
			System.out.println("we do not have this product");
			break;
		}
	}

	public void thirdElectronicsComputers(String answer) {

		switch (answer) {
		case "PC":

			PC firstPC = (PC) allProducts.get(12);
			PC secondPC = (PC) allProducts.get(13);

			System.out.println("we can offer you " + firstPC.getName() + " that price " + firstPC.getPrise()
					+ " have rating " + firstPC.getRating() + " that performance " + firstPC.getPerformance()
					+ " and it's cooling type is " + firstPC.getCoolingType());

			System.out.println("or we can offer you " + secondPC.getName() + " that price " + secondPC.getPrise()
					+ " have rating " + secondPC.getRating() + " that performance " + secondPC.getPerformance()
					+ " and it's cooling type is " + secondPC.getCoolingType());

			break;

		case "Laptop":

			Laptop firstLaptop = (Laptop) allProducts.get(14);
			Laptop secondLaptop = (Laptop) allProducts.get(15);

			System.out.println("we can offer you " + firstLaptop.getName() + " that price " + firstLaptop.getPrise()
					+ " have rating " + firstLaptop.getRating() + " that performance " + firstLaptop.getPerformance()
					+ " and it's weight is " + firstLaptop.getWeight());

			System.out.println("or we can offer you " + secondLaptop.getName() + " that price "
					+ secondLaptop.getPrise() + " have rating " + secondLaptop.getRating() + " that performance "
					+ secondLaptop.getPerformance() + " and it's weight is " + secondLaptop.getWeight());

			break;

		default:
			System.out.println("we do not have this product");
			break;
		}
	}

	public void startAsk() {

		sc = new Scanner(System.in);
		System.out.println("Welcome to our store! I will help you. What do you need?");

		String firstQuestion = sc.next();
		first(firstQuestion);

	}
}
