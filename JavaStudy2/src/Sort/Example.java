package Sort;

import java.util.*;

public class Example {

	public static void main(String[] args) {
		List<Computer> s1 = new ArrayList<Computer>();
		s1.add(new Computer(500, "minho"));
		s1.add(new Computer(300, "hacosa"));
		s1.add(new Computer(700, "nemo"));
		System.out.println(s1);
		
		Collections.sort(s1);
		Iterator i = s1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}

class Computer implements Comparable {
	int serial;
	String owner;
	Computer(int serial, String owner){
		this.serial = serial;
		this.owner = owner;
	}
	public int compareTo(Object o) {
		return this.serial - ((Computer)o).serial;
	}
	public String toString() {
		return serial+" "+owner;
	}
}