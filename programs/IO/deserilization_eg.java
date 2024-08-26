package IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 * Reconstructing the object from serialized state
 * reverse of serialization
 * convert byte stream to object
 */
public class deserilization_eg {

	public static void main(String[] args) {
		try {
			ObjectInputStream fi=new ObjectInputStream(
					new FileInputStream("E:\\Java_ItVedant\\a1.txt")
					);
			student_serialization_eg ss=(student_serialization_eg)fi.readObject();
			//it show school name as null becz we use transient keyword the keyword is not serialized 
			System.out.println(ss.sid+" "+ss.sname+" "+ss.sphone+" "+ss.scholName); 
			fi.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
