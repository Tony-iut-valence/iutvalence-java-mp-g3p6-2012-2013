package fr.iutvalence.java.projets.chat.test;

import fr.iutvalence.java.projets.chat.*;

/**
 * class qui test la class Repertoire: crée un repertoire puis l'affiche
 * 
 * @author chizatto
 * 
 */
public class TestRepertoire
{

	/**
	 * @param args
	 * 
	 * 
	 */
	public static void main(String[] args)
	{
		Repertoire rep = new Repertoire("Repertoire de Paul");
		System.out.println(rep.toString());
		try
		{
			rep.ajouterContact("Paul", "23:14:25:54:63");
		}
		catch (NomIncorrectException e)
		{
			System.out.println("erreur a l'ajout");
		}
		finally
		{
		}
		try
		{
			rep.ajouterContact("Gertrude", "23:14:25:14:33");
		}
		catch (NomIncorrectException e)
		{
			System.out.println("erreur a l'ajout");
		}
		finally
		{
		}
		try
		{
			System.out.println("test de l'ajout d'une personne déjà présente:\n");
			rep.ajouterContact("Gertrude", "23:14:25:14:33");
		}
		catch (NomIncorrectException e)
		{
			System.out.println("*********erreur a l'ajout*********\n\n");
		}
		finally
		{
			System.out.println(rep.toString());
		}
		try
		{
			rep.supprimeContact("Paul");
		}
		catch (NomIncorrectException e)
		{
			System.out.println("*********erreur a la suppression*********\n\n");
		}
		finally
		{
			System.out.println(rep.toString());
		}
		System.out.println("\n" + "recherche de l'adresse:\n" + rep.rechercheAdresseContact("Gertrude") + "\n");
		System.out.println("\n" + "recherche du nom:\n" + rep.rechercheNomContact("23:14:25:14:33") + "\n");

	}

}
