// FIXME déplacer dans un paquetage

// FIXME détailler le commentaire
/**
 * Represente un contact 
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Contact {
	
	/**
	 * nom du contact
	 */
	protected String nom;
	
	/**
	 * adresse mac du contact
	 */
	protected String adrmac;
	
	/**
	 * @param nom
	 * @param adrmac
	 * constructeur de la class Contact permet de créé un nouveau contact avec pour attibut nom:nom 
	 * et pour attribut adrmac:adrmac
	 */
	public Contact(String nom,String adrmac)
	{
		this.nom = nom;
		this.adrmac = adrmac;
		
	}
	
	// FIXME méthodes ?
	

	
}
