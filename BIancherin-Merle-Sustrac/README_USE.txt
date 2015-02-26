FRAMEWORK DE LOG  

Vous trouverez un package de test "esiea" sur notre GIT contenant une classe main pour tester notre Framework.

/************ FONCTIONNALITE ***********************/
    
Notre framework possede :  
• Un Logger pour émettre le message
• Un formateur pour personnaliser le contenu du message
• Une ou plusieurs cibles pour stocker le message

Par default, notre formateur affiche la date du message,le niveau de log et le nom du logger


Par ailleurs notre framework permet de de configurer votre framework en Java et
dans un format textuel (fichier Properties Java).

Configuration possible :

-Choisir la cible de destination d'un message:
   cible=FILE (par default)
   Options possibles:- <ROTATE> crée un fichier de log des qu'il dépasse 1ko
   						(la taille est ici faible uniquement pour obtenir un resultat rapidement). 
   					 - <FILE>   crée un fichier de log unique.
   					 - <CONSOLE> Affiche les logs uniquement dans la console.

- Modifier le format de date visible  dans les logs.
   formatDate=yyyy-MM-dd HH:mm:ss.SSS (par default)

- Modifier le chemin de destination des logs:
   path=./test/ (par default)
   A noter que si le dossier /test n'existe pas, il sera crée par le programme.

- Modifier le niveau de logs à afficher 
   level=Info (par default)
   Valeurs possibles: <info>, <debug> , <error>.

Enfin nous avons essayer le respecter le principe d'OCP et 
il est donc possible de configurer le framework sans modifier le code.

/****************************************************/
Code à utiliser pour:

		Configurer notre framework en Java:
			Logger.makeNewProperties();

		Crée une instance LoggerFactory:
  			 Logger logger = LoggerFactory.getLogger(Main.class);

		Crée un Logger de debug 
   			logger.debug(String);

		Crée un Logger info  
   			logger.info(String);

		Crée un Logger d'erreur
    		logger.error(String);
    		
