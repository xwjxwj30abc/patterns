package zx.soft.java.reflection;

public class ForNameDemoV2 {
	public static void main(String[] args) {
		try {
			System.out.println("load TestClass");
			Class c = Class.forName("zx.soft.java.reflection.TestClass", false, Thread.currentThread()
					.getContextClassLoader());
			System.out.println("声明");
			TestClass test = null;
			System.out.println("创建实例");
			test = new TestClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
