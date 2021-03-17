
public class ExceptionPropogation {
	public static void main(String[] args) {
		new A().m1();
	}
}

class A {
	void m1() {
		try {
			m2();
		} catch (RuntimeException runtimeException) {
			System.out.println("l");

			runtimeException.printStackTrace();
		} catch (Exception exception) {
			System.out.println("here");
		} finally {
			System.out.println("always");
		}
		System.out.println("last");
	}

	void m2() throws Exception {
		System.out.println("b");
		throw new Exception();
		// throw new RuntimeException();

	}
}
