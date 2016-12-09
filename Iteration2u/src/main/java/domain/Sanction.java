package domain;
import java.util.Date;
import persistence.Sanction_DAO;

public class Sanction {

	Inquiry inquiry;
	private String id;
	private double amountToPay;
	private int pointsReduction;
	private Date dateOfReception;
	private Date dateOfPayment;
	private Driver driver;

	/**
	 * 
	 * @param i
	 */
	public Sanction(Inquiry i) {
		
		Sanction_DAO s_dao = new Sanction_DAO();
		calculatePoints(i);
		calculateAmountToPay(i);
		this.id = "ulises";
		s_dao.insert(this);
	}

	public void calculatePoints(Inquiry i) {
		double carSpeed = i.getCarSpeed();
		double maxSpeedAllowed = i.getMaxSpeedAllowed();
		int mean = (int)carSpeed - (int)maxSpeedAllowed;
		
		if (mean <= 20){
			this.pointsReduction = 0;
			
		} else if (mean <= 30){
			this.pointsReduction = 2;
			
		} else if (mean <= 40){
			this.pointsReduction = 4;
			
		} else if (mean <= 51){
			this.pointsReduction = 6;
			
		}		
	}

	public void calculateAmountToPay(Inquiry i) {
		double carSpeed = i.getCarSpeed();
		double maxSpeedAllowed = i.getMaxSpeedAllowed();
		int mean = (int)carSpeed - (int)maxSpeedAllowed;
		
		if (mean <= 20){
			this.amountToPay = 100;
			
		} else if (mean <= 30){
			this.amountToPay = 300;
			
		} else if (mean <= 40){
			this.amountToPay = 400;
			
		} else if (mean <= 50){
			this.amountToPay = 500;
			
		} else if (mean <= 51){
			this.amountToPay = 600;
			
		}
	}

	public double getAmountToPay() {
		return this.amountToPay;
	}

	public int getPointsReduction() {
		return this.pointsReduction;
	}

	public Date getDateOfReception() {
		return this.dateOfReception;
	}

	public Date getDateOfPayment() {
		return this.dateOfPayment;
	}

	public Driver getDriver() {
		return this.driver;
	}

}