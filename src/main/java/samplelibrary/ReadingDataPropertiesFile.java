package samplelibrary;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadingDataPropertiesFile {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("E:\\Selenium\\VtigerCommonData.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String URL=pobj.getProperty("url");
		String USERNAME=pobj.getProperty("username");
		String PASSWORD=pobj.getProperty("password");
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
	}

}
