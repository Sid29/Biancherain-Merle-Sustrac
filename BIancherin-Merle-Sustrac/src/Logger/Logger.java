package Logger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Logger {
	Folder folder = new Folder(1000, "files01");
	ArrayList<Message> messages;
	Class<?> class1;
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
		//recuperation du level des logs dans le fichier properties (si présent)
		typeLevel= Type.getType("Debug");
		if(PropertiesFiles.propertiePresent("level"))
		{typeLevel = Type.getType(PropertiesFiles.displayOnePropertie("level"));}
		if (message.isShow(typeLevel)) 
		{
			//Verifie la valeur du param "cible" et 
			//affiche dans la console ou dans un fichier en fonction
			if(PropertiesFiles.propertiePresent("cible")&& 
					PropertiesFiles.displayOnePropertie("cible").equals("CONSOLE"))
			{System.out.println(message);}
			else{folder.UpdateFolder(message);}		
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
	 * Création d'un fichier .propertie
	 * 
	 */
	public static void makeNewProperties() {
		PropertiesFiles.makeNewConfig();
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
