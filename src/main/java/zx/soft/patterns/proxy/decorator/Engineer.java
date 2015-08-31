package zx.soft.patterns.proxy.decorator;

public class Engineer implements People {

	@Override
	public String showName() {
		return "i am engineer";
	}

	@Override
	public int showAge() {
		return 22;
	};

}
