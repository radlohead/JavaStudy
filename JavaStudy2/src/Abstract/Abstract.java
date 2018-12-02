package Abstract;

abstract class A {
	public abstract int num();
}

class B extends A {
	public int num() {
		return 10;
	}
}

public class Abstract {	
	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.num());
	}
}