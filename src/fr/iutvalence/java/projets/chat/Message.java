package fr.iutvalence.java.projets.chat;

import java.util.Date;


// FIXME détailler le commentaire
/**
 * class message
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Message {
	
	
	/**
	 * contenu du message
	 */
	private final String contenu;
	
	// FIXME ne pas gérer les dates avec un objet Date (presques toutes les méthodes sont obsolètes) mais avec un objet Calendar
	// FIXME ou à la limite, utiliser un long représentant la date EPOCH
	/**
	 * date de fin de creation du message
	 */
	private final Date date;
	
	// FIXME renommer l'attribut
	/**
	 * destination du message
	 */
	private String dest;
	
	// FIXME compléter le commentaire
	/**
	 * @param contenu
	 * @param dest
	 */
	public Message(String contenu,String dest)
	{
		this.contenu = contenu;
		this.dest = dest;
		this.date = new Date();
	}
	
	
	

	// FIXME écrire une application de test basique, créant un message et l'affichant
	
	
	// FIXME compléter le commentaire
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String result="date du message: "+this.date.toString()+"\n";
		result=result+"destinataire: "+this.dest+"\n";
		result=result+"contenu du message: "+this.contenu;
		return result;
	}
	
	/**
	 * Obtenir le contenu du message
	 * @return le contenu du message
	 */
	public String getContenu()
	{
		return this.contenu;
	}
	
	/**
	 * Obtenir le nom du destinataire du message
	 * @return le destinataire du message
	 */
	public String getDestinataire()
	{
		return this.dest;
	}
	/**
	 * Obtenir la date de création du message
	 * @return la date de création du message
	 */
	public Date getDate()
	{
		return this.date;
	}
	
	/**
	 * change le destinataire du message
	 * @param dest nouvelle valeure pour le destinataire du message
	 */
	public void changerDestinataire(String dest)
	{
		this.dest=dest;
	}
}
