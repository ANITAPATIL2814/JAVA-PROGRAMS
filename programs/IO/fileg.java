package IO;

import java.io.File;

public class fileg {

	public static void main(String[] args) {
		try {
			//if we have this file already then it show already exist else it will create
			File f=new File("E:\\Java_ItVedant\\hello2.txt");
			if(f.createNewFile()) {
				System.out.println("file created");
			}
			else {
				System.out.println("file already exist");
			}
			System.out.println(f.getAbsolutePath());//path of file
			System.out.println(f.getName());//name of file
			System.out.println(f.canRead()); //true
			System.out.println(f.setReadOnly()); //if we give read only permission it not allow us to read
			System.out.println(f.canWrite()); //false
			System.out.println(f.length());
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
