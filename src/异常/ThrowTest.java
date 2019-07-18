package “Ï≥£;

import java.io.File;
import java.io.IOException;

public class ThrowTest {
	public void CreatFile(String path) throws IOException{
		File file  = new File(path);
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
	}

	public static void main(String[] args) {
		ThrowTest ttTest = new ThrowTest();
		try {
			ttTest.CreatFile("D:/abc.txt");
		} catch (IOException ex) {
			ex.printStackTrace();
		
		}


	}

}
