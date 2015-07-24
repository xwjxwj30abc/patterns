package zx.soft.patterns.bridge;

public class SonyTV extends TV {

	@Override
	public void on() {
		System.out.println("sony tv on");
	}

	@Override
	public void off() {
		System.out.println("sony tv off");
	}

	@Override
	public void swittchChannel(int channel) {
		System.out.println("change channel to" + channel);
	}

}
