package zx.soft.java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewInstanceDemo {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("zx.soft.java.reflection.TestClass");
		Class[] params = new Class[2];
		params[0] = int.class;
		params[1] = String.class;

		Constructor con = c.getConstructor(params);

		Object[] argObjs = new Object[2];
		argObjs[0] = 2;
		argObjs[1] = "lfsdg";
		Object obj = con.newInstance(argObjs);
		System.out.println(obj);

	}
}
