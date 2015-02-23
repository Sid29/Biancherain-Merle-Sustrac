package esiea;
import java.util.Properties;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

/**
 * Prise en compte des options de conf contenu dans le fichier propertie
 * @param filename fichier où sont ecrits les propriétés
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
         // chargement des propriétés
         Properties prop = PropertiesLoad.load("myFile.properties");
         // Affichage des propriétés
         // Récupère la propriété ma.cle
         // Si la propriété n'existe pas, retourne la valeur par défaut "vide"
         System.out.println("level:"+ prop.getProperty("level","vide"));
      }
      catch(Exception e){
         e.printStackTrace();
      }
   }
}
