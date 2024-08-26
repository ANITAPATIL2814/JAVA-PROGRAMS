package IO;

import java.io.FileWriter;

public class FileWriterEg {

	public static void main(String[] args) {
		try {
			//it will create a file hello1.txt and insert all data which we write inside this file
			FileWriter fw= new FileWriter("E:\\Java_ItVedant\\hello1.txt");
			fw.write("hello good morning. Anita patil is here !!");
			fw.write("I'm learning core java from itvedant vashi");
			System.out.println("done Writing");
			fw.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
