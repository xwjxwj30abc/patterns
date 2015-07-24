package zx.soft.patterns.bridge;

public abstract class Control {
	protected TV tv;

	public Control(TV tv) {
		this.tv = tv;
	}

	public abstract void channgeChannel(int channel);

	public abstract void takeoff();

	public abstract void takeon();

	public TV getTV() {
		return tv;
	}
}
