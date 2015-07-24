package zx.soft.patterns.composite;

public class SaleDepartment extends Company {

	public SaleDepartment(String name) {
		super(name);
	}

	@Override
	public void displayMe() {
		System.out.println("sale department:" + this.getName());
	}

}
