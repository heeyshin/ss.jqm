package kr.ss.test;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {
	private static final String GREETING = "�ȳ��ϼ��� ";
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
		String name = "��ȿ��";
		String string = hello.getString(name);
		assertEquals(GREETING + "��ȿ��", string);
	}

	public void testGetStringWithNameOther() throws Exception {
		String name = "���ÿ�";
		String string = hello.getString(name);
		assertEquals(GREETING + "���ÿ�", string);
	}

	public void testGetStringNull() throws Exception {
		String name = null;
		String string = hello.getString(name);
		assertEquals(GREETING + "World", string);
	}
}
