package ru.kpfu.itis.group11506.links;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		LinkedList<Integer> list = new LinkedList<>();
		list.init();
		for (int i = 0; i < 100; i++) {
			list.add(random.nextInt(100));
		}
		CycleDetector<LinkedList<Integer>> detector = list.detector();
		System.out.printf("Before deleting last");
		System.out.println("Has any cycle? " + detector.containsAnyCycle());
		System.out.println("How many cycles? " + detector.howManyCycles());
		list.removeLast();
		detector.update(list);
		System.out.println("After deleting last");
		System.out.println("Has any cycle? " + detector.containsAnyCycle());
		System.out.println("How many cycles? " + detector.howManyCycles());
		list.add(random.nextInt(100));
		detector.update(list);
		System.out.println("After adding new value");
		System.out.println("Has any cycle? " + detector.containsAnyCycle());
		System.out.println("How many cycles? " + detector.howManyCycles());

	}

}
