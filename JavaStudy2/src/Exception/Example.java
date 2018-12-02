package Exception;

import java.io.IOException;

class A {
	void throwArithmeticException () {
		throw new ArithmeticException();
	}
	
	void throwIOException () {
		try {
			throw new IOException();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}