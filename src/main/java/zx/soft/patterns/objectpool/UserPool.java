package zx.soft.patterns.objectpool;

public class UserPool extends ObjectPool<User> {

	@Override
	protected User create() {
		return new User();
	}

}
