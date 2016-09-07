package seedu.addressbook.data.person;

public class Contact {

	public String value;
	protected boolean isPrivate;

	public Contact(String value, boolean isPrivate) {
		this.value = value;
		this.isPrivate = isPrivate;

	}

	public void setValue(String value) {
		this.value = value;

	}

	@Override
	public String toString() {
		return value;
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	public boolean isPrivate() {
		return isPrivate;
	}

}
