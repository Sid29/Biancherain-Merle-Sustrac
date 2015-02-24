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
	 * @param texte
	 *            du message
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
	 * @param texte
	 *            du message
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
	 * @param texte
	 *            du message
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
	 * @param nom
	 *            du fichier
	 */
	public static Properties loadProperties(String filename)
			throws FileNotFoundException, IOException {
		return PropertiesFiles.load(filename);

	}

	/**
	 * Affichage d'une propriété
	 *
	 * @param propri�
	 *            �té à afficher
	 */
	public static void displayProperties(Properties prop) {
		PropertiesFiles.displayProperties(prop);
	}

	/**
	 * Enregistrement d'une propriété
	 *
	 * @param Propri�
	 *            �té à enregistrer
	 */
	public static void saveProperties(Properties prop)
			throws FileNotFoundException, IOException {
		PropertiesFiles.saveProperties(prop,
				PropertiesFiles.propertiesFileLocation, null);
	}

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
