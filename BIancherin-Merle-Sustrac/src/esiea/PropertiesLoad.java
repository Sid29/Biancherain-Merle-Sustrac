package esiea;
import java.util.Iterator;
import java.util.Properties;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.OutputStream;

/**
 * Prise en compte des options de conf contenu dans le fichier propertie
 * @param filename fichier o� sont ecrits les propri�t�s
 */
class PropertiesLoad {
	static String propertiesFileLocation="myFile.properties";
	protected static Properties load(String filename) throws IOException, FileNotFoundException{
      Properties properties = new Properties();
      FileInputStream input = new FileInputStream(filename);
      try{
         properties.load(input);
         return properties;
      }
         finally{input.close();}
   }

   	//Lis toute les valeurs contenues dans properties
	protected static void displayProperties(Properties props) {
		Iterator<Object> it = props.keySet().iterator();
		while (it.hasNext()) {
			String propertyName = (String) it.next();
			String propertyValue = props.getProperty(propertyName);
			System.out.println(propertyName + "=" + propertyValue);
		}
	}

	//Ecris les nouvelles valeurs dans le fichier de conf
	public static void saveProperties(Properties props, String fileLocation, String comments) throws FileNotFoundException,
			IOException {
		OutputStream out = new FileOutputStream(fileLocation);
		props.store(out, comments);
		out.flush();
		out.close();
	}
   public static void main(String[] args){
      try{
         // chargement des propri�t�s
         Properties prop = PropertiesLoad.load("myFile.properties");
         //parcourt et affiche les propri�tes
         displayProperties(prop);
         //modifie les propri�t�
         prop.setProperty("level", "INFO");
         //sauvegarde les modif dans le fichier
         saveProperties(prop,propertiesFileLocation, null);
      }
      catch(Exception e){
         e.printStackTrace();
      }
   }
}
