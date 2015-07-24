package zx.soft.patterns.decorator;

public class App {

	public static void main(String[] args) {
		House department = new Department();
		department.decoratorKichen();
		department.decoratorRoom();
		department.decoratorWashRoom();
		System.out.println();
		House hardBound = new HardBoundDepartment(department);
		hardBound.decoratorKichen();
		hardBound.decoratorRoom();
		hardBound.decoratorWashRoom();

	}
}
