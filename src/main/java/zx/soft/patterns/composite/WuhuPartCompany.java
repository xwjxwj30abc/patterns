package zx.soft.patterns.composite;

public class WuhuPartCompany extends Company {

	public WuhuPartCompany(String name) {
		super(name);
	}

	@Override
	public void displayMe() {
		System.out.println("wuhu part department:" + this.getName());
	}

}
