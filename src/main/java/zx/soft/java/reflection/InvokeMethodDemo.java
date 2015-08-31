package zx.soft.java.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeMethodDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
	IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException,
	InvocationTargetException {
		Class c = Class.forName("zx.soft.java.reflection.TestClass");
		Object target = c.newInstance();
		Class[] params1 = { int.class };
		Method setAgeMethod = c.getMethod("setAge", params1);
		Object[] argObjs1 = { 2 };
		setAgeMethod.invoke(target, argObjs1);
		System.out.println(target.toString());
		Class[] params2 = { String.class };
		Method setNameMethod = c.getMethod("setName", params2);
		Object[] argObjs2 = { "xwj" };
		setNameMethod.invoke(target, argObjs2);
		System.out.println(target.toString());
		Method privateMethod = c.getDeclaredMethod("updateAge", params1);
		Object[] updateage = { 3 };
		privateMethod.setAccessible(true);
		privateMethod.invoke(target, updateage);

		System.out.println(target.toString());

	}
}
