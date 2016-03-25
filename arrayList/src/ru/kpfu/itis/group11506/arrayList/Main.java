package ru.kpfu.itis.group11506.arrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		
		int size = arrayList.length();
		System.out.println("длина массива " + size);
		System.out.println("второй элемент " + arrayList.get(1));
		arrayList.set(1, 10);
		System.out.println("замена второго элемента " + arrayList.get(1));

	}

}
