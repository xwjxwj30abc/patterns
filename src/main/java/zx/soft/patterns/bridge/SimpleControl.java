package zx.soft.patterns.bridge;

public class SimpleControl extends Control {

	public SimpleControl(TV tv) {
		super(tv);
		System.out.println("use simple control");
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
