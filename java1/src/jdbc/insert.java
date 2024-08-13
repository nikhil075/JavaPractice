package jdbc;
import java.util.*;

public class insert {
 
	System.out.println("Connected");
	//step 3 
	PreparedStatement ps= con.prepareStatement("insert into Persons values (?,?,?)"); 
	//step 4 
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter person id:"); 
	Int Id =Integer.parseInt(sc.nextLine()); 
	System.out.println("Enter the person frame:"); 
	String name =sc.nextLine(); 
	System.out.println("Enter the proper Address"); 
	String address= sc.nextLine();
	ps.setInt(1, 10), 
	ps.setString(3, name); 
	ps.setString(3, address), 
	Int 1 ps.executeUpdate() 
	System.out.println(1+" records affected"); 
	System.out.println("Do you want to continue: y/n"); 
	Stringssc.nextLine(); 
	if(s.startswith("")) ( break;
	