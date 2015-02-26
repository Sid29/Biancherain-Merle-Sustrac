                                  Installation de la librairie Logger

Dans votre projet Eclipse faite propriété puis « Java Build Path. »
Cliquer sur « Add External JARs… » puis sélectionner le logger.jar

Appuyer sur OK.

Ensuite créé un nouveau fichier myFile.propertie dans le src de votre projet. 
(nous vous conseillons fortment de copier le contenu du fichier myFile.propertie contenu dans le Jar).

Enfin vous pouvez ajouter dans votre code la commande 
		Logger.makeNewProperties();
pour commencer à personnaliser votre configuration de framework.