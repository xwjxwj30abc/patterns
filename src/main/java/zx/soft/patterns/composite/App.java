package zx.soft.patterns.composite;

public class App {

	public static void main(String[] args) {
		System.out.println("************************");
		FinacialDepartment fi = new FinacialDepartment("finacial department 1");
		fi.displayAll();
		System.out.println("************************");
		ResourceDepartment re = new ResourceDepartment("resource department 2");
		re.displayAll();
		System.out.println("************************");
		HefeiPartCompany hefei = new HefeiPartCompany("hefei 分公司");
		hefei.add(fi);
		hefei.add(re);
		hefei.displayAll();
		System.out.println("************************");

		SaleDepartment sa = new SaleDepartment("sale department 1");
		sa.displayAll();
		System.out.println("************************");
		NanjingPartCompany nanjing = new NanjingPartCompany("nanjing　分公司");
		nanjing.add(sa);
		nanjing.displayAll();
		System.out.println("************************");

		HeadCompany head = new HeadCompany("中国总公司");
		head.add(hefei);
		head.add(nanjing);
		head.displayAll();
		System.out.println("************************");

	}
}
