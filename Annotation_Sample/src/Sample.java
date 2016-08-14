public class Sample {
	@ExceptionTest(ArithmeticException.class)
	public static void m1() {
		int i = 0;
		i = i / i;
	}

	@ExceptionTest(ArithmeticException.class)
	public static void m2() {
		int[] a = new int[0];
		int i = a[1];
	}

	@ExceptionTest(RuntimeException.class)
	public static void m3() {
		throw new RuntimeException("Boom");
	}

	@ExceptionTest(ArithmeticException.class)
	public static void m4() {
	}

	@Test
	public static void m5() {
	}

	public static void m6() {
	}

	@ExceptionTest(RuntimeException.class)
	public static void m7() {
		throw new RuntimeException("Crash");
	}

	public static void m8() {
	}
}
