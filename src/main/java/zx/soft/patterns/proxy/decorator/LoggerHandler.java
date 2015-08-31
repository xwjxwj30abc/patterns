package zx.soft.patterns.proxy.decorator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggerHandler<T> implements InvocationHandler {

	private T underlying;

	public LoggerHandler(T underlying) {
		this.underlying = underlying;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		Object ret = method.invoke(underlying, args);
		System.out.println("decorator success");
		return ret;
	}

}
