package fr.iutvalence.java.projets.chat;
import java.net.*;
import java.util.Calendar;

/**
 * classe qui represente un message, constitu� d'un contenu, d'une date et d'une adresse de destination
 * 
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Message
{

	/**
	 * contenu du message
	 */
	private final String contenu;

	/**
	 * date de fin de creation du message
	 */
	private final Calendar date;

	/**
	 * destination du message
	 */
	private InetAddress adresseDest;

	/**
	 * Constructeur de la class message prenant en param�tre le contenu et la destination et met pour valeur de date la
	 * date courante
	 * 
	 * @param contenu
	 * @param dest
	 */
	public Message(String contenu, InetAddress dest)
	{
		this.contenu = contenu;
		this.adresseDest = dest;
		this.date = Calendar.getInstance();
	}

	/**
	 * Red�finition de la methode toString pour la class Message, conduit a un affichage du type: date du message:
	 * (date) destinataire: (adresseDest) contenu du message: (contenue)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String result = "date du message: " + this.date.getTime().toString() + "\n";
		result = result + "destinataire: " + this.adresseDest.toString() + "\n";
		result = result + "contenu du message: " + this.contenu;
		return result;
	}

	/**
	 * Obtenir le contenu du message
	 * 
	 * @return le contenu du message
	 */
	public String getContenu()
	{
		return this.contenu;
	}

	/**
	 * Obtenir le nom du destinataire du message
	 * 
	 * @return le destinataire du message
	 */
	public InetAddress getDestinataire()
	{
		return this.adresseDest;
	}

	/**
	 * Obtenir la date de cr�ation du message
	 * 
	 * @return la date de cr�ation du message
	 */
	public Calendar getDate()
	{
		return this.date;
	}

	/**
	 * change le destinataire du message
	 * 
	 * @param dest
	 *            nouvelle valeure pour le destinataire du message
	 */
	public void setAdresseDest(InetAddress dest)
	{
		this.adresseDest = dest;
	}

	/**
	 * deux messages sont �gaux si ils ont le m�me contenu la m�me date et le m�me destinataire
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	// FIXME attention : il faut red�finir �galement hashCode !
	// FIXME ne pas comparer les chaines avec == ou !=, �a ne marche pas !
	public boolean equals(Object o)
	{
		if (!(o instanceof Message))
			return false;
		if (((Message) o).getContenu() != this.getContenu())
			return false;
		if (((Message) o).getDate() != this.getDate())
			return false;
		if (((Message) o).getDestinataire() != this.getDestinataire())
			return false;
		return true;
	}
}
