package zx.soft.java.reflection;

public class ForNameDemoV3 {
	public static void main(String[] args) {

		try {
			System.out.println("load TestClass");
			ClassLoader loader = ForNameDemoV3.class.getClassLoader();
			//loadClass() 不會在載入類別時執行靜態區塊，而會在使用類別新建实例時才執行靜態區塊
			Class c = loader.loadClass("zx.soft.java.reflection.TestClass");
			System.out.println("声明变量");
			TestClass test = null;
			System.out.println("创建实例");
			test = new TestClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
