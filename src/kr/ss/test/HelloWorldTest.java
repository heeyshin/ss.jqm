package kr.ss.test;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {
	private static final String GREETING = "안녕하세요 ";
	HelloWorld hello;

	@Override
	protected void setUp() throws Exception {
		hello = new HelloWorld();
		super.setUp();
	}

	public void testGetString() throws Exception {
		String string = hello.getString();
		assertEquals(GREETING + "World", string);
	}

	public void testGetStringWithName() throws Exception {
		String name = "이효리";
		String string = hello.getString(name);
		assertEquals(GREETING + "이효리", string);
	}

	public void testGetStringWithNameOther() throws Exception {
		String name = "옥택연";
		String string = hello.getString(name);
		assertEquals(GREETING + "옥택연", string);
	}

	public void testGetStringNull() throws Exception {
		String name = null;
		String string = hello.getString(name);
		assertEquals(GREETING + "World", string);
	}
}
