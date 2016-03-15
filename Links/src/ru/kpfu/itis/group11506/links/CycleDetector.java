package ru.kpfu.itis.group11506.links;

public abstract class CycleDetector<T> {

	protected T dataStructure;
	protected int cyclesCount;
	protected boolean contains;
	protected boolean hasBeenAnalyzed;

	protected CycleDetector(T target) {
		this.dataStructure = target;
		cyclesCount = 0;
		contains = false;
		hasBeenAnalyzed = false;
	}

	public abstract boolean containsAnyCycle();

	public abstract int howManyCycles();

	public abstract void update(T newTarget);
}