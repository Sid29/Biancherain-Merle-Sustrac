FRAMEWORK DE LOG  

Copier se code dans le Main  il vous permettra de modifier les différentes fonctions de la Framework.
/************ TEST FILE CONF ***********************/
	try {
			// Chargement des  propriétés.
			Logger.loadProperties("myFile.properties");
			// Parcours et affiche les propriétés. 
		//	Logger.displayProperties();

			// Sauvegarde les modification  dans le fichier
		//	Logger.modifyProperties("level", "Info");
			
			Logger.makeNewProperties();
			} catch (Exception e) {
			e.printStackTrace();
		}
/****************************************************/
     
Les diffèrents propriété modifiable sont:


   cible=FILE
   
   option3=ROTATE
   
   option2=FILE
   
   option1=CONSOLE

Modifie le format de date visible  dans les logs.
   formatDate=yyyy-MM-dd HH:mm:ss.SSS

Modifie le format de sortit des logs:
   format= [NAME=" + nom + " LEVEL=" + type+ " MESSAGE=" + description + "] 

Modifie le chemin de destination des logs:
   path=./test/

Modifie les logs à afficher 
   level=Info 
   Valeurs possibles: info, debug(tout est afficher) , error.
/****************************************************/
Code à utiliser pour:

		Crée une instance LoggerFactory:
  			 Logger logger = LoggerFactory.getLogger(Main.class);

		Crée un Logger de debug 
   			logger.debug(String);

		Crée un Logger info  
   			logger.info(String);

		Crée un Logger d'erreur
    		logger.error(String);
