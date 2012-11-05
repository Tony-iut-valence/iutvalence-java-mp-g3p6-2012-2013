package fr.iutvalence.java.projets.chat;

// FIXME(FIXED) détailler le commentaire
/**
 * class qui represente un contact, il ce constitue d'un nom et d'une adresse mac
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Contact {
	
	// FIXME(FIXED) on peut se limiter à "nom", "Contact" est implicite
	/**
	 * nom du contact
	 */
	private final String nom;

	/**
	 * adresse mac du contact
	 */
	private final String adrmac;
	
	/**
	 * Création d'un nouveau contact de nom et adresse MAC donnés.
	 * @param nom le nom du contact
	 * @param adrmac l'adresse MAC du contact
	 * 
	 */
	public Contact(String nom,String adrmac)
	{
		this.nom = nom;
		this.adrmac = adrmac;
		
	}
	
	/**
	 * Obtenir le nom du contact.
	 * @return le nom du contact
	 */
	// FIXME(FIXED) même remarque pour le nom de la méthode que pour le nom de l'attribut
	public String getNom()
	{
		return this.nom;
	}
	
	/**
	 * Obtenir l'adresse MAC du contact
	 * @return l'adresse MAC du contact
	 */
	public String getAdrMac()
	{
		return this.adrmac;
	}
	
	// FIXME(FIXED) écrire une application de test basique, créant un contact et l'affichant
	
	
	// FIXME(FIXED) compléter le commentaire
	/**
	 * Redéfinition de la methode toString pour la class contact, conduit a un affichage du type:
	 * nom du contact: (nom)
	 * adresse mac: (adr)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String result="nom du contact: "+this.nom+"\n";
		result=result+"adresse mac: "+this.adrmac+"\n";
		return result;
	}
	
}
