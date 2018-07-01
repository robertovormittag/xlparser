package net.robertovormittag.xlparser;

import java.util.List;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {

	private List<String> list;

	/* runs once before all tests */
	@BeforeClass
	public static void beforeClassSetUp() {
		System.out.println("@BeforeClass");
	}

	/* runs once after all tests */
	@AfterClass
	public static void afterClassTearDown() {
		System.out.println("@AfterClass");
	}

	/* runs before every test */
	@Before
	public void setUp() {
		list = new ArrayList<String>();
		System.out.println("@Before");
	}

	/* runs after every test */
	@After
	public void tearDown() {
		list.clear();
		System.out.println("@After");
	}

	/* test case */
	@Test
	public void testEmptyList() {
		assertTrue(list.isEmpty());
		System.out.println("@Test:testEmptyList");
	}

	/* another test case */
	@Test
	public void testOneItemList() {
		list.add("one");
		assertEquals(1, list.size());
		System.out.println("@Test:testOneItemList");
	}

}
