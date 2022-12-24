package quick_java.lesson7.slidesDemo;

public class MinimalPerson implements NameAddress {
	private final String firstName;
    private final String lastName;
    private final String street;
    private final String city;
    private final String state;

	MinimalPerson(String firstName, String lastName, String street, String city, String state) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

	@Override
	public String getStreet() {
		// TODO Auto-generated method stub
		return street;
	}

	@Override
	public String getCity() {
		// TODO Auto-generated method stub
		return city;
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return state;
	}

}
