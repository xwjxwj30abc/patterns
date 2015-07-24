package zx.soft.patterns.bridge;

public class ComplexControl extends Control {

	public ComplexControl(TV tv) {
		super(tv);
		System.out.println("use complex control");
	}

	@Override
	public void channgeChannel(int channel) {
		getTV().swittchChannel(channel);

	}

	@Override
	public void takeoff() {
		getTV().off();
	}

	@Override
	public void takeon() {
		getTV().on();
	}

	@Override
	public TV getTV() {
		return tv;
	}

}
