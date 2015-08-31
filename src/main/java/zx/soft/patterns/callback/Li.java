package zx.soft.patterns.callback;

public class Li {

	public int execute(int i, int j, Callback callback) {
		if (callback.way() == 3) {
			return i * j;
		}
		if (callback.way() == 2) {
			return i + j;
		}
		return 0;
	}

}
