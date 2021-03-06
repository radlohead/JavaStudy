package Example;

class Java_ContructorV3 {
	int left;
	int right;
	
	public Java_ContructorV3 () {
		
	}
	
	public Java_ContructorV3 (int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public int sum(int left, int right) {
		return left + right;
	}
	
	public void print() {
		System.out.println("Java_ContructorV3 print입니다.");
	}
}

public class Java_ContructorV2 extends Java_ContructorV3 {
	public Java_ContructorV2() {
	}
	
	public Java_ContructorV2(int left, int right) {
		super(left, right);
	}
	
	public int sumV2() {
		return this.left + this.right;
	}
	
	public int sumV2(int left, int right) {
		return left + right;
	}
	
	public void print() {
		System.out.print("Java_ContructorV2 print입니다.");
	}
	
	public static void main(String[] args) {
		Java_ContructorV2 c2 = new Java_ContructorV2(10, 20);
		Java_ContructorV3 c1 = new Java_ContructorV3();
		System.out.println(c2.left + c2.right);
		System.out.println(c2.sumV2());
		System.out.println(c2.sumV2(30, 40));
		System.out.println(c1.sum(40, 60));
		c2.print();
	}
}