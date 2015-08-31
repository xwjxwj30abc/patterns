package zx.soft.patterns.proxy.generic;

public class Teacher implements People {

	@Override
	public String showName() {
		return "i am a teacher";
	}

	@Override
	public int showAge() {
		return 10;
	}

}
