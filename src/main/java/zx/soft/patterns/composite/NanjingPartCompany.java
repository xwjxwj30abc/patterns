package zx.soft.patterns.composite;

public class NanjingPartCompany extends Company {

	public NanjingPartCompany(String name) {
		super(name);
	}

	@Override
	public void displayMe() {
		System.out.println("nanjing part department:" + this.getName());
	}

}
