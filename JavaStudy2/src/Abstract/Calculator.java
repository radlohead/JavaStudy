package Abstract;

abstract class AbstractCalculator {
	int left;
	int right;
	
	public void setState(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public abstract int sum();
	
	public abstract int avg();
	
	public int run () {
		return sum() + avg();
	}
}

class CalculatorPlus extends AbstractCalculator {
	public int sum() {
		return this.left + this.right;
	}
	
	public int avg() {
		return (this.left + this.right) / 2;
	}
}

class CalculatorMinus extends AbstractCalculator {
	public int sum() {
		return this.left - this.right;
	}
	
	public int avg() {
		return (this.left - this.right)/ 2; 
	}
}

public class Calculator {

	public static void main(String[] args) {
		CalculatorPlus c1 = new CalculatorPlus();
		c1.setState(30, 50);
		System.out.println(c1.sum());
		System.out.println(c1.avg());
		System.out.println(c1.run());
		
		CalculatorMinus c2 = new CalculatorMinus();
		c2.setState(60, 80);
		System.out.println(c2.sum());
		System.out.println(c2.avg());
		System.out.println(c2.run());
	}

}
