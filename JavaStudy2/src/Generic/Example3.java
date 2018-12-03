package Generic;

abstract class Info {
	public abstract int getLevel();
}

class EmployeeInfo extends Info {
	public int rank;
	
	EmployeeInfo(int rank) {
		this.rank = rank;
	}
	
	public int getLevel() {
		return this.rank;
	}
}

class Person3<T extends Info> {
	public T info;
	
	Person3(T info) {
		this.info = info;
	}
}

public class Example3 {

	public static void main(String[] args) {
		Person3<EmployeeInfo> p = new Person3<EmployeeInfo>(new EmployeeInfo(10));
//		Person3<String> p1 = new Person3<String>("minho");
		
		System.out.println(p.info.rank);
	}

}
