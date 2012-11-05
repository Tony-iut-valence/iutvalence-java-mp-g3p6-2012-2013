package fr.iutvalence.java.projets.chat.test;
import fr.iutvalence.java.projets.chat.*;

/**
 * class qui test la class Contact:
 * crée un contact puis affiche sont nom, ça class et puis applique la methode tostring
 * @author chizatto
 *
 */
public class TestContact {

	/**
	 * @param args
	 */
	public static void main() {
		Contact paul= new Contact("paul","12:36:21:45:69");
		System.out.println(paul.getNomContact());
		System.out.println(paul.getAdrMac());
		System.out.println(paul.toString());
	}

}
