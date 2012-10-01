import java.util.Date;


/**
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 *represente un message
 */
public class Message {
	/**
	 * contenu du message
	 */
	public String contenu;
	/**
	 * etat de reception
	 */
	public int etat;
	/**
	 * date de fin de creation du message
	 */
	public Date date;
	

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
	

}
