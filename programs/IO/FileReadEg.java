package IO;

import java.io.FileReader;

public class FileReadEg {

	public static void main(String[] args) {
		try {
			//it read all the data from hello1.txt file
			FileReader fw= new FileReader("E:\\Java_ItVedant\\hello1.txt");
			int i=0;
			while((i=fw.read())!=-1) {
				System.out.print((char)i);
			}
			fw.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
