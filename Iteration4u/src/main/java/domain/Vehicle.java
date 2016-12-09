package domain;

import java.sql.SQLException;

import persistence.*;

public class Vehicle {

	private String plateNumber;
	private String brand;
	private String model;
	private Owner owner;
	private Vehicle_DAO daoVehicle;

	public Vehicle() {
		this.daoVehicle = new Vehicle_DAO();
	}

	public Vehicle(String plateNumber, String brand, String model) {
		this.plateNumber = plateNumber;
		this.brand = brand;
		this.model = model;
		this.daoVehicle = new Vehicle_DAO();
	}

	public Owner getOwner() {
		return this.owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public String getPlateNumber() {
		return this.plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getBrand() {
		return this.brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
    public void readVehicle() {    
    	this.daoVehicle.read(this);
    }
    
    public int updateVehicle() throws SQLException {    
    	return daoVehicle.updateOwner(this);
    }

}