package Example;

public class Java_tryCatch {

	public static void main(String[] args) {
		String[] classGroup = new String[3];
		classGroup[0] = "aaa";
		classGroup[1] = "aaa";
		classGroup[2] = "aaa";
		
		try {
			classGroup[3] = "bbb";
			
			System.out.println("complete");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error: " + e);
		}
	}
}
