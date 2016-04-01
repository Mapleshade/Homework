package ru.kpfu.itis.group11506.queueExample;

public class QueueOutOfBoundException extends Exception {
	
	public QueueOutOfBoundException(String message) {
		super (message);
	}
	
	public QueueOutOfBoundException(Throwable cause) {
		super (cause);
	}
	
	public QueueOutOfBoundException(String message, Throwable cause) {
		super (message, cause);
	}
}
