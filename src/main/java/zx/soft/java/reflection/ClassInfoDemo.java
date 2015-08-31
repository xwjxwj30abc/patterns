package zx.soft.java.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ClassInfoDemo {
	public static void main(String[] args) {

		try {
			Class c = Class.forName("zx.soft.java.reflection.TestClass");
			Package p = c.getPackage();
			System.out.println(p.getName());

			int m = c.getModifiers();
			System.out.println(Modifier.toString(m) + "");
			if (Modifier.isInterface(m)) {
				System.out.println("interface");
			} else {
				System.out.println("class");
			}

			Field[] fields = c.getDeclaredFields();
			for (Field field : fields) {
				System.out.println(Modifier.toString(field.getModifiers()));
				System.out.println(field.getType().getName());
				System.out.println(field.getName());
			}

			Constructor[] cons = c.getDeclaredConstructors();
			for (Constructor con : cons) {
				System.out.println(Modifier.toString(con.getModifiers()));
				System.out.println(con.getName());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
