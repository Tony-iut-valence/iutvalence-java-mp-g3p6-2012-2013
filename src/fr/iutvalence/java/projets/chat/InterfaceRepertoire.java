package fr.iutvalence.java.projets.chat;

/**
 * @author chizatto
 *
 */
public interface InterfaceRepertoire
{
	/**
	 * Obtenir le nombre de contacts du repertoire
	 * 
	 * @return le nombre de contacts du repertoire
	 */
	public int getNombreDeContacts();
	
	/**
	 * Obtenir le nom du repertoire
	 * 
	 * @return le nom du repertoire
	 */
	public String getNom();
	
	/**
	 * Obtenir le contact de position i renvoi une erreur si la position est sup�rieur au nombre de contact
	 * 
	 * @param i  
	 * @return le contact de position i
	 * @throws PositionIncorrecteExeption   
	 */
	
	public Contact getContact(int i) throws PositionIncorrecteExeption;
	
	/**
	 * ajoute en conservant l'ordre un contact dans le repertoire courant a partir du nom et de l'adresse mac peut
	 * renvoyer une erreur en cas de saisie incorrect
	 * 
	 * @param nom
	 * @param adrmac
	 * @throws NomIncorrectException
	 * 
	 */	
	public void ajouterContact(String nom, String adrmac) throws NomIncorrectException;
	/**
	 * recherche l'adresse correspondant au contact de nom nom renvoi null si le contact n'est pas trouv�
	 * 
	 * @param nom
	 * @return l'adresse mac correspondant au nom
	 * 
	 */
	public Contact rechercheAdresseContactParNom(String nom);
	
	/**
	 * recherche le nom du contact d'adresse adrmac renvoi null si l'adresse n'appartien pas au repertoire
	 * 
	 * @param adrmac
	 * @return le nom associe a l'adresse mac
	 * 
	 */
	public Contact rechercheNomContactParAdresse(String adrmac);
	
	/**
	 * supprime le contact de nom nom tout en conservant l'ordre renvoi une exceptionsi le contact n'est pas trouv�
	 * 
	 * @param nom
	 * @throws NomIncorrectException
	 * 
	 */
	public void supprimeContact(String nom) throws NomIncorrectException;
}
