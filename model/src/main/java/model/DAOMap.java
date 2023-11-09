package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Map;

/**
 * The DAOMap class
 * @author BIRAHEKA
 *
 */
public class DAOMap extends DAOEntity<Map>{
	public DAOMap(Connection connection) throws SQLException {
		super(connection);
	}
	
	@Override
	public boolean create(Map entity) {
		// Not implemented
		return false;
	}

	@Override
	public boolean delete(Map entity) {
		// Not implemented
		return false;
	}

	@Override
	public boolean update(Map entity) {
		// Not implemented
		return false;
	}

	@Override
	public Map find(int id) {
		// Not implemented
		return null;
	}

	@Override
	public Map find(String name) {
		Map map = new Map();
		
		try {
			final String sql = "{call getMap(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setString(1, name);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			System.out.println(resultSet);
			if (resultSet.first() == true) {
				map = new Map(resultSet.getInt("id"), name, resultSet.getInt("length"), resultSet.getInt("width"), resultSet.getInt("goal"));
			}
			return map;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
