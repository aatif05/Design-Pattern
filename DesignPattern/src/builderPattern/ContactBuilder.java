package builderPattern;

public class ContactBuilder {
	private String firstName;
	private String lastName;
	private String emailAddress;

	public Contact build() {
		return new Contact(firstName, lastName, emailAddress);
	}

	public String getFirstName() {
		return firstName;
	}

	public ContactBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public ContactBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public ContactBuilder setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		return this;
	}

}
