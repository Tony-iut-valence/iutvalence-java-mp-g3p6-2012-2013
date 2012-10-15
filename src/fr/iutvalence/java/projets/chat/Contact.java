package fr.iutvalence.java.projets.chat;

// FIXME d�tailler le commentaire
/**
 * class qui represente un contact 
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Contact {
	
	// FIXME on peut se limiter � "nom", "Contact" est implicite
	/**
	 * nom du contact
	 */
	// FIXME un contact peut-il changer de nom ? (� discuter en s�ance)
	private String nomContact;

	/**
	 * adresse mac du contact
	 */
	// FIXME un contact peut-il changer d'adresse MAC ? (� discuter en s�ance)
	private String adrmac;
	
	
	// FIXME (FIXED) lisibilit� du commentaire
	/**
	 * Cr�ation d'un nouveau contact de nom et adresse MAC donn�s.
	 * @param nom le nom du contact
	 * @param adrmac l'adresse MAC du contact
	 * 
	 */
	public Contact(String nom,String adrmac)
	{
		this.nomContact = nom;
		this.adrmac = adrmac;
		
	}
	
	// FIXME (FIXED) lisibilit� du commentaire
	/**
	 * Obtenir le nom du contact.
	 * @return le nom du contact
	 */
	// FIXME m�me remarque pour le nom de la m�thode que pour le nom de l'attribut
	public String getNomContact()
	{
		return this.nomContact;
	}
	
	// FIXME (FIXED) lisibilit� du commentaire
	/**
	 * Obtenir l'adresse MAC du contact
	 * @return l'adresse MAC du contact
	 */
	public String getAdrMac()
	{
		return this.adrmac;
	}
	
	// FIXME red�finir la m�thode toString, afin d'avoir une repr�sentation texte du contact
	// FIXME �crire une application de test basique, cr�ant un contact et l'affichant
}
