package Interface;

interface C {
	public void A();
	
//	interface는 private을 가질수 없다. 오로지 public만 가질수 있다.
//	private void E();
}

interface D extends C {
	public int B();
}

public class Example3 implements D {
	public void A() {
		
	}
	
	public int B() {
		return 1;
	}
}
