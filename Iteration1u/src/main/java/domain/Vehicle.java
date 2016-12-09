package domain;
import persistence.Vehicle_DAO;
import java.util.*;

public class Vehicle {

	private String plateNumber;
	private String brand;
	private String model;
	private Vehicle_DAO vdao = new Vehicle_DAO();
	private Owner o = new Owner();
	/**
	 * 
	 * @param plateNumber
	 */
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
		
	}

	public Vehicle() {
		vdao.read(this);
		
		
		// TODO- implement Vehicle.Vehicle
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * 
	 * @param o
	 */
	public void setOwner(Owner o) {
		this.o=o;
		throw new UnsupportedOperationException();
	}

	public Owner getOwner() {
		
		return this.o;
	}

}