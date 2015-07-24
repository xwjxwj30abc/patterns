package zx.soft.patterns.composite;

public class HeadCompany extends Company {

	public HeadCompany(String name) {
		super(name);
	}

	@Override
	public void displayMe() {
		System.out.println("head company" + this.getName());
	}

}
