package esiea;

import Logger.Logger;
import Logger.LoggerFactory;




public class Main {

	public static void main(String[] args) {
		 Logger logger = LoggerFactory.getLogger(Main.class);
		   logger.debug("Test debug ESIEA");
		   logger.info("Test info ESIEA");
		   logger.error("Test error ESIEA");
		  System.out.println(logger); 
		 // Folder folder=new Folder(10,"files01","10/12/2014");
		 
	}

}
