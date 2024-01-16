package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * This class is to fetch common data from properties file
 * @author Manjunath S
 */
public class PropertiesUtility {
/**
 * 
 * @param data
 * @return
 * @throws Exception
 */
	public String getDataFromPropertiesFile(String data) throws Exception {
		FileInputStream fis = new FileInputStream(IconstantUtility.propertiesPath);
		Properties pobj = new Properties();
		pobj.load(fis);
		String propertiesData = pobj.getProperty(data);
		return propertiesData;

	}

}
