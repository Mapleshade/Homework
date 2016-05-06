package ru.kpfu.itis.group11506.multiThread;

public class Cashbox {
	private int rate;
	private static int cash;
	private int numberOfHorse;

	public Cashbox(int numberOfHorse, int rate) {
		this.setNumberOfHorse(numberOfHorse);
		this.setRate(rate);
		countCash(rate);
	}

	public void countCash(int rate) {
		cash = cash + rate;
	}

	public double getBank() {
		return cash;
	}

	public int getNumberOfHorse() {
		return numberOfHorse;
	}

	public void setNumberOfHorse(int numberOfHorse) {
		this.numberOfHorse = numberOfHorse;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

}
