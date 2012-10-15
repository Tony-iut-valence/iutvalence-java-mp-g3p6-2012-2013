package fr.iutvalence.java.projets.chat;

import java.util.Date;


// FIXME d�tailler le commentaire
/**
 * class message
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Message {
	
	
	/**
	 * contenu du message
	 */
	private final String contenu;
	
	// FIXME ne pas g�rer les dates avec un objet Date (presques toutes les m�thodes sont obsol�tes) mais avec un objet Calendar
	/**
	 * date de fin de creation du message
	 */
	private final Date date;
	
	// FIXME renommer l'attribut
	/**
	 * destination du message
	 */
	private final String dest;
	
	// FIXME compl�ter le commentaire
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
	
	
	// FIXME (autres) constructeurs , m�thodes ?

	// FIXME red�finir la m�thode toString, afin d'avoir une repr�sentation texte du message
	// FIXME �crire une application de test basique, cr�ant un message et l'affichant
}
