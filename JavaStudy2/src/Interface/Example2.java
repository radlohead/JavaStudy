package Interface;

interface A {
	public void x();
}

interface B {
	public String y();
}

public class Example2 implements A, B {
	public void x() {
		
	}
	
	public String y() {
		return "interface y";
	}
}
