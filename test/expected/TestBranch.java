public class TestBranch {
	public void f(boolean flag) {
		A a = new A();
		a.f();
		if (flag) {
			a.g1();
		} else {
			a.g2();
		}
		a.h();
	}
}
