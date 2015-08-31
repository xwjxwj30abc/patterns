package zx.soft.patterns.proxy.decorator;

import java.lang.reflect.Proxy;

public class EngineerProxy {

	public static People getProxy(People people) {
		return (People) Proxy.newProxyInstance(People.class.getClassLoader(), new Class[] { People.class },
				new LoggerHandler<People>(people));
	}
}
