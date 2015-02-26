package esiea;

import Logger.Logger;
import Logger.LoggerFactory;


public class Main {
	public static void main(String[] args) {
		
		/*** TEST FILE CONF ***/
		try {
			// parcourt et affiche les propri�tes
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
	}

}
