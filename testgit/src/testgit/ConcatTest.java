package testgit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatTest {

	@Test
	public void testConcatenate() {
		String result = testfirst.concatenate("oe", "two");
		assertEquals("onetwo",result);
	}

}
