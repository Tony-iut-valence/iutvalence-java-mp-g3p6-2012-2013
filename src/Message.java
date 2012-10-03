// FIXME déplacer dans un paquetage

import java.util.Date;


/**
 * Représente un message
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Message {
	
	// FIXME la valeur de l'attribut peut-elle changer une fois le message créé ? 
	// FIXME réfléchir à la visibilité de l'attribut
	/**
	 * contenu du message
	 */
	public String contenu;

	// FIXME la valeur de l'attribut peut-elle changer une fois le message créé ?
	// FIXME réfléchir à la visibilité de l'attribut
	// FIXME constantes ?
	/**
	 * etat de reception
	 */
	public int etat;
	
	// FIXME la valeur de l'attribut peut-elle changer une fois le message créé ?
	// FIXME réfléchir à la visibilité de l'attribut
	/**
	 * date de fin de creation du message
	 */
	public Date date;
	
	// FIXME la valeur de l'attribut peut-elle changer une fois le message créé ?
	// FIXME réfléchir à la visibilité de l'attribut
	/**
	 * destination du message
	 */
	public String dest;
	

	/**
	 * @param contenu
	 * @param dest
	 */
	public Message(String contenu,String dest)
	{
		this.contenu = contenu;
		this.dest = dest;
		this.etat = 0;
		this.date = new Date();
	}
	
	
	// FIXME (autres) constructeurs , méthodes ?

}
