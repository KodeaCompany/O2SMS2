package persistence;

import java.sql.SQLException;

import domain.*;

public class Vehicle_DAO {

	public Vehicle_DAO() {
	}

	public void read(Vehicle v) {
	}

	public int updateOwner(Vehicle v) throws SQLException {
		return DBBroker.GetInstance().change("");
	}

}