package IO;

import java.io.FileInputStream;

public class FileInputStreamEg {

	public static void main(String[] args) {
		try {
			//it will read the data from our folder which we created data FileOutputStreamEg
			FileInputStream  fe= new FileInputStream("E:\\Java_ItVedant\\hello.txt");
			int i=0;
			while((i=fe.read())!=-1) {
				System.out.print((char)i);
			}
			fe.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
