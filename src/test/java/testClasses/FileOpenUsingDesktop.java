package testClasses;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class FileOpenUsingDesktop {
	public static void main(String[] args) {
		String path = "C:\\Users\\Aman\\eclipse-workspace2\\P10AMMaven\\testDataNew.txt";
		File file=new File(path);
		Desktop desktop=Desktop.getDesktop();
		try {
			desktop.open(file);
//			desktop.mail();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
