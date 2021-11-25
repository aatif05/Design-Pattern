package SingletonPattern;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class DoubleCheckSingleton {
	private DoubleCheckSingleton() {

	}

	static DoubleCheckSingleton instance;

	public static DoubleCheckSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}

	@Test
	public void Testing() {
		assertEquals(DoubleCheckSingleton.getInstance(), DoubleCheckSingleton.getInstance());
	}

	
}
