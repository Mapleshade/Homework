package ru.kpfu.itis.group11506.game;

public class Game {
	
	//объявление необходимых переменных;
	private Player firstPlayer = new StupidPlayer();
	private Player secondPlayer = new SmartPlayer();
	private figure firstFigure = null;
	private figure secondFigure = null;
	private int countMin;
	private int countFirstPlayer;
	private int countSecondPlayer;
	private boolean checkInGenerate;
	private boolean check;
	private int win;
	
	//метод, отвечающий за ходы игроков и проверяющий, совпадают ли они;
	public boolean generate() {
		
		firstFigure = firstPlayer.showFigure();
		secondFigure = secondPlayer.showFigure();
		checkInGenerate = figure.compareFigure(firstFigure, secondFigure);
		return checkInGenerate;
		
	}

	//метод, осуществляющий непосредственно игру;
	public void start(int countMax) {
		
		//до тех пор, пока небудет совершенно заданное количество игр, не включая ничьи;
		while (countMin < countMax) {
			
			//объявление номера игры и генерация ходов игроков;
			System.out.println("Game number: " + countMin);
			check = generate();
			
			//если ходы игроков не совпадают, то вывод их ходов и промежуточный подсчет их побед;
			if (!check) {
				
				countMin = countMin + 1;
				win = figure.compareFigureGlobal(firstFigure, secondFigure);
				System.out.println("First Player (stupid): " + firstFigure);
				System.out.println("Second Player (smart): " + secondFigure);
				System.out.println();
				
				if (win == 1) {
					countFirstPlayer = countFirstPlayer + 1;
				}

				if (win == 2) {
					countSecondPlayer = countSecondPlayer + 1;
				}
			} else {
				check = generate();
			}
		}
		
		//определение победителя;
		if (countFirstPlayer > countSecondPlayer) {
			System.out.println("score: " + countFirstPlayer + " > " + countSecondPlayer);
			System.out.println("Stupid Player win!");
		}

		if (countFirstPlayer < countSecondPlayer) {
			System.out.println("score: " + countFirstPlayer + " < " + countSecondPlayer);
			System.out.println("Smart Player win!");
		}

		if (countFirstPlayer == countSecondPlayer) {
			System.out.println("score: " + countFirstPlayer + " = " + countSecondPlayer);
			System.out.println("dead head");
		}
	}
}
