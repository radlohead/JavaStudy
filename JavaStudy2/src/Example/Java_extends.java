package Example;

public class Java_extends {

	public static void main(String[] args) {
		SubstratCalculator c1 = new SubstratCalculator();
		c1.setState(50, 20);
		System.out.println(c1.substrat());
		System.out.println(c1.sum());
	}

}

class CalculatorV3 {
	int left;
	int right;
	
	public void setState (int left, int right){
		this.left = left;
		this.right = right;
	}
	
	public int sum() {
		return this.left + this.right;
	}
}

class SubstratCalculator extends CalculatorV3 {
	public int substrat (){
		return this.left - this.right;
	}
}