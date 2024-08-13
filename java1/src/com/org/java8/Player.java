package com.org.java8;

public class Player {
  String PlayerName;
int Playerid;
  String country;
  String PlayerSkill;
  public Player(String playerName, int playerid, String country, String playerSkill) {
	super();
	PlayerName = playerName;
	Playerid = playerid;
	this.country = country;
	PlayerSkill = playerSkill;
}
  @Override
  public String toString() {
  	return "Player [PlayerName=" + PlayerName + ", Playerid=" + Playerid + ", country=" + country + ", PlayerSkill="
  			+ PlayerSkill + "]";
  }
  
}
