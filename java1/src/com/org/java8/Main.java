package com.org.java8;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// n= sc.nextInt();
		Player[] pl= new Player[4];
		ArrayList<Player> AL = new ArrayList<Player>();
    for (int i=0; i<4;i++) {
	   String PlayerName= sc.nextLine();
	   int Playerid= sc.nextInt();sc.nextLine();
	   String country=sc.nextLine();
	   String PlayerSkill=sc.nextLine();
	   pl[i]= new Player(PlayerName, Playerid, country, PlayerSkill);
	   AL.add(pl[i]);
	   
 }
    System.out.println(AL.toString());
 }

}

