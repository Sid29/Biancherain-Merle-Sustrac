package Logger;

import java.util.ArrayList;

public class Logger {
	Folder folder=new Folder(1000,"files01","10/12/2014");
	
	ArrayList<Message> messages;
	Class<?> class1;

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
		
		System.out.println(message);
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
			buffer = buffer+ message.toString()+"\n" ;
			folder.UpdateFolder(buffer);
			
			
		}	
		return buffer;
	}
}
