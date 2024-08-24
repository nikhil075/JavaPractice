package userpackage;
import java.io.*;

public class Depersist {

	public static void main(String[] args) {
		try {
			//creating stream to read the object
			ObjectInputStream in =new ObjectInputStream(new FileInputStream("a.txt"));
			Student1 s1 =(Student1)in.readObject();
			//printing the data of the serialized object
			System.out.println(s1.id+" "+s1.name);
			//closing the stream
			in.close();
		}catch(Exception e) {System.out.println(e);}

	}

}