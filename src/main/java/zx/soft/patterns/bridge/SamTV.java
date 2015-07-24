package zx.soft.patterns.bridge;

public class SamTV extends TV {

	@Override
	public void on() {
		System.out.println("sam tv on");
	}

	@Override
	public void off() {
		System.out.println("sam tv off");
	}

	@Override
	public void swittchChannel(int channel) {
		System.out.println("change channel to " + channel);
	}

}
