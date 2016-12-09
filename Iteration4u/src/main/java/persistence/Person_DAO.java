package persistence;

import java.sql.SQLException;

import domain.*;

public class Person_DAO {

	public Person_DAO() {
	}
	
	public void read(Person p) {
	}

	public int update(Person p) throws SQLException {
		return DBBroker.GetInstance().change("");
	}

}