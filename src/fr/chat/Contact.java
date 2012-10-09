// FIXME trouver un nom de paquetage plus évocateur (fr.iutvalence.java.projets.chat)
package fr.chat;

// FIXME détailler le commentaire
/**
 * class qui represente un contact 
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Contact {
	
	// FIXME pourquoi protected ? (à discuter en séance)
	/**
	 * nom du contact
	 */
	protected String nom;

	// FIXME pourquoi protected ? (à discuter en séance)
	/**
	 * adresse mac du contact
	 */
	protected String adrmac;
	
	
	/**
	 * constructeur de la class Contact permet de créé un nouveau contact avec pour attibut nom:nom 
	 * et pour attribut adrmac:adrmac
	 * @param nom
	 * @param adrmac
	 * 
	 */
	public Contact(String nom,String adrmac)
	{
		this.nom = nom;
		this.adrmac = adrmac;
		
	}
	
	// FIXME méthodes ?
	

	
}
