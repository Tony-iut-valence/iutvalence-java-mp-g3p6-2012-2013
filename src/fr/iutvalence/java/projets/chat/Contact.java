package fr.iutvalence.java.projets.chat;

// FIXME détailler le commentaire
/**
 * class qui represente un contact 
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Contact {
	
	/**
	 * nom du contact
	 */
	private String nomContact;

	/**
	 * adresse mac du contact
	 */
	private String adrmac;
	
	
	/**
	 * constructeur de la class Contact permet de créé un nouveau contact avec pour attibut nom:nom 
	 * et pour attribut adrmac:adrmac
	 * @param nom
	 * @param adrmac
	 * 
	 */
	public Contact(String nom,String adrmac)
	{
		this.nomContact = nom;
		this.adrmac = adrmac;
		
	}
	
	/**
	 * @return renvoi le nom du contact courant
	 */
	
	public String getNomContact()
	{
		return this.nomContact;
	}
	

	/**
	 * @return renvoi l'adresse mac du contact courant
	 */
	public String getAdrMac()
	{
		return this.adrmac;
	}
}
