package domain;

import persistence.*;

public class Person {

	private String dni;
	private String name;
	private String surname;
	private int contactNumber;
	private String fullAddress;
	private Person_DAO daoPerson;

	public Person() {
		this.daoPerson = new Person_DAO();
	}

	public Person(String dni, String name, String surname, int contactNumber, String fullAddress) {
		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this. contactNumber = contactNumber;
		this.fullAddress = fullAddress;
		this.daoPerson = new Person_DAO();
	}

	public String getDni() {
		return this.dni;
	}

	/**
	 * 
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	/**
	 * 
	 * @param surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getContactNumber() {
		return this.contactNumber;
	}

	/**
	 * 
	 * @param contactNumber
	 */
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getFullAddress() {
		return this.fullAddress;
	}

	/**
	 * 
	 * @param fullAddress
	 */
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

}