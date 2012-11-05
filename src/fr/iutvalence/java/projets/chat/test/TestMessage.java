package fr.iutvalence.java.projets.chat.test;
import fr.iutvalence.java.projets.chat.*;

/**
 *  class qui test la class Message:
 * crée un message puis affiche sont contenu, ça destination, ça date puis applique la methode tostring
 * ensuite on change le destinataire et on recommence
 * @author chizatto
 *
 */
public class TestMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Message pitimessage= new Message("Bonsoir","12:36:21:45:69");
		System.out.println(pitimessage.getContenu());
		System.out.println(pitimessage.getDestinataire());
		System.out.println(pitimessage.getDate());
		System.out.println(pitimessage.toString());
		pitimessage.changerDestinataire("12:56:91:38:59");
		System.out.println(pitimessage.toString());

	}

}
