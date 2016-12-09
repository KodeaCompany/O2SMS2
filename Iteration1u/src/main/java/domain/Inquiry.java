package domain;
import java.util.Date;
import persistence.Inquiry_DAO;

public class Inquiry {

	private int id;
	private Date date;
	private double carSpeed;
	private double maxSpeedAllowed;
	private	Vehicle v;
	
	/**
	 * 
	 * @param carSpeed
	 * @param maxSpeedAllowed
	 */
	public Inquiry(double carSpeed, double maxSpeedAllowed,Vehicle vehicle) {
		// TODO- implement Inquiry.Inquiry
		this.carSpeed=carSpeed;
		this.maxSpeedAllowed=maxSpeedAllowed;
		this.v=vehicle;
		Inquiry_DAO idao=new Inquiry_DAO();
		idao.insert(this);
	}
	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * 
	 * @param location
	 */
	public void setLocation(String location) {
		// TODO - implement Inquiry.setLocation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param speed
	 */
	public void setSpeed(double speed) {
		// TODO - implement Inquiry.setSpeed
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param maxSpeed
	 */
	public void setMaxSpeed(double maxSpeed) {
		// TODO - implement Inquiry.setMaxSpeed
		throw new UnsupportedOperationException();
	}

	public Vehicle getVehicle() {
		// TODO - implement Inquiry.getVehicle
		throw new UnsupportedOperationException();
	}

	public String getId() {
		// TODO - implement Inquiry.getId
		throw new UnsupportedOperationException();
	}

	public Date getDate() {
		return this.date;
	}

	public Double getCarSpeed() {
		// TODO - implement Inquiry.getCarSpeed
		throw new UnsupportedOperationException();
	}

	public Double maxSpeedAllowed() {
		// TODO - implement Inquiry.maxSpeedAllowed
		throw new UnsupportedOperationException();
	}

}