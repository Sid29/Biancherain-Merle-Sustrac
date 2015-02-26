package esiea;

import Logger.Logger;
import Logger.LoggerFactory;

import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		

		/*** TEST FILE CONF ***/
		// PropertiesFiles propri = new PropertiesFiles();
		try {
			// chargement des propri�t�s
			Logger.loadProperties("myFile.properties");
			// parcourt et affiche les propri�tes
		//	Logger.displayProperties();

			// sauvegarde les modif dans le fichier
		//	Logger.modifyProperties("level", "Info");
			
			Logger.makeNewProperties();
			} catch (Exception e) {
			e.printStackTrace();
		}
		
		Logger logger = LoggerFactory.getLogger(Main.class);
		logger.debug("Test debug ESIEA");
		logger.info("Test info ESIEA");
		logger.error("Test error ESIEA");
		logger.debug("Test debug ESIEA");
		logger.info("Test info ESIEA");
		logger.error("Test error ESIEA");
		logger.debug("Test debug ESIEA");
		logger.info("Test info ESIEA");
		logger.error("Test error ESIEA");
		logger.debug("Test debug ESIEA");
		logger.info("Test info ESIEA");
		logger.error("Test error ESIEA");
		logger.debug("Test debug ESIEA");
		logger.info("Test info ESIEA");
		logger.error("Test error ESIEA");
		logger.debug("Test debug ESIEA");
		logger.info("Test info ESIEA");
		logger.error("Test error ESIEA");
		logger.debug("Test debug ESIEA");
		logger.info("Test info ESIEA");
		logger.error("Test error ESIEA");
		logger.debug("Test debug ESIEA");
		logger.info("Test info ESIEA");
		logger.error("Test error ESIEA");
		// System.out.println(logger);
		// Folder folder=new Folder(10,"files01","10/12/2014"); 
	}

}
