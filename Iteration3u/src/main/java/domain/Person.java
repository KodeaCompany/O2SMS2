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

	public Person(String dni, String name, String surname, int contactNumber, String fullAddress) {
		// TODO - implement Person.Person
		throw new UnsupportedOperationException();
	}

	public Person findPersonByDNI(String dni) {
		// TODO - implement Person.findPersonByDNI
		throw new UnsupportedOperationException();
	}


	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}


	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}