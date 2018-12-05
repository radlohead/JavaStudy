package Set;

import java.util.HashSet;

public class Example {

	public static void main(String[] args) {
		HashSet<Integer> s1 = new HashSet<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		
		HashSet<Integer> s2 = new HashSet<Integer>();
		s2.add(3);
		s2.add(4);
		s2.add(5);
		
		HashSet<Integer> s3 = new HashSet<Integer>();
		s3.add(1);
		s3.add(2);
		
		System.out.print(s1.addAll(s2));
	}

}
