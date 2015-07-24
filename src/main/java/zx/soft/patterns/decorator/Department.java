package zx.soft.patterns.decorator;

public class Department implements House {

	@Override
	public void decoratorRoom() {
		System.out.println("add bed");
	}

	@Override
	public void decoratorKichen() {
		System.out.println("add pot");
	}

	@Override
	public void decoratorWashRoom() {
		System.out.println("add washstand");
	}

}
