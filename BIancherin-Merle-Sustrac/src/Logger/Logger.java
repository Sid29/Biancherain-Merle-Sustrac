package Logger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class Logger {
	Folder folder = new Folder(1000, "files01");

	ArrayList<Message> messages;
	Class<?> class1;

	// static PropertiesFiles propri = new PropertiesFiles();
	public Logger(Class<?> class1) {
		this.class1 = class1;
		messages = new ArrayList<Message>();
	}

	/**
	 * Création d'un message de type Debug
	 *
	 * @param texte du message
	 */
	public void debug(String description) {

		Message message = new Message(class1.getName(), description, Type.DEBUG);
		messages.add(message);
		folder.UpdateFolder(message);
		System.out.println(message);

	}

	/**
	 * Création d'un message de type Info
	 * 
	 * @param texte du message
	 */
	public void info(String description) {
		Message message = new Message(class1.getName(), description, Type.INFO);
		messages.add(message);
		folder.UpdateFolder(message);
		System.out.println(message);
	}

	/**
	 * Création d'un message de type Error
	 *
	 * @param texte du message
	 */
	public void error(String description) {
		Message message = new Message(class1.getName(), description, Type.ERROR);
		messages.add(message);
		folder.UpdateFolder(message);
		System.out.println(message);
	}

	/**
	 * Chargement d'un fichier de propriété
	 *
	 * @param nom du fichier
	 */
	public static void loadProperties(String filename)
			throws FileNotFoundException, IOException {
		PropertiesFiles.load(filename);

	}

	/**
	 * Affichage d'une propriété
	 *
	 * @param Fichier de propriété à enregistrer
	 */
	public static void displayProperties() {
		PropertiesFiles.displayProperties();
	}

	/**
	 * Enregistrement d'une propriété
	 * @param propertiesParam 
	 * @param propertiesName 
	 *
	 * @param Fichier de propriété à enregistrer
	 */
	public static void saveProperties(String propertiesName, String propertiesParam)
			throws FileNotFoundException, IOException {
		PropertiesFiles.saveProperties(propertiesName, propertiesParam, PropertiesFiles.propertiesFileLocation, null);
	}

	/**
	 * Affichage d'une propriété
	 *
	 * @param Valeur de la propriété 
	 * @param Fichier de propriété à enregistrer
	 */
	public static void DisplayOnePropertie(String propertySearch )
	{	PropertiesFiles.displayOnePropertie(propertySearch);	}

	public boolean compare(Class<?> class2) {
		if (class1.equals(class2)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {

		String buffer = "";
		for (Message message : messages) {
			buffer = buffer + message.toString() + "\n";

		}
		return buffer;
	}

}
