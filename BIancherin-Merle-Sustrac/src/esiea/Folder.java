package esiea;

public class Folder {

		
	private int size;
	private String Name;
	private String Date;
	private String log;
	
	public Folder(int size, String Name, String Date) {
		this.size= size;
		this.Name =Name;
		this.Date =Date;
			
	}

   	public int getSize() {
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
	}

}


