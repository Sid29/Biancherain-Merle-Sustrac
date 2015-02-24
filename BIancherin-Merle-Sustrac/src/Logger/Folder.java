package Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Folder {

	private long size;
	private String Name;
	private String Date;
	private Message log;
	private String path;
	private BufferedWriter writer;
	private File File;
	private int i;

	public Folder(long size, String Date) { // String path

		this.size = size;
		Name = "log" + i + ".dat";
		this.Date = Date;

		try {
			File = new File(Name);
			writer = new BufferedWriter(new FileWriter(File, true));
			// normalement si le fichier n'existe pas, il est crée à la racine
			// du projet
			// writer.write(log);

			// writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public long getSize() {

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

	public void UpdateFolder(Message log) {
		System.out.println("1  " + File.getName() + " " + File.length());
		if (File.length() > this.size) {
			System.out.println("trop gros");
			i = i + 1;
			setName("log" + i);
			System.out.println(getName());

			try {
				File = new File(Name);
				writer = new BufferedWriter(new FileWriter(File));
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
			writer = new BufferedWriter(new FileWriter(new File(Name), true));
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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	private static String GetDate() {
		String format = "dd_MM_yy";
		java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat(
				format);
		java.util.Date date = new java.util.Date();
		System.out.println(formater.format(date));

		return formater.format(date);
	}

}
