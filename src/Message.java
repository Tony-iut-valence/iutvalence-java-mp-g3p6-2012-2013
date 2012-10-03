import java.util.Date;


/**
 * Représente un message
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Message {
	
	// FIXME la valeur de l'attribut peut-elle changer une fois le message créé ? 
	
	/**
	 * contenu du message
	 */
	protected String contenu;

	// FIXME la valeur de l'attribut peut-elle changer une fois le message créé ?
	
	// FIXME constantes ?
	
	protected enum etat{
		ENCONSTRUCTION,
		ENVOYE,
		LU;
	}
	
	/**
	 * etat de reception
	 */
	protected etat etat;
	// FIXME la valeur de l'attribut peut-elle changer une fois le message créé ?
	
	/**
	 * date de fin de creation du message
	 */
	protected Date date;
	
	// FIXME la valeur de l'attribut peut-elle changer une fois le message créé ?
	
	/**
	 * destination du message
	 */
	protected String dest;
	

	/**
	 * @param contenu
	 * @param dest
	 */
	public Message(String contenu,String dest)
	{
		this.contenu = contenu;
		this.dest = dest;
		this.etat=ENCONSTRUCTION;
		this.date = new Date();
	}
	
	
	// FIXME (autres) constructeurs , méthodes ?

}
