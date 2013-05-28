package kr.ss.test;

public class HelloWorld {

	public String getString() {
		return "æ»≥Á«œººø‰ World";
	}

	public String getString(String name) {
		if (name == null){
			name = "World";
		}
			
		return "æ»≥Á«œººø‰ " + name;
	}

}
