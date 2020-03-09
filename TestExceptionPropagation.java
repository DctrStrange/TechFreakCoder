
public class TestExceptionPropagation {

	void master() {
		int newer = 20/0;
	}
	void next() {
		master();
	}
	void previous() {
		try {
			next();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		TestExceptionPropagation test = new TestExceptionPropagation();
		test.previous();
		System.out.println("Normal Flow....");
	}

}
