package zx.soft.patterns.prototype;

public class ConcretePrototype2 implements Prototype {

	@Override
	public Prototype clone() {
		Prototype prototype = new ConcretePrototype2();
		return prototype;
	}
}
