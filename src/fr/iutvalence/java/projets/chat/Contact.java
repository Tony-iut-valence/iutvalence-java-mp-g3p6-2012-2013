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
	// FIXME un contact peut-il changer de nom ? (à discuter en séance)
	private String nomContact;

	/**
	 * adresse mac du contact
	 */
	// FIXME un contact peut-il changer d'adresse MAC ? (à discuter en séance)
	private String adrmac;
	
	
	// FIXME (FIXED) lisibilité du commentaire
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
	
	// FIXME (FIXED) lisibilité du commentaire
	/**
	 * Obtenir le nom du contact.
	 * @return le nom du contact
	 */
	// FIXME même remarque pour le nom de la méthode que pour le nom de l'attribut
	public String getNomContact()
	{
		return this.nomContact;
	}
	
	// FIXME (FIXED) lisibilité du commentaire
	/**
	 * Obtenir l'adresse MAC du contact
	 * @return l'adresse MAC du contact
	 */
	public String getAdrMac()
	{
		return this.adrmac;
	}
	
	// FIXME redéfinir la méthode toString, afin d'avoir une représentation texte du contact
	// FIXME écrire une application de test basique, créant un contact et l'affichant
}
