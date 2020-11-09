package utdpathfinder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class DestinationVerificationTest {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@Before
	public static void before() {
		System.out.println("Before Test Case");
	}
	
	@Test
	void test() {
		assertEquals(0, DestinationVerification.checkAlphaNumeric("Utd Main Building!#"));
		assertEquals(1, DestinationVerification.checkAlphaNumeric("The Plinth"));
	}

	@After
	public static void after() {
		System.out.println("After Test Case");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
