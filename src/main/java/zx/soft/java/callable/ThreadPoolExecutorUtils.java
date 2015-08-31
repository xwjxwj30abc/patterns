package zx.soft.java.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorUtils {

	public static ExecutorService createExecutor(int corePoolThread) {
		final ExecutorService executor = Executors.newFixedThreadPool(corePoolThread);
		return executor;
	}
}
