package zx.soft.java.reflection;

public class TestClass {
	static {
		System.out.println("执行静态块");
	}

	private int age;
	private String name;

	public TestClass() {
	}

	public TestClass(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	private void updateAge(int newAge) {
		this.age = newAge;
	}

	@Override
	public String toString() {
		return "TestClass [age=" + age + ", name=" + name + "]";
	}

}
