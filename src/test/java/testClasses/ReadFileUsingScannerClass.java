package testClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileUsingScannerClass {

	public static void main(String[] args) {
		String path="C:\\Users\\Aman\\eclipse-workspace2\\P10AMMaven\\testDataNew.txt";
		File f=new File(path);
		Scanner sc=null;
		try {
			sc = new Scanner(f);
			while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	  finally {
		  sc.close();
	  }

	}

}
