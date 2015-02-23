package esiea;

import Logger.Logger;
import Logger.LoggerFactory;

import java.util.Properties;

public class Main {

	public static void main(String[] args) {
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

		/*** TEST FILE CONF ***/
		// PropertiesFiles propri = new PropertiesFiles();
		try {
			// chargement des propri�t�s
			Properties prop = Logger.loadProperties("myFile.properties");
			// parcourt et affiche les propri�tes
			Logger.displayProperties(prop);
			// modifie les propri�t�
			prop.setProperty("level", "INFO");
			// sauvegarde les modif dans le fichier
			Logger.saveProperties(prop);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
