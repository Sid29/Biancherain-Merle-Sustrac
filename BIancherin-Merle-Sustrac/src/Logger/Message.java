package Logger;


import java.util.Date;


public class Message implements Comparable<Message>  {

	private Date date;
	private String nom;
	private String description;
	private Type type;

	public Message(String nom, String description, Type type) {
		this.nom = nom;
		this.description = description;
		this.type =type;
		this.date = new java.util.Date();
	}
	
	

	@Override
	public String toString() {
		String format = "yyyy-MM-dd HH:mm:ss.SSS"; 
		java.text.SimpleDateFormat formater = new java.text.SimpleDateFormat( format ); 

		return formater.format( date )  + "[NAME=" + nom + " LEVEL="+type+" MESSAGE="+ description + "]";
	}



	@Override
	public int compareTo(Message autreMesssage) {
		
		return this.type.compareTo(autreMesssage.type);
	}

	
} 
