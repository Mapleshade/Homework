package ru.kpfu.itis.group11506.multiThread;

public class Horse implements Runnable {

	private String name;
	private int speed;
	private int delayTime;
	private int distance = 0;
	private long time = 0;

	public Horse(String name, int speed, int delayTime) {
		this.setName(name);
		this.setSpeed(speed);
		this.setDelayTime(delayTime);
	}

	public int getDelayTime() {
		return delayTime;
	}

	public void setDelayTime(int delayTime) {
		this.delayTime = delayTime;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getTime() {
		return time;
	}

	@Override
	public void run() {
		// забег одной лошади на дистанцию 5000
		long start = System.nanoTime();
		while (distance < 5000) {
			try {
				distance += speed;
				Thread.sleep(delayTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		long end = System.nanoTime();
		time = (long) ((end - start) / (Math.pow(10, 9)));
	}

}
