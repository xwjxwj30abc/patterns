package zx.soft.patterns.callback;

public class App {

	public static void main(String[] args) {
		Li li = new Li();
		Wang wang = new Wang(li);
		System.out.println(wang.doTask(2, 4));
	}
}
