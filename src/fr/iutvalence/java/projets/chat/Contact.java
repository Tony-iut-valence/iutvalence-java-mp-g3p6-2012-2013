package fr.iutvalence.java.projets.chat;
import java.net.*;

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
	//private final InetAddress adresseIP;

	/**
	 * etat de connexion du contact(quand connecter vaut true le contact est connect�)
	 */
	private boolean connecter;
	
	private InetSocketAddress socketAddr;
	/**
	 * Cr�ation d'un nouveau contact de nom et adresse MAC donn�s.
	 * 
	 * @param nom
	 *            le nom du contact
	 * @param adrIP
	 *            l'adresse MAC du contact
	 * 
	 */
	public Contact(String nom, InetSocketAddress adrIP)
	{
		this.nom = nom;
		this.connecter= false;
		this.socketAddr= adrIP ;
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


	public InetSocketAddress getsocketAddr()
	{
		return this.socketAddr;
	}
	
	public void setSocketAddr(InetSocketAddress adrr)
	{
		this.socketAddr=adrr;
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
	 * Red�finition de la methode toString pour la class contact, conduit a un affichage du type: nom du contact: (nom)
	 * adresse IP: (adr)
	 * connecter:(false/true)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String result = "nom du contact: " + this.nom + "\n";
		result = result + "adresse IP: " + this.socketAddr.toString() + "\n";
		result=result+"connecter"+this.connecter+"\n";
		return result;
	}
 
	/**
	 * 2 contacts sont �gaux si ils ont le m�me nom et la m�me adresse IP
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	
	// FIXME attention : il faut red�finir �galement hashCode !
	// FIXME ne pas comparer les chaines avec == ou !=, �a ne marche pas !
	public boolean equals(Object o)
	{
		if (!(o instanceof Contact))
			return false;
		if (((Contact) o).getNom() != this.getNom())
			return false;
		if (((Contact) o).getsocketAddr() != this.getsocketAddr())
			return false;
		return true;
	}

}
