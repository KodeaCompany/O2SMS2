package persistence;
import domain.*;

public class Driver_DAO {


	public void readPoint(Driver d) {
		// TODO - implement Driver_DAO.readPoint
		throw new UnsupportedOperationException();
	}

	
	public void updatePoints(Driver d) {
		// TODO - implement Driver_DAO.updatePoints
		throw new UnsupportedOperationException();
	}

	public void readUnpaidSanctions(Driver d) {
		int unpaidSanctions = 0;
		Sanction[] s= new Sanction[unpaidSanctions];
		d.setUnpaidSanctions(s);
		
		throw new UnsupportedOperationException();
	}
	
	public void readDriver(Driver d){
		
	}

}