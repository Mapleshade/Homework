package ru.kpfu.itis.group11506.multiThread;

import java.util.Scanner;

public class Racecourse {

	private Horse[] stable = new Horse[10];
	private BubbleSorter bubbleSorter = new BubbleSorter();
	private Cashbox[] allBets = new Cashbox[5];

	public Racecourse() {
		stable[0] = new Horse("Fairy Tail", 70, 310);
		stable[1] = new Horse("Eclipse", 50, 300);
		stable[2] = new Horse("Silver Fox", 68, 400);
		stable[3] = new Horse("Secretariat", 67, 310);
		stable[4] = new Horse("Fluttering Butterfly", 55, 330);
		stable[5] = new Horse("Tessa", 58, 350);
		stable[6] = new Horse("Triumph", 65, 360);
		stable[7] = new Horse("Ruffian", 56, 100);
		stable[8] = new Horse("Fire Star", 66, 380);
		stable[9] = new Horse("Star Catch", 68, 387);
	}

	public void showHorses() {
		for (int i = 0; i < stable.length; i++) {
			int j = i + 1;
			System.out.println("№" + j + " Name: " + stable[i].getName() + " Speed: " + stable[i].getSpeed()
					+ " DelayTime: " + stable[i].getDelayTime());
		}
	}

	private String getBets() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Select a number of horse...");
		int numberOfHorse = scanner.nextInt() - 1;
		String nameOfHorse = stable[numberOfHorse].getName();
		System.out.println("...and make your bets");
		int bets = scanner.nextInt();

		Cashbox cashboxHuman = new Cashbox(numberOfHorse, bets);

		allBets[0] = cashboxHuman;
		for (int i = 1; i < allBets.length; i++) {
			numberOfHorse = (int) (Math.random() * 10);
			bets = (int) (Math.random() * 1000 + 100);
			allBets[i] = new Cashbox(numberOfHorse, bets);
		}
		return nameOfHorse;
	}

	private boolean isWinner(String selectionOfHuman) {
		return stable[0].getName().equals(selectionOfHuman);
	}

	public void startRace() {

		String selection = getBets();

		for (int i = 0; i < stable.length; i++) {
			stable[i].run();
		}
		stable = bubbleSorter.bubbleSort(stable);
		System.out.println("results:");
		for (int i = 0; i < stable.length; i++) {
			int j = i + 1;
			System.out.println("№" + j + " " + stable[i].getName() + " " + stable[i].getTime());
		}
		boolean result = isWinner(selection);
		if (result) {
			System.out.println("You Won!!! Your prize is " + allBets[0].getBank());
		} else {
			System.out.println("You lose");
		}
	}

}
