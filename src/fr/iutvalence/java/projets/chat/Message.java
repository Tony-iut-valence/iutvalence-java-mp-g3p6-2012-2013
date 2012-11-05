package fr.iutvalence.java.projets.chat;

import java.util.Calendar;


// FIXME(FIXED) détailler le commentaire
/**
 * class qui represente un message, il ce constitue d'un contenu, d'une date et d'une adresse de destination
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Message {
	
	
	/**
	 * contenu du message
	 */
	private final String contenu;
	
	// FIXME(FIXED) ne pas gérer les dates avec un objet Date (presques toutes les méthodes sont obsolètes) mais avec un objet Calendar
	// FIXME(FIXED) ou à la limite, utiliser un long représentant la date EPOCH
	/**
	 * date de fin de creation du message
	 */
	private final Calendar date;
	
	// FIXME(FIXED) renommer l'attribut
	/**
	 * destination du message
	 */
	private String adresseDest;
	
	// FIXME(FIXED) compléter le commentaire
	/**
	 * Constructeur de la class message prenant en paramètre le contenu et la destination et met pour valeur de date
	 * la date courante
	 * @param contenu
	 * @param dest
	 */
	public Message(String contenu,String dest)
	{
		this.contenu = contenu;
		this.adresseDest = dest;
		this.date = Calendar.getInstance();
	}
	
	
	

	// FIXME(FIXED) écrire une application de test basique, créant un message et l'affichant
	
	
	// FIXME(FIXED) compléter le commentaire
	/**
	 * Redéfinition de la methode toString pour la class Message, conduit a un affichage du type:
	 * date du message: (date)
	 * destinataire: (adresseDest)
	 * contenu du message: (contenue)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String result="date du message: "+this.date.getTime().toString()+"\n";
		result=result+"destinataire: "+this.adresseDest+"\n";
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
		return this.adresseDest;
	}
	/**
	 * Obtenir la date de création du message
	 * @return la date de création du message
	 */
	public Calendar getDate()
	{
		return this.date;
	}
	
	/**
	 * change le destinataire du message
	 * @param dest nouvelle valeure pour le destinataire du message
	 */
	public void changerDestinataire(String dest)
	{
		this.adresseDest=dest;
	}
}
