package ru.kpfu.itis.group11506.exceptions;

import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) throws UserInputException {

		Scanner scanner = new Scanner(System.in);
		boolean check = false;
		System.out.println("Добро пожаловать в наше онлайн-кафе! Меню представлено ниже :)");
		Menu menu = new Menu();
		menu.showMenu();

		System.out.println("Хотите что-то заказать? (да/нет)");
		String userAnswer = scanner.next();

		check = Menu.checkAnswer(userAnswer);

		if (check) {
			System.out.println("укажите номер блюда");
			int save = scanner.nextInt();
			int[] saves = new int[] {save};
			while (check) {
				System.out.println("Что-нибудь еще? (да/нет)");
				userAnswer = scanner.next();
				check = Menu.checkAnswer(userAnswer);
				if(check){
				System.out.println("укажите номер блюда");
				save = scanner.nextInt();
				saves = Menu.saveAnswers(saves, save);
				}
			}
			System.out.println("Теперь вам необходимо зарегистрироваться");
			User user = null;
			try {
				user = UserFactory.createUser();
			} catch (UserInputException e) {
				System.err.println("ошибка пользовательского ввода " + e.getMessage());
				e.printStackTrace();
			}
			System.out.println("Выберите способ оплаты: карта, наличными (метод не доделан)");
			userAnswer = scanner.next();
			if(userAnswer.contains("карта")) {
				System.out.println("введите номер карты");
				String number = scanner.next();
				user.setCard(number);
			}
			Menu.showsOrder(saves, user, userAnswer);
		}
		
	}
}
