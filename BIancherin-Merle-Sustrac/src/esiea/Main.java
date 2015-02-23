package esiea;

import java.util.Properties;




public class Main {

	public static void main(String[] args) {
		 Logger logger = LoggerFactory.getLogger(Main.class);
		   logger.debug("Test debug ESIEA");
		   logger.info("Test info ESIEA");
		   logger.error("Test error ESIEA");
		  System.out.println(logger); 
		 // Folder folder=new Folder(10,"files01","10/12/2014");
		  
		  /***TEST FILE CONF***/
		  PropertiesFiles propri = new PropertiesFiles();
		  try{
		         // chargement des propriétés
		         Properties prop = PropertiesFiles.load("myFile.properties");
		         //parcourt et affiche les propriétes
		         propri.displayProperties(prop);
		         //modifie les propriété
		         prop.setProperty("level", "INFO");
		         //sauvegarde les modif dans le fichier
		         propri.saveProperties(prop,propri.propertiesFileLocation, null);
		      }
	      catch(Exception e){
	          e.printStackTrace();
	       }
		 
	}

}
