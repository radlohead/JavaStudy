package Collections;

import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		String[] arr = new String[2];
		arr[0] = "a";
		arr[1] = "b";
//		arr[2] = "c";
		System.out.println(arr);
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("a");
		arr2.add("b");
		arr2.add("c");
		for(int i = 0; i < arr2.size(); i++) {
			String val = arr2.get(i);
			System.out.println(val);
		}
	}

}
