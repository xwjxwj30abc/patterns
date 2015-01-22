package zx.soft.patterns.singleton;

/**
 * 利用静态内部类实现单例模式
 * @author fgq
 *
 */
public class Singleton {

	private static class SingletonHolder {
		private static Singleton instance = new Singleton();
	}

	private Singleton() {
		//
	}

	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}

}
