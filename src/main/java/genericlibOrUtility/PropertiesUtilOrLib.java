package genericlibOrUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesUtilOrLib {

	public String getDataFromProperties(String data) throws Exception {
		FileInputStream fis=new FileInputStream(IconstantUtility.propertiesPath);
		Properties pobj=new Properties();
		pobj.load(fis);
		String info=pobj.getProperty(data);
		return info;
	}
}
