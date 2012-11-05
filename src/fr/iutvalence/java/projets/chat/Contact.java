package fr.iutvalence.java.projets.chat;

// FIXME(FIXED) d�tailler le commentaire
/**
 * class qui represente un contact, il ce constitue d'un nom et d'une adresse mac
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Contact {
	
	// FIXME(FIXED) on peut se limiter � "nom", "Contact" est implicite
	/**
	 * nom du contact
	 */
	private final String nom;

	/**
	 * adresse mac du contact
	 */
	private final String adrmac;
	
	/**
	 * Cr�ation d'un nouveau contact de nom et adresse MAC donn�s.
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
	// FIXME(FIXED) m�me remarque pour le nom de la m�thode que pour le nom de l'attribut
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
	
	// FIXME(FIXED) �crire une application de test basique, cr�ant un contact et l'affichant
	
	
	// FIXME(FIXED) compl�ter le commentaire
	/**
	 * Red�finition de la methode toString pour la class contact, conduit a un affichage du type:
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
