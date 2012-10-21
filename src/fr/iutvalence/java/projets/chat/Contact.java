package fr.iutvalence.java.projets.chat;

// FIXME détailler le commentaire
/**
 * class qui represente un contact 
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Contact {
	
	// FIXME on peut se limiter à "nom", "Contact" est implicite
	/**
	 * nom du contact
	 */
	private final String nomContact;

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
		this.nomContact = nom;
		this.adrmac = adrmac;
		
	}
	
	/**
	 * Obtenir le nom du contact.
	 * @return le nom du contact
	 */
	// FIXME même remarque pour le nom de la méthode que pour le nom de l'attribut
	public String getNomContact()
	{
		return this.nomContact;
	}
	
	/**
	 * Obtenir l'adresse MAC du contact
	 * @return l'adresse MAC du contact
	 */
	public String getAdrMac()
	{
		return this.adrmac;
	}
	
	// FIXME écrire une application de test basique, créant un contact et l'affichant
	
	
	// FIXME compléter le commentaire
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String result="nom du contact: "+this.nomContact+"\n";
		result=result+"adresse mac: "+this.adrmac+"\n";
		return result;
	}
	
}
