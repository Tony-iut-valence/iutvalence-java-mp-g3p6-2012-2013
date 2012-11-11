package fr.iutvalence.java.projets.chat;


/**
 * class qui represente un contact, il est constitu� d'un nom et d'une adresse mac
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
	 * Cr�ation d'un nouveau contact de nom et adresse MAC donn�s.
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
	 * Red�finition de la methode toString pour la class contact, conduit a un affichage du type: nom du contact: (nom)
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

	// FIXME dire en quoi 2 contacts sont �gaux
	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object o)
	{
		if (!(o instanceof Contact))
			return false;
		if (((Contact) o).getNom() != this.getNom())
			return false;
		if (((Contact) o).getAdresseMac() != this.getAdresseMac())
			return false;
		return true;
	}

}
