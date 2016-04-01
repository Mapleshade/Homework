package ru.kpfu.itis.group11506.queueExample;

import java.util.Arrays;

public class Kitchen {

	private Client[] clients;

	public Kitchen(Client[] clients) {
		this.clients = clients;
	}

	public void sort() {
		Arrays.sort(clients, new SortedByRating());
	}

	public void show() {
		for (Client i : clients) {
			System.out.println("заказ: " + i.getOrder() + " приоритет: " + i.getRating());
		}
	}
}
