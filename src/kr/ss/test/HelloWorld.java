package kr.ss.test;

public class HelloWorld {

	public String getString() {
		return "�ȳ��ϼ��� World";
	}

	public String getString(String name) {
		if (name == null){
			name = "World";
		}
			
		return "�ȳ��ϼ��� " + name;
	}

}
