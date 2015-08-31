package zx.soft.patterns.proxy.decorator;

public class App {

	public static void main(String[] args) {

		People people = new Engineer();
		int age = EngineerProxy.getProxy(people).showAge();
		System.out.println(age);
	}
}
