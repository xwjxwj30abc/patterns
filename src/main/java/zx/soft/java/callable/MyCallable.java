package zx.soft.java.callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Long> {

	private int time;

	public MyCallable(int time) {
		this.time = time;

	}

	@Override
	public Long call() throws Exception {
		long start = System.currentTimeMillis();
		Thread.sleep(time);
		return System.currentTimeMillis() - start;
	}

}
