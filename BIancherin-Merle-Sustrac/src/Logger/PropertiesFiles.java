package Logger;
import java.util.Iterator;
import java.util.Properties;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.OutputStream;

/**
 * Prise en compte des options de conf contenu dans le fichier propertie
 * @param filename fichier où sont ecrits les propriétés
 */
class PropertiesFiles {
	static String propertiesFileLocation="myFile.properties";
	private static Properties properties;
	protected static void load(String filename) throws IOException, FileNotFoundException{
		properties = new Properties();
		FileInputStream input = new FileInputStream(filename);
		try{
			properties.load(input);
		}
		finally{input.close();}
	}

	//Lis toute les valeurs contenues dans properties
	protected static void displayProperties() {
		Iterator<Object> it = properties.keySet().iterator();
		while (it.hasNext()) {
			String propertyName = (String) it.next();
			String propertyValue = properties.getProperty(propertyName);
			System.out.println(propertyName + "=" + propertyValue);
		}
	}

	//Lis une valeur donnée contenues dans properties
	protected static String displayOnePropertie(String propertySearch) {
		String propertySearchValue = null;
		Iterator<Object> it = properties.keySet().iterator();
		while (it.hasNext()) {
			String propertyName = (String) it.next();
			if(propertyName.equals(propertySearch))
			{
				propertySearchValue = properties.getProperty(propertyName);
				System.out.println("Param: " + propertyName + "=" + propertySearchValue);
			}
		}
		return propertySearchValue;
	}
	//Ecris les nouvelles valeurs dans le fichier de conf
	public static void saveProperties(String propertiesName, String propertiesParam, String fileLocation, String comments) throws FileNotFoundException,
	IOException {
		// modifie les propri�t�
		properties.setProperty("level", "INFO");
		OutputStream out = new FileOutputStream(fileLocation);
		properties.store(out, comments);
		out.flush();
		out.close();
	}
}
