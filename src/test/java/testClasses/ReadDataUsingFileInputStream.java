package testClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataUsingFileInputStream {
	public static void main(String[] args) throws IOException {
	 String path="C:\\Users\\Aman\\eclipse-workspace2\\P10AMMaven\\testDataNew.txt";
//	 String path="C:\\Users\\Aman\\Desktop\\Car\\AMIPJ2385F_2021_2022.pdf";
     File file=new File(path);
     if(file.exists()) {
    	 System.out.println("File exists");
     }
     FileInputStream fis=null;
     try {
		fis=new FileInputStream(file);
		int counter=0;
        while((counter=fis.read())!=-1) {
        	System.out.print((char)counter);
        }
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}	
}
}
