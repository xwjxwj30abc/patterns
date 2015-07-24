package zx.soft.patterns.composite;

public class ResourceDepartment extends Company {

	public ResourceDepartment(String name) {
		super(name);
	}

	@Override
	public void displayMe() {
		System.out.println("resource department:" + this.getName());
	}

}
