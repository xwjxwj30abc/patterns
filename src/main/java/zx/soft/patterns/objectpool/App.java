package zx.soft.patterns.objectpool;

public class App {

	public static void main(String[] args) {

		UserPool pool = new UserPool();
		pool.create();
		pool.checkOut();
		System.out.println(pool);

		pool.checkOut();
		System.out.println(pool);
	}

}
