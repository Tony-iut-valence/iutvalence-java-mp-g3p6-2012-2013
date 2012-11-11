package fr.iutvalence.java.projets.chat.test;

import fr.iutvalence.java.projets.chat.*;

/**
 * class qui test la class Utilisateur: crée un utilisateur puis l'affiche
 * 
 * @author chizatto
 * 
 */
public class TestUtilisateur
{
	public static void main()
	{
		Utilisateur user1 = new Utilisateur("paul", "azerty1234");
		System.out.println(user1.toString());

	}

}
