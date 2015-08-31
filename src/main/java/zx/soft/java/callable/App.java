package zx.soft.java.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class App {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable callable = new MyCallable(3000);
		MyCallable callable1 = new MyCallable(6000);
		ExecutorService service = ThreadPoolExecutorUtils.createExecutor(3);
		List<Future<Long>> results = new ArrayList<>();
		Future<Long> result = service.submit(callable);
		results.add(result);
		Future<Long> result1 = service.submit(callable1);
		results.add(result1);
		service.shutdown();
		//isDone方法不会阻塞线程
		System.out.println(results.get(0).isDone());
		while (true) {
			//isTerminated方法会阻塞线程
			if (service.isTerminated()) {
				System.out.println("finish! " + System.currentTimeMillis());
				break;
			}
			System.out.println("unfinished!" + System.currentTimeMillis() + ";sleep 1s");
			//主线程让出cpu
			Thread.sleep(2000);
		}

		for (Future<Long> re : results) {
			System.out.println("thread return result" + re.get());
		}
	}
}
