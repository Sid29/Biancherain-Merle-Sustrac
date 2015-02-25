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

		showLog(message);

	}

	/**
	 * Création d'un message de type Info
	 * 
	 * @param texte
	 *            du message
	 */
	public void info(String description) {
		Message message = new Message(class1.getName(), description, Type.INFO);
		showLog(message);
	}

	/**
	 * Création d'un message de type Error
	 *
	 * @param texte
	 *            du message
	 */
	public void error(String description) {

		Message message = new Message(class1.getName(), description, Type.ERROR);

		showLog(message);

	}
	
	
	/**
	 * Affichage du message en fonction de son niveau
	 * 
	 * @param le message à afficher
	 */
	private void showLog(Message message) {
		messages.add(message);
		Type typeLevel;
		typeLevel = Type.getType(PropertiesFiles.displayOnePropertie("level"));

		if (message.isShow(typeLevel)) {
			folder.UpdateFolder(message);
			System.out.println(message);
		}

	}

	/**
	 * Chargement d'un fichier de propriété
	 *
	 * @param nom
	 *            du fichier
	 */
	public static void loadProperties(String filename)
			throws FileNotFoundException, IOException {
		PropertiesFiles.load(filename);

	}

	/**
	 * Affichage d'une propriété
	 *
	 * @param Fichier
	 *            de propriété à enregistrer
	 */
	public static void displayProperties() {
		PropertiesFiles.displayProperties();
	}

	/**
	 * Enregistrement d'une propriété
	 * 
	 * @param propertiesParam
	 * @param propertiesName
	 *
	 * @param Fichier
	 *            de propriété à enregistrer
	 */
	public static void modifyProperties(String propertiesName,
			String propertiesParam) throws FileNotFoundException, IOException {
		PropertiesFiles.modifyProperties(propertiesName, propertiesParam,
				PropertiesFiles.propertiesFileLocation);
	}

	/**
	 * Création d'un fichier .propertie
	 * 
	 */
	public static void makeNewProperties() {
		PropertiesFiles.makeNewConfig();
	}

	/**
	 * Affichage d'une propriété
	 *
	 * @param Valeur
	 *            de la propriété
	 * @param Fichier
	 *            de propriété à enregistrer
	 */
	public static String DisplayOnePropertie(String propertySearch) {
		return PropertiesFiles.displayOnePropertie(propertySearch);
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
