package ru.kpfu.itis.group11506.game;

public class SmartPlayer extends Player {
	
	//объявление необходимых переменных;
	private int variant;
	private figure example = null;
	
	//случайный выбор фигуры;
	public figure showFigure() {

		variant = (int)(Math.random() * 3);

		if (variant == 0) {
			example = figure.STONE;
			return example;
		}

		if (variant == 1) {
			example = figure.PAPER;
			return example;
		}
		
		if (variant == 2) {
			example = figure.SCISSORS;
			return example;
		}
		
		return example;
	}
}
