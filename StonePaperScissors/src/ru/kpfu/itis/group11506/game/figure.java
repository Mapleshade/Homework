package ru.kpfu.itis.group11506.game;

public enum figure {
	
	STONE, PAPER, SCISSORS;
	
	//проверка на наличие повторений;
	public static boolean compareFigure(figure first, figure second) {

		if (first == second) {
			System.out.println("dead heat");
			return true;
			}
		return false;
	}
	
	//определение победителя в данной партии;
	public static int compareFigureGlobal(figure first, figure second) {

		if ((first == figure.STONE) && (second == figure.PAPER)) {
			return 2;
		}

		if ((first == figure.STONE) && (second == figure.SCISSORS)) {
			return 1;
		}

		if ((first == figure.PAPER) && (second == figure.SCISSORS)) {
			return 2;
		}

		if ((first == figure.PAPER) && (second == figure.STONE)) {
			return 1;
		}

		if ((first == figure.SCISSORS) && (second == figure.PAPER)) {
			return 1;
		}

		if ((first == figure.SCISSORS) && (second == figure.STONE)) {
			return 2;
		}

		return 0;
	}
}
