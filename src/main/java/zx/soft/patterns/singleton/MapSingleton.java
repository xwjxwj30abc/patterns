package zx.soft.patterns.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 利用缓存实现单例模式
 * @author fgq
 *
 */
public class MapSingleton {

	//定义默认key，用来标志在缓存中的存放
	private final static String DEFAULT_KEY = "one";

	//缓存实例的容器
	private static Map<String, MapSingleton> map = new HashMap<String, MapSingleton>();

	//私有化构造方法
	private MapSingleton() {
		//
	}

	public static MapSingleton getInstance() {
		//先从缓存中获取
		MapSingleton instance = map.get(DEFAULT_KEY);
		if (instance == null) {
			//如果没有，就新建一个，然后设置回缓存中
			instance = new MapSingleton();
			map.put(DEFAULT_KEY, instance);
		}
		return instance;
	}
}
