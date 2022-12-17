package quick_java.lesson7.slidesDemo;

public interface NameAddress {
	String getFirstName();

	String getLastName();

	String getStreet();

	String getCity();

	String getState();

	// Java 8 - implemented methods
	default String getFullName() {
		return getFirstName() + " " + getLastName();
	}

	default String getFullAddress() {
		return getStreet() + "\n" + getCity() + "\n" + getState();
	}

	default String formattedOutput() {
		return getFullName() + "\n" + getFullAddress();
	}

	// One static method
	static String printInLower(String t) {
		return t.toString().toLowerCase();
	}
}
