//stream: System.in, Sysout.out
//ByteStream ,CharaterStream
//read(input) , write(output)
//InputStream & OutputStream -- byte
//FileReader &FileWriter -- character

package IO;

import java.io.FileOutputStream;
public class FileOutputStreamEg {

	public static void main(String[] args) {
		try {
			//automatic file will created inside this folder with keyword me becz we give here ascii value
			FileOutputStream fo=new FileOutputStream("E:\\Java_ItVedant\\hello.txt");
			fo.write(109); //ASCII value 109 is m
			fo.write(101); //e
			fo.close();
			System.out.println("done writing");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
