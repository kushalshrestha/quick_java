package quick_java_mpp.lesson7.slidesDemo;

public class PersonInDetail implements NameAddress {
	private final String firstName;
    private final String lastName;
    private final String middleName;
	private final Address address;

	PersonInDetail(String firstName, String lastName, String middleName, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.address = address;
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

	public String getMiddleName() {
		return middleName;
	}

	@Override
	public String getFullName() {
		// TODO Auto-generated method stub
		return getFirstName() + " " + getMiddleName() + " " + getLastName();
	}

	@Override
	public String getFullAddress() {
		// TODO Auto-generated method stub
		return address.toString();
	}

	@Override
	public String getStreet() {
		// TODO Auto-generated method stub
		return address.getStreet();
	}

	@Override
	public String getCity() {
		// TODO Auto-generated method stub
		return address.getCity();
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return address.getState();
	}

}
