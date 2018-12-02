package Enum;

enum CompanyV2 {
	Apple, Microsoft
}

public class Example2 {
	public static void main(String[] args) {
		for(CompanyV2 c: CompanyV2.values()) {
			System.out.println(c);
		}
	}
}
