package fr.iutvalence.java.projets.chat.test;

import fr.iutvalence.java.projets.chat.*;

/**
 * class qui test la class Contact: cr�e un contact puis affiche sont nom, �a class et puis applique la methode tostring
 * 
 * @author chizatto
 * 
 */
public class TestContact
{

	/**
	 * @param args
	 */
	//FIXME ce n'est pas un main ...
	public static void main()
	{
		Contact paul = new Contact("paul", "12:36:21:45:69");
		System.out.println(paul.getNom());
		System.out.println(paul.getAdresseIP());
		System.out.println(paul.toString());
	}

}
