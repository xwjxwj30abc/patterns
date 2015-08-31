package zx.soft.patterns.proxy.generic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 通用的限制适配器工厂类
 * @author xuwenjuan
 *
 */
public class GenericProxyFactory {

	//通过使用泛型，创建通用的代理工厂，由它为任何接口做同样的工作.
	//什么都不做的包装器来说，有个很好的应用 —— 可以用它安全地把对象引用的范围缩小到特定接口（或接口集）上
	@SuppressWarnings("unchecked")
	public static <T> T getProxy(Class<T> t, final Object obj) {
		return (T) Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class[] { t }, new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				return method.invoke(obj, args);
			}
		});
	}
}
