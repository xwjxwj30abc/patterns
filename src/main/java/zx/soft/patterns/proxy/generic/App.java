package zx.soft.patterns.proxy.generic;

public class App {
	public static void main(String[] args) {

		Teacher user = new Teacher();
		int age = GenericProxyFactory.getProxy(People.class, user).showAge();
		System.out.println(age);
	}
}
