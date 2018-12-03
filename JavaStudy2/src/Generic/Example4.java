package Generic;

interface Iinfo {
	int getLevel();
}

class Gen1 implements Iinfo {
	public int rank;
	Gen1 (int rank){
		this.rank = rank;
	}
	public int getLevel() {
		return this.rank;
	}
}

class Person4<T extends Iinfo> {
	public T info;
	Person4 (T info){
		this.info = info;
	}
}

public class Example4 {

	public static void main(String[] args) {
		Person4<Gen1> p = new Person4<Gen1>(new Gen1(20));
//		Person4<Integer> p2 = new Person4<Integer>(10);
		System.out.println(p.info.getLevel());
	}

}
