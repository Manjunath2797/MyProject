package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesUtility {

//	public static void main(String[] args) throws Exception {
//		FileInputStream fis = new FileInputStream("C:\\ShoppersStack\\ShoppersStackFrameWork.properties");
//		Properties pobj = new Properties();
//		pobj.load(fis);
//		System.out.println(pobj.getProperty("username"));
//
//	}
	
	public String getDataFromPropertiesFile(String data) throws Exception {
		FileInputStream fis = new FileInputStream(IconstantUtility.propertiesPath);
		Properties pobj = new Properties();
		pobj.load(fis);
		String propertiesData = pobj.getProperty(data);
		return propertiesData;
		
	}

}
