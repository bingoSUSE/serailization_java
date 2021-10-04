import java.io.*;

public class serialization_1
{
	public static void main(String[] args) 
	{
		Save obj = new Save();  // this the serialized class of object
		obj.i = 56;
		File f = new File("Demo.txt");  // creating file for showing output
		FileOutputStream fos = new FileOutputStream(f); //crreating output file
		ObjectOutputStream oos = new ObjectOutputStream(fos);// creating object output
		oos.writeObject(obj);
		//now we are going to show the demo file content
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Save obj1 =  ois.readObject();
		System.out.println("Value of obj1= " + obj1.i);
	}
}
class Save implements Serializable 
{
	int i;
}
