package presentation;
import domain.Inquiry;
import domain.Vehicle;
import java.util.Random;


public class General_Interface {

	public void InsertInquiryInfo() {
		// TODO- implement General_Interface.InsertInquiryInfo
		Vehicle v = new Vehicle();
		
		Random rd = new Random();
		Double carSpeed=rd.nextDouble();
		Double maxSpeedAllowed=rd.nextDouble();
		
		 if(maxSpeedAllowed-carSpeed >= 20){
						
			Inquiry i = new Inquiry(carSpeed,maxSpeedAllowed,v);
			
		}
		
	}
	

}