import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestMath {
	Math math;

	@BeforeEach
	void init() {
		math = new Math();
	}

	@Test
	void test() {
		int result = math.add(1, 2, 3);
		Assert.assertEquals(6, 6);
	}

	@Test
	void testMultiply1() {
		long result1 = math.multiply(2147483647, 2147483647);
		Assert.assertEquals(4611686014132420609L, result1);
	}

	@Test
	void testMultiply2() {
		long result2 = math.multiply(0, 2);
		Assert.assertEquals(0, result2);
	}

	@Test
	void testMultiply3() {
		long result3 = math.multiply(2, 3);
		Assert.assertEquals(6, result3);
	}

}
