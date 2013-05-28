package kr.ss.test;

public class Calc {

	public Object add(int i, int j) {
		return i + j;
	}

	public Object subtract(int i, int j) {
		return i - j;
	}

	public Object multiply(int i, int j) {
		return i * j;
	}

	public Object divide(int i, int j) {
		if (j == 0) {
			return  -1;
		}
			
		return i / j;
	}

}
