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
	private File File ;

	
	public Folder(long size, String Name, String Date) { //String path
		this.size= size;
		this.Name =Name;
		this.Date =Date;
		
		try {
			File = new File("log.dat");
			writer = new BufferedWriter(new FileWriter(File,true));
			// normalement si le fichier n'existe pas, il est crée à la racine du projet
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
		
		if(File.length()>this.size){
			System.out.println("trop gros");
			try {
				writer = new BufferedWriter(new FileWriter(new File(this.Name+".txt")));
				// normalement si le fichier n'existe pas, il est crée à la racine du projet
				
				//writer.write(log);
				writer.newLine();
				
				 
				writer.close();
				}
				catch (IOException e)
				{
				e.printStackTrace();
				}
		}
		
		
		try {
			writer = new BufferedWriter(new FileWriter(new File(this.Name+".txt"),true));
			// normalement si le fichier n'existe pas, il est crée à la racine du projet
			
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


