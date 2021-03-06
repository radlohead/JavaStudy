package Example;

import java.util.Calendar;

public class Java_TypeCheck {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		Typetester test = new Typetester();
		test.printType(cal.get(Calendar.YEAR));
		
		cal.add(Calendar.DATE, 365);
		
		String str = String.valueOf(cal.get(Calendar.YEAR));
		test.printType(str);
	}
}

class Typetester {
	void printType(byte x) {
		System.out.println(x + " is an byte");
	}
	
	void printType(int x) {
		System.out.println(x + " is an int");
	}

	void printType(float x) {
		System.out.println(x + " is an float");
	}
	
	void printType(double x) {
		System.out.println(x + " is an double");
	}
	
	void printType(char x) {
		System.out.println(x + " is an char");
	}
	
	void printType(String x) {
		System.out.println(x + " is an String");
	}
}