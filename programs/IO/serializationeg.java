package IO;
//writing state of object to byte stream

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
//student_serialization_eg.java --- subclass
//main class
public class serializationeg  {

	public static void main(String[] args) {
		try {
			//it will create file a1 which contain code in the form of byte which we cannot read
			student_serialization_eg s= new student_serialization_eg(101,"abc",98866889,"sies");
			student_serialization_eg s2= new student_serialization_eg(101,"abc",98866889,"nerul");	
			FileOutputStream fo=new FileOutputStream("E:\\Java_ItVedant\\a1.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(s);
			oo.writeObject(s2);
			fo.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

	

	

}
