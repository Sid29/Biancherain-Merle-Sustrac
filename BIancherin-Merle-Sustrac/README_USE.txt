FRAMEWORK DE LOG  

Copier se code dans le Main  il vous permettra de modifier les diff�rentes fonctions de la Framework.
/************ TEST FILE CONF ***********************/
	try {
			// Chargement des  propri�t�s.
			Logger.loadProperties("myFile.properties");
			// Parcours et affiche les propri�t�s. 
		//	Logger.displayProperties();

			// Sauvegarde les modification  dans le fichier
		//	Logger.modifyProperties("level", "Info");
			
			Logger.makeNewProperties();
			} catch (Exception e) {
			e.printStackTrace();
		}
/****************************************************/
     
Les diff�rents propri�t� modifiable sont:


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

Modifie les logs � afficher 
   level=Info 
   Valeurs possibles: info, debug(tout est afficher) , error.
/****************************************************/
Code � utiliser pour:

		Cr�e une instance LoggerFactory:
  			 Logger logger = LoggerFactory.getLogger(Main.class);

		Cr�e un Logger de debug 
   			logger.debug(String);

		Cr�e un Logger info  
   			logger.info(String);

		Cr�e un Logger d'erreur
    		logger.error(String);
