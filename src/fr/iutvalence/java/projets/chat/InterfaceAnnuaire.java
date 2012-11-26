package fr.iutvalence.java.projets.chat;

/**
 * @author chizatto
 *
 */
public interface InterfaceAnnuaire
{	
	/**
	 * Obtenir le nombre de contacts du repertoire
	 * 
	 * @return le nombre de contacts du repertoire
	 */
	public int getNombreUtilisateurs();
	/**
	 * supprime le contact de nom nom tout en conservant l'ordre renvoi une exceptionsi le contact n'est pas trouvé
	 * 
	 * @param nom
	 * @throws NomIncorrectException
	 * 
	 */
	public void supprimeUtilisateur(String nom) throws NomIncorrectException;
	
	/**
	 * recherche l'adresse correspondant au contact de nom nom renvoi null si le contact n'est pas trouvé
	 * 
	 * @param nom
	 * @return l'adresse IP correspondant au nom
	 * 
	 */
	public Utilisateur rechercheAdresseUtilisateurParNom(String nom);
	/**
	 * recherche le nom du contact d'adresse adrIP renvoi null si l'adresse n'appartien pas au repertoire
	 * 
	 * @param adrIP
	 * @return le nom associe a l'adresse IP
	 * 
	 */
	public Utilisateur rechercheNomUtilisateurParAdresse(String adrIP);
	
	
	/**
	 * ajoute en conservant l'ordre un contact dans le repertoire courant a partir du nom et de l'adresse IP peut
	 * renvoyer une erreur en cas de saisie incorrect
	 * 
	 * @param nom
	 * @param adrIP
	 * @throws NomIncorrectException
	 * 
	 */
	public void ajouterUtilisateur(String nom, String adrIP) throws NomIncorrectException;
	/**
	 * Obtenir le contact de position i renvoi une erreur si la position est supérieur au nombre de contact
	 * 
	 * @param i  
	 * @return le contact de position i
	 * @throws PositionIncorrecteExeption   
	 */
	public Utilisateur getUtilisateur(int i)throws PositionIncorrecteExeption;
	/**
	 * @return le nombre de contacts du repertoire
	 */
	
	
	
	

}
