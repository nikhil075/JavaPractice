package userpackage;

import java.io.*;
class Student1 implements Serializable{
        int id;
	String name;
	Student1(int id, String name){
		this.id=id;
		this.name=name;
	}
}

public class Persist1 {

	public static void main(String[] args) {
		try {
			Student1 s1 =new Student1(222,"Reena");
			//creating stream and writing the object
			FileOutputStream fout=new FileOutputStream("a.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			//closing the stream
			out.close();
			System.out.println("Success");
		}catch(Exception e) {System.out.println(e);}

	}

}