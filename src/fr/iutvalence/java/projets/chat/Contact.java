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
	private final String adresseMac;

	/**
	 * etat de connexion du contact(quand connecter vaut true le contact est connecté)
	 */
	private boolean connecter;
	/**
	 * Création d'un nouveau contact de nom et adresse MAC donnés.
	 * 
	 * @param nom
	 *            le nom du contact
	 * @param adrmac
	 *            l'adresse MAC du contact
	 * 
	 */
	public Contact(String nom, String adrmac)
	{
		this.nom = nom;
		this.adresseMac = adrmac;
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
	 * Obtenir l'adresse MAC du contact
	 * 
	 * @return l'adresse MAC du contact
	 */
	public String getAdresseMac()
	{
		return this.adresseMac;
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
	 * adresse mac: (adr)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String result = "nom du contact: " + this.nom + "\n";
		result = result + "adresse mac: " + this.adresseMac + "\n";
		return result;
	}

	// FIXME(FIXED) dire en quoi 2 contacts sont égaux 
	/**
	 * 2 contacts sont égaux si ils ont le même nom
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object o)
	{
		if (!(o instanceof Contact))
			return false;
		if (((Contact) o).getNom() != this.getNom())
			return false;
		return true;
	}

}
