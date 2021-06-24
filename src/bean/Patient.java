package bean;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import util.DBConnection;

public class Patient {
		private String name,address,contact,email,password,id,parent_id,location_type,pin;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getContact() {
			return contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getParent_id() {
			return parent_id;
		}

		public void setParent_id(String parent_id) {
			this.parent_id = parent_id;
		}

		public String getLocation_type() {
			return location_type;
		}

		public void setLocation_type(String location_type) {
			this.location_type = location_type;
		}

		public String getPin() {
			return pin;
		}

		public void setPin(String pin) {
			this.pin = pin;
		}

		public int addPatient() throws SQLException
		{
			Connection conn=DBConnection.dbConnect();
			String sql="insert into patient values(?,?,?,?,?)";
			PreparedStatement ps=(PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, address);
			ps.setString(3, contact);
			ps.setString(4, email);
			ps.setString(5, password);
			int row=ps.executeUpdate();
			conn.close();
			return row;
		}
		public Patient login() throws SQLException
		{
			Connection conn=DBConnection.dbConnect();
			String sql="select *from patient where email = ? and password = ? ";
			PreparedStatement ps=(PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs=(ResultSet) ps.executeQuery();
			Patient p1=new Patient();
			if(rs.next())
			{
				p1.setEmail(rs.getString("email"));
				p1.setName(rs.getString("name"));
				p1.setAddress(rs.getString("address"));
				p1.setContact(rs.getString("contact"));
			}
			else
			{
				p1=null;
			}
			return p1;
		}
		/*
		 * public ArrayList<String> getAllStates() throws SQLException { Connection
		 * conn=DBConnection.dbConnect(); String sql="select *from state";
		 * PreparedStatement ps=(PreparedStatement) conn.prepareStatement(sql);
		 * ResultSet rs=(ResultSet) ps.executeQuery(); ArrayList<String> allStates= new
		 * ArrayList<String>(); while(rs.next()) { String n=rs.getString("StateName");
		 * allStates.add(n); } return allStates; }
		 */
		/*
		 * public ArrayList<String> getLocationsFromDB() throws SQLException {
		 * Connection conn=DBConnection.dbConnect(); String
		 * sql="select *from geo_locations where name = ?"; PreparedStatement
		 * ps=(PreparedStatement) conn.prepareStatement(sql); ps.setString(1, name);
		 * ResultSet rs=(ResultSet) ps.executeQuery(); ArrayList<String> avlocations=
		 * new ArrayList<String>();
		 * 
		 * if(rs.next()) { String n=rs.getString("StateName"); avlocations.add(n); }
		 * else { avlocations=null; } return avlocations; }
		 */
		public Patient search() throws SQLException
		{
			Connection conn=DBConnection.dbConnect();
			String sql="select *from geo_locations where name = ?";
			PreparedStatement ps=(PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs=(ResultSet) ps.executeQuery();
			Patient p1=new Patient();
			if(rs.next())
			{
				p1.setName(rs.getString("name"));
			}
			else
			{
				p1=null;
			}
			return p1;
		}

		/*
		 * public Patient getDetailsBySearch() throws SQLException { Connection
		 * conn=DBConnection.dbConnect(); String
		 * sql="select *from geo_locations where name = ?"; PreparedStatement
		 * ps=(PreparedStatement) conn.prepareStatement(sql); ps.setString(1, name);
		 * ResultSet rs=(ResultSet) ps.executeQuery(); Patient s1=new Patient();
		 * if(rs.next()) { s1.setId(rs.getString("id"));
		 * s1.setName(rs.getString("name")); s1.setParent_id(rs.getString("parent_id"));
		 * s1.setLocation_type(rs.getString("location_type"));
		 * s1.setPin(rs.getString("pin")); s1.setContact(rs.getString("contact")); }
		 * else { s1=null; } return s1; }
		 */
		public ArrayList<Patient> getAllDetails() throws SQLException
		{
			Connection conn=DBConnection.dbConnect();
			
			String sql="select *from geo_locations where name = ?";
			PreparedStatement ps=(PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs=(ResultSet) ps.executeQuery();
			ArrayList<Patient> allStuds=new ArrayList<Patient>();
			
			if(rs.next())
			{
				Patient s1=new Patient();
				s1.setId(rs.getString("id"));
				s1.setName(rs.getString("name"));
				s1.setParent_id(rs.getString("parent_id"));
				s1.setLocation_type(rs.getString("location_type"));
				s1.setPin(rs.getString("pin"));
				s1.setContact(rs.getString("contact"));
				
				allStuds.add(s1);
			}
			return allStuds;
		}


}
