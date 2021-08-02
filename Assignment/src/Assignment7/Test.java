package Assignment7;

import java.io.FileNotFoundException;

public class Test {

	public static void test() throws FileNotFoundException {
		try {
			throw new FileNotFoundException();
		} finally {}

	}

}
