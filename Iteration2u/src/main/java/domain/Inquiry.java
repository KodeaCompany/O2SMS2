package domain;
import java.util.Date;

public class Inquiry {

	private int id;
	private double carSpeed;
	private double maxSpeedAllowed;
	private Date date;

	/**
	 * 
	 * @param carSpeed
	 * @param maxSpeedAllowed
	 */
	public Inquiry(double carSpeed, double maxSpeedAllowed) {
	}

	public int getId() {
		return this.id;
	}

	public double getCarSpeed() {
		return this.carSpeed;
	}

	public double getMaxSpeedAllowed() {
		return this.maxSpeedAllowed;
	}

}