package Generic;

class Person2<T, S> {
	public T name;
	public S age;
	Person2(T name, S age){
		this.name = name;
		this.age = age;
	}
}

public class Example2 {
	public static void main(String[] args) {
		Person2<String, Integer> s1 = new Person2<String, Integer>("minho", 36);
		System.out.println(s1.name +":"+ s1.age);
	}
}
