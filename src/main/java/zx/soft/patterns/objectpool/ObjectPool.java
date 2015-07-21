package zx.soft.patterns.objectpool;

import java.util.HashSet;

public abstract class ObjectPool<T> {

	private HashSet<T> avaliable = new HashSet<>();
	private HashSet<T> inuse = new HashSet<>();

	protected abstract T create();

	public synchronized T checkOut() {
		if (avaliable.size() <= 0) {
			avaliable.add(create());
		}
		T instance = avaliable.iterator().next();
		avaliable.remove(instance);
		inuse.add(instance);
		return instance;
	}

	public synchronized void checkIn(T instance) {
		avaliable.add(instance);
		inuse.remove(instance);
	}

	@Override
	public String toString() {
		return String.format("Pool available=%d  inuse=%d", avaliable.size(), inuse.size());
	}
}
