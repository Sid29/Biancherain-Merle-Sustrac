package Logger;

public enum Type {

	DEBUG("Debug"),INFO("Info"),ERROR("Erreur");
	
		private String name;

		private Type(String name) {
			this.name = name;
		}
		
		
		/**
		 * Récupération d'un type en fonction de sa description
		 * 
		 * @param texte
		 *            du message
		 */
		public static Type getType(String name){
			for(Type type : Type.values()){
				if(type.name.toUpperCase().equals(name.toUpperCase())){
					return type;
				}
			}
			return Type.ERROR;
		}
			
}
