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

	public void debug(String description) {
		messages.add(new Message(class1.getName(), description, Type.DEBUG));

	}

	public void info(String description) {
		messages.add(new Message(class1.getName(), description, Type.INFO));

	}

	public void error(String description) {
		messages.add(new Message(class1.getName(), description, Type.ERROR));
		
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
