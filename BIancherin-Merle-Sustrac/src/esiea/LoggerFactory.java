package esiea;

import java.util.ArrayList;

public class LoggerFactory {

	private static ArrayList<Logger> loggers;

	public static Logger getLogger(Class<?> class1) {
		if (loggers == null) {
			Logger logger = new Logger(class1); 
			return logger;
		}
		for (Logger logger : loggers) {
			if (logger.compare(class1)) { // on regarde si un logger existe déjà
											// pour cette class.
				return logger; // Si oui on le renvoi
			}
		}

		// Sinon on en crée un nouveau
		Logger logger = new Logger(class1);
		return logger;
	}

}
