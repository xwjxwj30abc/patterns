package zx.soft.patterns.callback;

public class Wang implements Callback {

	private Li li;

	public Wang(Li li) {
		this.li = li;
	}

	public int doTask(int i, int j) {
		return li.execute(i, j, Wang.this);
	}

	@Override
	public int way() {
		return 2;
	}

}
