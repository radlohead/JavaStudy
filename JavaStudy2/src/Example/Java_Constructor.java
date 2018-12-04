package Example;

public class Java_Constructor {

	public static void main(String[] args) {
		CalculatorV2 c1 = new CalculatorV2(10, 20);
		c1.sum();
		
		CalculatorV2 c2 = new CalculatorV2(30,40);
		c2.sum();
	}

}

class CalculatorV2 {
	int left;
	int right;
	
	public CalculatorV2 (int left, int right){
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
}