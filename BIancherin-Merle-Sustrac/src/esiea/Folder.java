package esiea;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Folder {

		
	private long size;
	private String Name;
	private String Date;
	private String log;
	private String path;
	private BufferedWriter writer;

	
	public Folder( String Name, String Date) { //String path
		//this.size= File.length();
		this.Name =Name;
		this.Date =Date;
		
		try {
			writer = new BufferedWriter(new FileWriter(new File("log.dat")));
			// normalement si le fichier n'existe pas, il est cr�e � la racine du projet
			//writer.write(log);
			 
			//writer.close();
			}
			catch (IOException e)
			{
			e.printStackTrace();
			}
			
	}

   	public long getSize() {
   		//size=File.length();
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}

	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}
	public void  UpdateFolder(String log){
		
		
		try {
			writer = new BufferedWriter(new FileWriter(new File("log.dat")));
			// normalement si le fichier n'existe pas, il est cr�e � la racine du projet
			
			writer.write(log);
			writer.newLine();
			
			 
			writer.close();
			}
			catch (IOException e)
			{
			e.printStackTrace();
			}
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	

}


