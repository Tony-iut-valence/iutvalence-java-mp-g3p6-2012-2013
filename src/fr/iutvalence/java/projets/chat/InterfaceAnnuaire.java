package fr.iutvalence.java.projets.chat;
import java.net.*;
/**
 * @author chizatto
 *
 */
public interface InterfaceAnnuaire
{	
	/**
	 * @return le nombre d'utilisateurs du repertoire
	 * 
	 * @return le nombre d'utilisateurs du repertoire
	 */
	public int getNombreUtilisateurs();
	/**
	 * supprime le contact de nom nom tout en conservant l'ordre renvoi une exceptionsi le contact n'est pas trouv�
	 * 
	 * @param nom
	 * @throws NomIncorrectException
	 * 
	 */
	public boolean supprimeUtilisateur(String nom);
	
	/**
	 * recherche l'adresse correspondant au contact de nom nom renvoi null si le contact n'est pas trouv�
	 * 
	 * @param nom
	 * @return l'adresse IP correspondant au nom
	 * 
	 */
	public Utilisateur rechercheUtilisateurParNom(String nom);
	/**
	 * recherche le nom du contact d'adresse adrIP renvoi null si l'adresse n'appartien pas au repertoire
	 * 
	 * @param adrIP
	 * @return le nom associe a l'adresse IP
	 * 
	 */
	public Utilisateur rechercheUtilisateurParAdresse(InetAddress adrIP);
	
	
	/**
	 * ajoute en conservant l'ordre un contact dans le repertoire courant a partir du nom et de l'adresse IP peut
	 * renvoyer une erreur en cas de saisie incorrect
	 * 
	 * @param nom
	 * @param adrIP
	 * @throws NomIncorrectException
	 * 
	 */
	public void ajouterUtilisateur(String nom, String adrIP) throws NomIncorrectException,CapaciteDepasseeException;
	/**
	 * Obtenir le contact de position i renvoi une erreur si la position est sup�rieur au nombre de contact
	 * 
	 * @param i  
	 * @return le contact de position i
	 * @throws PositionIncorrecteExeption   
	 */
	public Utilisateur getUtilisateur(int i)throws PositionIncorrecteExeption;

	
	
	

}
