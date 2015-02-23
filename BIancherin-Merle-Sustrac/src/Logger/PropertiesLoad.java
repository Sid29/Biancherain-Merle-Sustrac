package Logger;
import java.util.Properties;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

/**
 * Prise en compte des options de conf contenu dans le fichier propertie
 * @param filename fichier o� sont ecrits les propri�t�s
 */
class PropertiesLoad {
   protected static Properties load(String filename) throws IOException, FileNotFoundException{
      Properties properties = new Properties();
      FileInputStream input = new FileInputStream(filename);
      try{
         properties.load(input);
         return properties;
      }
         finally{input.close();}
   }

   public static void main(String[] args){
      try{
         // chargement des propri�t�s
         Properties prop = PropertiesLoad.load("myFile.properties");
         // Affichage des propri�t�s
         // R�cup�re la propri�t� ma.cle
         // Si la propri�t� n'existe pas, retourne la valeur par d�faut "vide"
         System.out.println("level:"+ prop.getProperty("level","vide"));
      }
      catch(Exception e){
         e.printStackTrace();
      }
   }
}
