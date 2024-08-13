package com.org.aac;

class MobilePhone{
	private String model;
	private String brand;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	private String[] messages = new String[10];
	private int messageCount=0;
	private String[] gallery = new String[10];
	private int photoCount =0;
	public MobilePhone(String model, String brand) {
		super();
		this.model = model;
		this.brand = brand;
	}
	
	public void makeCall(String phoneNumber, String string) {
        System.out.println("Calling "+ phoneNumber + "...");	
        }
	
}
public class EncapsulationTest {

}
