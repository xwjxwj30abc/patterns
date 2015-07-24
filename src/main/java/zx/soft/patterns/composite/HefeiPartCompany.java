package zx.soft.patterns.composite;

public class HefeiPartCompany extends Company {

	public HefeiPartCompany(String name) {
		super(name);
	}

	@Override
	public void displayMe() {
		System.out.println("hefei part department:" + this.getName());
	}

}
