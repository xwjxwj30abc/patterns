package zx.soft.patterns.composite;

public class FinacialDepartment extends Company {

	public FinacialDepartment(String name) {
		super(name);
	}

	@Override
	public void displayMe() {
		System.out.println("finacial separtment:" + this.getName());
	}

}
