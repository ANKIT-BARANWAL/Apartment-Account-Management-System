package com.apartment;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class CustomerDao {
	
	public static Connection getCon(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		}catch(Exception e){System.out.println(e);}
		return con;
	}

	public static int save(Customer s){
		int status=0;
		try{
			Connection con=AccountantDao.getCon();
			PreparedStatement ps=con.prepareStatement("insert into customer(name,password,email,age,rent,paid,due,address,gender,state,flatno,contactno) values(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,s.getName());
			ps.setString(2,s.getpassword());
			ps.setString(3,s.getEmail());
			ps.setString(4, s.getage());
			ps.setInt(5,s.getrent());
			ps.setInt(6,s.getPaid());
			ps.setInt(7,s.getDue());
			ps.setString(8,s.getAddress());
			ps.setString(9,s.getgender());
			ps.setString(10,s.getState());
			ps.setString(11,s.getflatno());
			ps.setString(12,s.getContactno());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
	public static boolean validate(String name,String password){
		boolean status=false;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from customer where name=? and password=?");
			ps.setString(1,name);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		
		
		return status;
	}
	
	public static int update(Customer s){
		int status=0;
		try{
			Connection con=AccountantDao.getCon();
			PreparedStatement ps=con.prepareStatement("update customer set name=?,password =?,email=?,age=?,rent=?,paid=?,due=?,address=?,gender=?,state=?,flatno=?,contactno=? where id=?");
			ps.setString(1,s.getName());
			ps.setString(2,s.getpassword());
			ps.setString(3,s.getEmail());
			ps.setString(4, s.getage());
			ps.setInt(5,s.getrent());
			ps.setInt(6,s.getPaid());
			ps.setInt(7,s.getDue());
			ps.setString(8,s.getAddress());
			ps.setString(9,s.getgender());
			ps.setString(10,s.getState());
			ps.setString(11,s.getflatno());
			ps.setString(12,s.getContactno());
			ps.setInt(13,s.getid());
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static List<Customer> view(){
		List<Customer> list=new ArrayList<Customer>();
		try{
			Connection con=AccountantDao.getCon();
			PreparedStatement ps=con.prepareStatement("select * from customer");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Customer s=new Customer();
				s.setid(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setpassword(rs.getString("password"));
				s.setEmail(rs.getString("email"));
				s.setage(rs.getString("age"));
				s.setrent(rs.getInt("rent"));
				s.setPaid(rs.getInt("paid"));
				s.setDue(rs.getInt("due"));
				s.setAddress(rs.getString("address"));
				s.setgender(rs.getString("gender"));
				s.setState(rs.getString("state"));
				s.setflatno(rs.getString("flatno"));
				s.setContactno(rs.getString("contactno"));
				list.add(s);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	public static Customer getCustomerByid(int id){
		Customer s=new Customer();
		try{
			Connection con=AccountantDao.getCon();
			PreparedStatement ps=con.prepareStatement("select * from customer where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				s.setid(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setpassword(rs.getString("password"));
				s.setEmail(rs.getString("email"));
				s.setage(rs.getString("age"));
				s.setrent(rs.getInt("rent"));
				s.setPaid(rs.getInt("paid"));
				s.setDue(rs.getInt("due"));
				s.setAddress(rs.getString("address"));
				s.setgender(rs.getString("gender"));
				s.setState(rs.getString("state"));
				s.setflatno(rs.getString("flatno"));
				s.setContactno(rs.getString("contactno"));
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return s;
	}
	
	public static Customer getCustomerBycontactno(String ss){
		Customer s=new Customer();
		try{
			Connection con=AccountantDao.getCon();
			PreparedStatement ps=con.prepareStatement("select * from customer where contactno=?");
			ps.setString(1,ss);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				s.setid(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setpassword(rs.getString("password"));
				s.setEmail(rs.getString("email"));
				s.setage(rs.getString("age"));
				s.setrent(rs.getInt("rent"));
				s.setPaid(rs.getInt("paid"));
				s.setDue(rs.getInt("due"));
				s.setAddress(rs.getString("address"));
				s.setgender(rs.getString("gender"));
				s.setState(rs.getString("state"));
				s.setflatno(rs.getString("flatno"));
				s.setContactno(rs.getString("contactno"));
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return s;
	}
	
	public static List<Customer> due(){
		List<Customer> list=new ArrayList<Customer>();
		try{
			Connection con=AccountantDao.getCon();
			PreparedStatement ps=con.prepareStatement("select * from customer where due>0");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Customer s=new Customer();
				s.setid(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setpassword(rs.getString("password"));
				s.setEmail(rs.getString("email"));
				s.setage(rs.getString("age"));
				s.setrent(rs.getInt("rent"));
				s.setPaid(rs.getInt("paid"));
				s.setDue(rs.getInt("due"));
				s.setAddress(rs.getString("address"));
				s.setgender(rs.getString("gender"));
				s.setState(rs.getString("state"));
				s.setflatno(rs.getString("flatno"));
				s.setContactno(rs.getString("contactno"));
				list.add(s);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
}
