package fr.iutvalence.java.projets.chat;


/**
 *  class qui represente un repertoire -> ensemble de contacts
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Repertoire {
	
	
	// FIXME ne pas utiliser de valeur erreur, mais plut�t une r�f�rence nulle ou une exception
	/**
	 * valeur de retour d'adresse en cas d'erreur
	 */
	private final static String ADR_ERREUR="00:00:00:00:00:00";
	
	/**
	 * nombre maximum de contacts dans un repertoire
	 */
	// FIXME renommer la constante
	private final static int MAX_CONTACT=200;

	/**
	 * nom du repertoire
	 */
	// FIXME r�fl�chir � la visibilit� (� discuter en s�ance)
	protected String nom;
	
	/**
	 * tableau de contacts
	 */
	private Contact[] contacts;
	

	// FIXME renommer l'attribut (les contacts peuvent �tre multiples)
	/**
	 * nombre de contacts
	 */
	private int nombreDeContact;
	
	
	// FIXME compl�ter le commentaire
	/**
	 * Constructeur de repertoire avec pour param�tre le nom du repertoire
	 * @param nomrep
	 * 
	 */
	public Repertoire(String nomrep)
	{
		this.nom=nomrep;
		this.nombreDeContact=0;
		this.contacts=new Contact[MAX_CONTACT];
		
	}	
	
	// FIXME compl�ter le commentaire
	/**
	 * ajoute en conservant l'ordre un contact dans le repertoire courant a partir du nom et de l'adresse mac
	 * @param nom
	 * @param adrmac
	 * 
	 */
	// FIXME g�rer les erreurs avec des exceptions
	public void ajouterContact(String nom,String adrmac)
	{
		Contact cont1,cont2;
		int i=0;
		this.nombreDeContact=this.nombreDeContact+1;
		// FIXME la conjonction de conditions s'�crit &&
		while((i<this.nombreDeContact)&((this.contacts[i].getNomContact()).compareTo(nom)<0))
		{
			i=i+1;
			
		}
		if (i==this.nombreDeContact)
		{
			this.contacts[i]=new Contact(nom,adrmac);
		}
		else
		{
			if((this.contacts[i].getNomContact()).compareTo(nom)==0)
			{
				// FIXME pas d'affichage console dans les m�thodes du mod�le -> exceptions
				System.out.println("Il y a d�j� un contact de ce nom.");
			}
			
			else
			{
				cont1=this.contacts[i];
				this.contacts[i]=new Contact(nom,adrmac);
				i=i+1;
	
				while(i<=this.nombreDeContact)
				{
					cont2=this.contacts[i];
					this.contacts[i]=cont1;
					cont1=cont2;
					i=i+1;
	
					
				}
			}		
		}
			
	}
	
	
	// FIXME d�placer l'exception dans un fichier � part (une classe par fichier)
	/**
	 *
	 *d�claration du type d'erreur de saisie
	 */
	public class SaisieIncorrectExeption extends Exception {}

	// FIXME compl�ter le commentaire
	/**
	 * recherche l'adresse correspondant au contact de nom nom
	 * @param nom
	 * @return l'adresse mac correspondant au nom
	 * 
	 * @throws SaisieIncorrectExeption exeption soulev� si le contact n'est pas dans le tableau
	 */
	// FIXME le type de l'exception est mal choisi
	// FIXME renvoyer un objet contact plut�t que l'adresse
	public String rechercheAdrContact(String nom) throws SaisieIncorrectExeption
	{
		int i=0;
		// FIXME la conjonction de conditions s'�crit &&
		while((i<=this.nombreDeContact)&((this.contacts[i].getNomContact()).compareTo(nom)!=0))
		{
			i=i+1;
		}
		if(i>this.nombreDeContact)
		{
			// FIXME pas d'affichage console dans les m�thodes du mod�le -> exceptions
			System.out.println("Ce contact n'existe pas.");
		}
		else
		{
			return this.contacts[i].getAdrMac();
		}

		// FIXME essayer de traiter les cas d'erreur en d�but de m�thode, c'est souvent plus clair
		throw new SaisieIncorrectExeption();
		
	}
	
	// FIXME compl�ter le commentaire
	/**
	 * recherche le nom du contact d'adresse adrmac
	 * @param adrmac
	 * @return le nom associe a l'adresse mac
	 * 
	 */
	// FIXME renvoyer la valeur nulle si le contact n'est pas pr�sent
	// FIXME renvoyer un objet contact plut�t que le nom
	public String rechercheNomContact(String adrmac)
	{
		int i=0;
		while((i<=this.nombreDeContact)&((this.contacts[i].getAdrMac()).compareTo(adrmac)!=0))
		{
			i=i+1;
		}
		if(i>this.nombreDeContact)
		{
			System.out.println("Cette adresse mac est introuvable.");
		}
		else
		{
			return this.contacts[i].getNomContact();
		}
		
		return "Paul";
		
	}
	
	// FIXME compl�ter le commentaire
	/**
	 * supprime le contact de nom nom tout en conservant l'ordre
	 * @param nom
	 *  
	 */
	public void supprimeContact(String nom)
	{
		int i=0;
		while((i<=this.nombreDeContact)&((this.contacts[i].getNomContact()).compareTo(nom)!=0))
		{
			i=i+1;
			
		}
		if (i>this.nombreDeContact)
		{
			System.out.println("Ce contact n'existe pas introuvable.");

		}
		else
		{
			
			while(i<this.nombreDeContact)
			{
				this.contacts[i]=this.contacts[i+1];
				i=i+1;
			}
			this.nombreDeContact=this.nombreDeContact-1;
		}
			
	}
	

	// FIXME red�finir la m�thode toString (en s'appuyant sur celle de Contact), afin d'avoir une repr�sentation texte du r�pertoire
	// FIXME �crire une application de test basique, cr�ant un r�pertoire et l'affichant
	// FIXME �crire une application testant l'ajout, le retrait, la recherche.

}
