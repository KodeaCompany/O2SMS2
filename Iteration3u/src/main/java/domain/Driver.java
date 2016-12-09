package domain;

import java.util.*;
import persistence.*;

public class Driver extends Person {

	Sanction[] sanctions;
	private int points;
	private String dni;
	private Driver_DAO d_dao;
	
	public Driver(String dni) {
		Driver_DAO d_dao = new Driver_DAO();
		this.dni = dni;
		d_dao.readDriver(this);	
	}

	public int getPoints() {
		return this.points;
	}

	public void setPoints(int pointsToReduce) {
		int currentPoints = getPoints();
		this.points = currentPoints - pointsToReduce;
		d_dao.updatePoints(this);
	}

	public void readUnpaidSanctions() {
		d_dao.readUnpaidSanctions(this);
		throw new UnsupportedOperationException();
	}


	public void setUnpaidSanctions(Sanction[] s) {
		for (int i=0; i<s.length; i++){
			sanctions[i] = s[i];			
		}
		throw new UnsupportedOperationException();
	}
	

	//This will be used in the method ShowSanctionInfo()
	public Sanction[] getUnpaidSanctions() {
		
		throw new UnsupportedOperationException();
	}

}