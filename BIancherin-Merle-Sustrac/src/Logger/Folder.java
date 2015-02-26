package Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Folder {

	private long size;
	private String Name;
	private String Date;
	private String path;
	private BufferedWriter writer;
	private File file;
	private int i;

	protected Folder(long size, String Date) { 
		this.size = size;
		Name = "log" + i +"_"+GetDate()+ ".dat";
		this.Date = Date;
		//recuperation du path des logs dans le fichier properties (si present)
		path="./";
		if(PropertiesFiles.propertiePresent("path"))
		{path = PropertiesFiles.displayOnePropertie("path");}
		
		//Empeche la création de fichier de log si affichage en console
		if(!(PropertiesFiles.propertiePresent("cible")&&
				PropertiesFiles.displayOnePropertie("cible").equals("CONSOLE")))
		{	
			try {
				File filePath = new File(path);
				//crée un sous dossier contenu dans le path si non existant
				if(!filePath.exists())
				{
					boolean result = false;
					try{
						filePath.mkdir();
						result=true;
					}
					catch(SecurityException se){
						//do something
					}
					if(!result)
					{System.out.println("Can't create the DIR");}
				}
				file = new File(path+Name);
				writer = new BufferedWriter(new FileWriter(file, true));			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	protected long getSize() {
		return size;
	}

	protected void setSize(int size) {
		this.size = size;
	}

	protected String getName() {
		return Name;
	}

	protected void setName(String name) {
		Name = name;
	}

	protected String getDate() {
		return Date;
	}

	protected void setDate(String date) {
		Date = date;
	}

	protected void UpdateFolder(Message log) {			
		//recuperation de la cible des logs dans le fichier properties
		String target="ROTATE";
		if(PropertiesFiles.propertiePresent("cible"))
		{target = PropertiesFiles.displayOnePropertie("cible");}
		if (file.length() > this.size & file.exists() & target.equals("ROTATE")) {
			System.out.println("Size exceeded! New file created");
			i = i + 1;
			setName("log" + i+"_"+GetDate()+".dat");
			try {
				file = new File(path+Name);
				writer = new BufferedWriter(new FileWriter(file));
				// normalement si le fichier n'existe pas, il est crée à la
				// racine du projet
				writer.write("" + log);
				writer.newLine();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			writer = new BufferedWriter(new FileWriter(new File(path+Name), true));
			// normalement si le fichier n'existe pas, il est crée à la racine
			// du projet
			writer.newLine();
			writer.write("" + log);
			writer.newLine();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected String getPath() {
		return path;
	}

	protected void setPath(String path) {
		this.path = path;
	}

	private static String GetDate() {
		String format = "yyyy_MM_dd h_mm_ss";
		java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat(
				format);
		java.util.Date date = new java.util.Date();
		System.out.println(formater.format(date));
		return formater.format(date);
	}

}
