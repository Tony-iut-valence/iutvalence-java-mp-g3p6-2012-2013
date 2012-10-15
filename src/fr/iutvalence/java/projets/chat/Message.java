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
	/**
	 * date de fin de creation du message
	 */
	private final Date date;
	
	// FIXME renommer l'attribut
	/**
	 * destination du message
	 */
	private final String dest;
	
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
	
	
	// FIXME (autres) constructeurs , méthodes ?

	// FIXME redéfinir la méthode toString, afin d'avoir une représentation texte du message
	// FIXME écrire une application de test basique, créant un message et l'affichant
}
