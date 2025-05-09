package parcela;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ContinentDAO 
{
	
	public void create(String name) throws SQLException 
	{
		Connection con = Database.getConnection();
		try (PreparedStatement pstmt = con.prepareStatement("insert into continents (name) values (?)"))
		{
			pstmt.setString(1, name);
			pstmt.executeUpdate();
		}
	}
	
		//Continent
	
	public Integer findByName(String name) throws SQLException
	{
		Connection con = Database.getConnection();
		try (Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select id from continents where name='" + name + "'"))
		{
			return rs.next() ? rs.getInt(1) : null;
		}
	}
	
		//Continent
	
	public String findById(int id) throws SQLException
	{
			//TODO
	}
	
	
}