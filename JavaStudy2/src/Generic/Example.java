package Generic;

class num {
	public int x;
	num(int x){
		this.x = x;
	}
}

class str {
	public String y;
	str(String y) {
		this.y = y;
	}
}

class Person<T> {
	public T info;
	
	Person(T info) {
		this.info = info;
	}
}

public class Example {

	public static void main(String[] args) {
		Person<num> n1 = new Person<num>(new num(36));
		num n = n1.info;
		System.out.println(n.x);
		
		Person<str> s1 = new Person<str>(new str("minho"));
		str s = s1.info;
		System.out.println(s.y);
	}

}
