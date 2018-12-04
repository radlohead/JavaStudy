package Example;

public class Java_ClassVarMethod {

	public static void main(String[] args) {
		Calculator cl = new Calculator();
		
		System.out.println(Calculator.PI);
		System.out.println(cl.left);
		
		cl.sum();
		
		Calculator2.sum(30, 40);
	}
}

class Calculator {
	static double PI = 3.14;
	byte left = 10;
	byte right = 20;
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
}

class Calculator2 {
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
}
