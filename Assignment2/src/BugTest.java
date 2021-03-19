import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class BugTest {
	Tester tester;
	Bug bug;
	Developer developer;

	@BeforeEach
	void init() {
		tester = new Tester(11);
		developer = new Developer(11);
		bug = tester.createBugReport(1f, new Date(11 / 11 / 11), 11, "first", 11, SEVERITY.LEVEL1);

	}

	@Test
	void test() {
		Bug bug1 = tester.createBugReport(1f, new Date(11 / 11 / 11), 11, "first", 11, SEVERITY.LEVEL1);
		Assert.assertEquals(bug.getClass(), (bug1.getClass()));
	}

	@Test
	void testSetBugStatus() {
		int i = developer.setBugStatus(bug, STATUS.FIXED);
		Assert.assertEquals(1, i);

	}

}
