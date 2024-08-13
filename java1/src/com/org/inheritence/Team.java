package com.org.inheritence;

public class Team extends TL {
     String Tname;
     String Pname;
     int NoOfDeliveries;
     public Team(String pName, String pId, String empID, String tname, String pname2, int noOfDeliveries) {
		super(pName, pId, empID);
		Tname = tname;
		Pname = pname2;
		NoOfDeliveries = noOfDeliveries;
	}
	void discussion() {};
//     void discussion(String Tname, String Pname) {
//    	 //System.out.println( Tname +" is delivering Project " +Pname);
//     }
     
}

class TeamB extends TL{

	public TeamB(String pName, String pId, String empID) {
		super(pName, pId, empID);
		// TODO Auto-generated constructor stub
	}

}

