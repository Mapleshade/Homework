package ru.kpfu.itis.group11506.multiThread;

public class BubbleSorter {

	public Horse[] bubbleSort(Horse[] stable) {

		for (int i = stable.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (stable[j].getTime() > stable[j + 1].getTime()) {
					Horse save = stable[j];
					stable[j] = stable[j + 1];
					stable[j + 1] = save;
				}
			}
		}
		return stable;
	}
}
