package Example;

import java.util.Scanner;

public class Java_InputOutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			System.out.println(sc.nextInt()*1000);	
		}
		sc.close();
	}
}
