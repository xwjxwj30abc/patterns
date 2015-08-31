package zx.soft.java.reflection;

public class SomeClass {
	public static void main(String[] args) {
		SomeClass some = new SomeClass();
		Class c = some.getClass();
		ClassLoader loader = c.getClassLoader();
		System.out.println(loader);
		System.out.println(loader.getParent());
		System.out.println(loader.getParent().getParent());
	}
}
