package zx.soft.java.reflection;

public class ClassDemo {

	public static void main(String[] args) {
		String name = "xuwenjuan";
		Class stringClass = name.getClass();
		System.out.println(stringClass.getName());
		System.out.println(stringClass.isInterface());
		System.out.println(stringClass.isPrimitive());
		System.out.println(stringClass.isArray());
		System.out.println(stringClass.getSuperclass().getName());
	}
}
