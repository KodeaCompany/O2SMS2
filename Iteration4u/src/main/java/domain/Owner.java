package domain;

import java.sql.SQLException;

import persistence.*;

public class Owner extends Person {

	private Owner[] owners;
	private Person_DAO daoPerson;
	
	public Owner() {
		this.daoPerson = new Person_DAO();
	}

	
	public Owner(String dni, String name, String lastName, int contactNumber, String fullAddress, Owner[] owners) {
		super(dni, name, lastName, contactNumber, fullAddress);
		this.owners = owners;
		this.daoPerson = new Person_DAO();
	}

	public Owner[] getOwners() {
		return this.owners;
	}
	
    public void readOwner() {    
    	this.daoPerson.read(this);
    }
    
    public int updateOwner() throws SQLException {    
    	return daoPerson.update(this);
    }

}