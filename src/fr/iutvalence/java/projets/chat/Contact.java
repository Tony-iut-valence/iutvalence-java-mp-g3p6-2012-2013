package fr.iutvalence.java.projets.chat;


/**
 * class qui represente un contact, il est constitué d'un nom et d'une adresse mac
 * 
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Contact
{

	/**
	 * nom du contact
	 */
	private final String nom;

	/**
	 * adresse mac du contact
	 */
	private final String adresseIP;

	/**
	 * etat de connexion du contact(quand connecter vaut true le contact est connecté)
	 */
	private boolean connecter;
	/**
	 * Création d'un nouveau contact de nom et adresse MAC donnés.
	 * 
	 * @param nom
	 *            le nom du contact
	 * @param adrIP
	 *            l'adresse MAC du contact
	 * 
	 */
	public Contact(String nom, String adrIP)
	{
		this.nom = nom;
		this.adresseIP = adrIP;
		this.connecter= false;
	}

	/**
	 * Obtenir le nom du contact.
	 * 
	 * @return le nom du contact
	 */
	public String getNom()
	{
		return this.nom;
	}

	/**
	 * Obtenir l'adresse IP du contact
	 * 
	 * @return l'adresse IP du contact
	 */
	public String getAdresseIP()
	{
		return this.adresseIP;
	}

	
	
	/**
	 * obtenir l'etat de connexion du contact
	 * @return la valeur de la varriable connecter
	 */
	public boolean getconnecter()
	{
		return this.connecter;
	}
	/**
	 * Redéfinition de la methode toString pour la class contact, conduit a un affichage du type: nom du contact: (nom)
	 * adresse IP: (adr)
	 * connecter:(false/true)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String result = "nom du contact: " + this.nom + "\n";
		result = result + "adresse IP: " + this.adresseIP + "\n";
		result=result+"connecter"+this.connecter+"\n";
		return result;
	}
 
	/**
	 * 2 contacts sont égaux si ils ont le même nom et la même adresse IP
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object o)
	{
		if (!(o instanceof Contact))
			return false;
		if (((Contact) o).getNom() != this.getNom())
			return false;
		if (((Contact) o).getAdresseIP() != this.getAdresseIP())
			return false;
		return true;
	}

}
