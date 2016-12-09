package domain;

public class Person {

	private String dni;
	private String name;
	private String surname;
	private int contactNumber;
	private String fullAddress;

	public Person() {
		// TODO - implement Person.Person
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fullAddress
	 */
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	/**
	 * 
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	/**
	 * 
	 * @param dni
	 */
	public String getDni() {
		return this.dni;
	}

}