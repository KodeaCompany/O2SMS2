package persistence;
import  domain.Sanction;
import java.sql.SQLException;
import persistence.DBBroker;

public class Sanction_DAO {
	
	private DBBroker broker = new DBBroker();
	
	public void insert(Sanction s){
		broker.change("INSERT INTO sanction (id,amount) VALUES (10,6);");
	}

}