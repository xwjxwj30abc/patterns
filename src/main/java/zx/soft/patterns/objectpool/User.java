package zx.soft.patterns.objectpool;

public class User {

	private String uid;
	private int age;

	private static int count = 0;

	public User() {
		age = count++;
	}

	@Override
	public String toString() {
		return String.format("user: uid=%s,age=%d", uid, age);
	}

}
