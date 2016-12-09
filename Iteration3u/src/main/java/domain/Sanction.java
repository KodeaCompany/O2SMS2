package domain;
import java.util.Date;

import persistence.Driver_DAO;
import persistence.Sanction_DAO;

public class Sanction {

	private int id;
	private double amountToPay;
	private int pointsReduction;
	private Date dateOfReception;
	private Date dateOfPayment;
	private Sanction_DAO s_dao;
	
	public Sanction(int id, double amountToPay, int pointsReduction, Date dateOfREception) {
		Sanction_DAO s_dao = new Sanction_DAO();
		s_dao.readSanction(this);
		throw new UnsupportedOperationException();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmountToPay() {
		return this.amountToPay;
	}

	public void setAmountToPay(double amountToPay) {
		this.amountToPay = amountToPay;
	}

	public int getPointsReduction() {
		return this.pointsReduction;
	}

	public void setPointsReduction(int pointsReduction) {
		this.pointsReduction = pointsReduction;
	}

	public Date getDateOfReception() {
		return this.dateOfReception;
	}

	public void setDateOfReception(Date dateOfReception) {
		this.dateOfReception = dateOfReception;
	}

	public Date getDateOfPayment() {
		return this.dateOfPayment;
	}

	public void setDateOfPayment(Date dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
		s_dao.updatePayments();
	}

	public Driver getDriver() {
		// TODO - implement Sanction.getDriver
		throw new UnsupportedOperationException();
	}


	public void setDriver(Driver d) {
		// TODO - implement Sanction.setDriver
		throw new UnsupportedOperationException();
	}


}