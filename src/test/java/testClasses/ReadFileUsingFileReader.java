package testClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileUsingFileReader {

	public static void main(String[] args) {
		String path="C:\\Users\\Aman\\eclipse-workspace2\\P10AMMaven\\testDataNew.txt";
		File file=new File(path);
		FileReader fr=null;
		
			try {
				fr=new FileReader(file);
				int counter=0;
				while((counter=fr.read())!=-1) {
					System.out.print((char)counter);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
