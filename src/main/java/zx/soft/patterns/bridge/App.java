package zx.soft.patterns.bridge;

public class App {

	public static void main(String[] args) {

		Control control = new SimpleControl(new SonyTV());
		control.takeon();
		control.channgeChannel(1);
		control.takeoff();
		System.out.println();
		control = new SimpleControl(new SamTV());
		control.takeon();
		control.channgeChannel(2);
		control.takeoff();
		System.out.println();
		control = new ComplexControl(new SonyTV());
		control.takeon();
		control.channgeChannel(3);
		control.takeoff();
		System.out.println();
	}
}
