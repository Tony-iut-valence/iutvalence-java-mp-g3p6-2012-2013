package fr.iutvalence.java.projets.chat;
import java.net.*;
/*import java.util.*;*/

/**
 * class qui represente un repertoire -> ensemble de contacts
 * 
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class RepertoireTableau implements InterfaceRepertoire
{

	/**
	 * nombre maximum de contacts dans un repertoire
	 */
	private final static int CONTACTS_MAXIMUM = 200;

	/**
	 * nom du repertoire
	 */
	private String nom;

	/**
	 * tableau de contacts
	 */
	private Contact[] contacts;

	/**
	 * nombre de contacts
	 */
	private int nombreDeContacts;

	/**
	 * Constructeur de repertoire avec pour paramètre le nom du repertoire met par defaut le nombre de contact a 0 et
	 * initialise la valeur de contacts avec un nouveau tableau de contact
	 * 
	 * @param nomrep
	 * 
	 */
	public RepertoireTableau(String nomrep)
	{
		this.nom = nomrep;
		this.nombreDeContacts = 0;
		this.contacts = new Contact[CONTACTS_MAXIMUM];

	}

	/**
	 * Obtenir le nombre de contacts du repertoire
	 * 
	 * @return le nombre de contacts du repertoire
	 */
	public int getNombreDeContacts()
	{
		return this.nombreDeContacts;
	}

	/**
	 * Obtenir le nom du repertoire
	 * 
	 * @return le nom du repertoire
	 */
	public String getNom()
	{
		return this.nom;
	}

	/**
	 * Obtenir le contact de position i renvoi une erreur si la position est supérieur au nombre de contact
	 * 
	 * @param i
	 * @return le contact de position i
	 * @throws PositionIncorrecteExeption
	 */
	public Contact getContact(int i) throws PositionIncorrecteExeption
	{
		if (i > this.nombreDeContacts)
			throw new PositionIncorrecteExeption();
		return this.contacts[i];
	}

	/**
	 * ajoute en conservant l'ordre un contact dans le repertoire courant a partir du nom et de l'adresse mac peut
	 * renvoyer une erreur en cas de saisie incorrect
	 * 
	 * @param nom
	 * @param adrIP
	 * @throws NomIncorrectException
	 * 
	 */

	public void ajouterContact(String nom, InetAddress adrIP) throws NomIncorrectException, CapaciteDepasseeException

	{
		Contact cont1, cont2;
		if (this.nombreDeContacts == CONTACTS_MAXIMUM)
		{

			throw new CapaciteDepasseeException();
		}
		int i = 0;
		while ((i < this.nombreDeContacts) && ((this.contacts[i].getNom()).compareTo(nom) < 0))
		{
			i = i + 1;

		}
		if (i == this.nombreDeContacts)
		{
			this.contacts[i] = new Contact(nom, adrIP);
			this.nombreDeContacts = this.nombreDeContacts + 1;
		}
		else
		{
			if ((this.contacts[i].getNom()).compareTo(nom) == 0)
			{
				throw new NomIncorrectException();
			}

			else
			{
				cont1 = this.contacts[i];
				this.contacts[i] = new Contact(nom, adrIP);
				i = i + 1;

				while (i <= this.nombreDeContacts)
				{
					cont2 = this.contacts[i];
					this.contacts[i] = cont1;
					cont1 = cont2;
					i = i + 1;

				}
				this.nombreDeContacts = this.nombreDeContacts + 1;
			}
		}
	}

	/**
	 * recherche l'adresse correspondant au contact de nom nom renvoi null si le contact n'est pas trouvé
	 * 
	 * @param nom
	 * @return l'adresse mac correspondant au nom
	 * 
	 */

	public Contact rechercheContactParNom(String nom)
	{
		int i = 0;

		while ((i <= this.nombreDeContacts) && ((this.contacts[i].getNom()).compareTo(nom) != 0))
		{
			i = i + 1;
		}
		if (i > this.nombreDeContacts)
		{
			return null;
		}
		else
		{
			return this.contacts[i];
		}

	}

	/**
	 * recherche le nom du contact d'adresse adrmac renvoi null si l'adresse n'appartien pas au repertoire
	 * 
	 * @param adrIP
	 * @return le nom associe a l'adresse IP
	 * 
	 */

	public Contact rechercheContactParAdresse(InetAddress adrIP)
	{
		int i = 0;
		while ((i <= this.nombreDeContacts) & ((this.contacts[i].getAdresseIP()).equals(adrIP)))
		{
			i = i + 1;
		}
		if (i > this.nombreDeContacts)
		{
			return null;
		}
		else
		{
			return this.contacts[i];
		}
	}

	/**
	 * supprime le contact de nom nom tout en conservant l'ordre renvoi une exceptionsi le contact n'est pas trouvé
	 * 
	 * @param nom
	 * @throws NomIncorrectException
	 * 
	 */
	public boolean supprimeContactParNom(String nom)
	{
		int i = 0;
		while ((i <= this.nombreDeContacts) && ((this.contacts[i].getNom()).compareTo(nom) != 0))
		{
			i = i + 1;

		}
		if (i > this.nombreDeContacts)
			return false;

		while (i < this.nombreDeContacts)
		{
			this.contacts[i] = this.contacts[i + 1];
			i = i + 1;
		}
		this.nombreDeContacts = this.nombreDeContacts - 1;
		return true;

	}

	/**
	 * Redéfinition de la methode toString pour la class Repertoire, conduit a un affichage du type: nombre de contact:
	 * (nombreDeContat) contenu de la table: contact(0) nom du contact: (nom 0) adresse mac: (adr 0) | V
	 * contact(nombreDeContat) nom du contact: (nom nombreDeContat) adresse mac: (adr nombreDeContat)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String result = "nom du repertoire: " + this.nom + "\n";
		result = result + "nombre de contact: " + this.nombreDeContacts + "\n";
		result = result + "contenu de la table:\n";
		for (int i = 0; i < this.nombreDeContacts; i++)
		{
			result = result + "contact" + String.valueOf(i) + "\n" + this.contacts[i].toString();
		}
		return result;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object o)
	{
		if (!(o instanceof RepertoireTableau))
			return false;
		if (((RepertoireTableau) o).getNom() != this.getNom())
			return false;
		if (((RepertoireTableau) o).getNombreDeContacts() != this.getNombreDeContacts())
			return false;
		for (int i = 0; i < this.getNombreDeContacts(); i++)
		{
			try
			{
				if (!(this.getContact(i).equals(((RepertoireTableau) o).getContact(i))))
					return false;
			}
			catch (PositionIncorrecteExeption e)
			{
				return false;
			}

		}
		return true;
	}

}
