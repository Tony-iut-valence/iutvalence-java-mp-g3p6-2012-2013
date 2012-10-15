package fr.iutvalence.java.projets.chat;

import java.util.Date;


/**
 * class message
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Message {
	
	
	/**
	 * contenu du message
	 */
	private final String contenu;

	

	
	/**
	 * date de fin de creation du message
	 */
	private final Date date;
	
	
	/**
	 * destination du message
	 */
	private final String dest;
	
	// FIME compléter le commentaire
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
	
	
	// FIXME (autres) constructeurs , méthodes ?

}
