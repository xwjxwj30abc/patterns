package zx.soft.patterns.decorator;

public class HardBoundDepartment implements House {

	private House house;

	public HardBoundDepartment(House house) {
		this.house = house;
	}

	@Override
	public void decoratorRoom() {
		System.out.println("add secretary");
		house.decoratorRoom();
	}

	@Override
	public void decoratorKichen() {
		System.out.println("add table");
		house.decoratorKichen();
	}

	@Override
	public void decoratorWashRoom() {
		System.out.println("add stinkpot");
		house.decoratorWashRoom();
	}

}
