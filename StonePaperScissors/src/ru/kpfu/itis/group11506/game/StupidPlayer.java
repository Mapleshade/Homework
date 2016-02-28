package ru.kpfu.itis.group11506.game;

public class StupidPlayer extends Player {
	
	//объявление необходимых переменных;
	private int variant;
	private figure example = null;
	
	//случайный выбор фигуры;
	public figure showFigure() {

		variant = (int) (Math.random() * 2);

		if (variant == 0) {
			example = figure.STONE;
			return example;
		}
		
		if (variant == 1) {
			example = figure.PAPER;
			return example;
		}
		
		return example;
	}
}
