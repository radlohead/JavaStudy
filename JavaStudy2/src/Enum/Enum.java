package Enum;

enum Company {
	Apple("애플"), Mircosoft("마소");
	
	private String name;
	
	String getType() {
		return this.name;
	}
	
	Company(String name) {
		this.name = name;
	}
}

public class Enum {
	public static void main(String[] args) {
		Company[] c = Company.values();
		for(Company value: c) {
			System.out.println(value + ":" + value.getType());			
		}
	}
}