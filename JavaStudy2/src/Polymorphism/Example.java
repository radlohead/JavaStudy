package Polymorphism;

class Poly {
	public int A(int num) {
		return num;
	}
	
	public String A(String str) {
		return str;
	}
}

public class Example {
	public static void main(String[] args) {
		Poly poly = new Poly();
		System.out.println(poly.A(10));
		System.out.println(poly.A("다형성"));
	}
}
