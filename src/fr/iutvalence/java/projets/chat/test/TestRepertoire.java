package fr.iutvalence.java.projets.chat.test;

import fr.iutvalence.java.projets.chat.*;

/**
 * class qui test la class Repertoire: cr�e un repertoire puis l'affiche
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
		boolean suppr;
		RepertoireTableau rep = new RepertoireTableau("Repertoire de Paul");
		System.out.println(rep.toString());
		try
		{
			rep.ajouterContact("Paul", "23:14:25:54:63");
		}
		catch (NomIncorrectException e)
		{
			System.out.println("erreur a l'ajout");
		}
		catch (CapaciteDepasseeException e)
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
		catch (CapaciteDepasseeException e)
		{
			System.out.println("erreur a l'ajout");
		}
		
		finally
		{
		}
		try
		{
			System.out.println("test de l'ajout d'une personne d�j� pr�sente:\n");
			rep.ajouterContact("Gertrude", "23:14:25:14:33");
		}
		catch (CapaciteDepasseeException e)
		{
			System.out.println("erreur a l'ajout");
		}
		
		catch (NomIncorrectException e)
		{
			System.out.println("*********erreur a l'ajout*********\n\n");
		}
		finally
		{
			System.out.println(rep.toString());
		}
			suppr=rep.supprimeContactParNom("Paul");
			if(!suppr)
				System.out.println("\nla suppression a �chou�\n");
		
		System.out.println("\n" + "recherche de l'adresse:\n" + rep.rechercheContactParNom("Gertrude") + "\n");
		System.out.println("\n" + "recherche du nom:\n" + rep.rechercheContactParAdresse("23:14:25:14:33") + "\n");

	}

}
