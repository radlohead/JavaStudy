package Example;

public class Java_Generic {
	public static <T> void main(String[] args) {		
		Name<String> name = new Name<String>();
		
		name.setName("minho");
		
		System.out.println(name.getName());
		
		Age<Integer> integerAge = new Age<Integer>();
		Age<String> stringAge = new Age<>();
		
		integerAge.setAge(36);
		stringAge.setAge("thirty-six");
		
		System.out.println(integerAge.getAge());
		System.out.println(stringAge.getAge());
	}
}

class Name<T> {
	T name;
	
	void setName(T name) {
		this.name = name;
	}
	
	T getName() {
		return name;
	}
}

class Age<T> {
	T age;
	
	void setAge(T age) {
		this.age = age;
	}
	
	T getAge() {
		return age;
	}
}