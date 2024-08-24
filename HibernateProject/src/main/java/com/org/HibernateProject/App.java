package com.org.HibernateProject;

/**
 * Hello world!
 *
 */
import java.util.Date;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.org.HibernateProject.HibernateUtil;
public class App 
{
    public static void main( String[] args ) {
    	//Create the student object.
    	Employee employee = new Employee();
 
    	//Setting the object properties.
    	employee.setId(5);
    	employee.setName("Vivek");
    	employee.setAge(21);
		employee.setDept("HR");
 
    	Transaction tx = null;
    	//Get the session object.
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	try{
              //Start hibernate session.
    	      tx = session.beginTransaction();
 
              //Insert a new student record in the database.
    	      session.save(employee); 
 
              //Commit hibernate transaction if no exception occurs.
    	      tx.commit();
    	      System.out.println("Saved Successfully.");
    	  }catch (HibernateException e) {
    	     if(tx!=null){
                 //Roll back if any exception occurs. 
    	         tx.rollback();
    	     }
    	     e.printStackTrace(); 
    	  }finally {
             //Close hibernate session.
    	     session.close(); 
    	  }
    }
}