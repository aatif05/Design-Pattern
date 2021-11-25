package builderPattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BuilderTest {

	@Test
	public void Test() {
		Contact contact = new ContactBuilder().setFirstName("Aatif").setLastName("ahmed").build();
		System.out.println(contact.getFirstName());
		assertEquals("Aatif", contact.getFirstName());
	}
}
