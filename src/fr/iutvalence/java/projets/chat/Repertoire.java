package fr.iutvalence.java.projets.chat;


/**
 *  class qui represente un repertoire -> ensemble de contacts
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Repertoire {
	
	
	// FIXME d�placer l'exception dans un fichier � part (une classe par fichier)
	/**
	 *
	 *d�claration du type d'erreur de saisie
	 */
	public class SaisieIncorrectExeption extends Exception {}
	
	
	// FIXME ne pas utiliser de valeur erreur, mais plut�t une r�f�rence nulle ou une exception
	/**
	 * valeur de retour d'adresse en cas d'erreur
	 */
	private final static String ADR_ERREUR="00:00:00:00:00:00";
	
	/**
	 * nombre maximum de contacts dans un repertoire
	 */
	// FIXME(FIXED) renommer la constante
	private final static int CONTACT_MAXIMUM=200;

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
		this.contacts=new Contact[CONTACT_MAXIMUM];
		
	}	
	
	// FIXME compl�ter le commentaire
	/**
	 * ajoute en conservant l'ordre un contact dans le repertoire courant a partir du nom et de l'adresse mac
	 * @param nom
	 * @param adrmac
	 * 
	 */
	// FIXME g�rer les erreurs avec des exceptions
	public void ajouterContact(String nom,String adrmac)throws SaisieIncorrectExeption
	{
		Contact cont1,cont2;
		int i=0;
		this.nombreDeContact=this.nombreDeContact+1;
		// FIXME(FIXED) la conjonction de conditions s'�crit &&
		while((i<this.nombreDeContact)&&((this.contacts[i].getNomContact()).compareTo(nom)<0))
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
				// FIXME(FIXED) pas d'affichage console dans les m�thodes du mod�le -> exceptions
				throw new SaisieIncorrectExeption();
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
	
	

	// FIXME compl�ter le commentaire
	/**
	 * recherche l'adresse correspondant au contact de nom nom
	 * @param nom
	 * @return l'adresse mac correspondant au nom
	 * 
	 * @throws SaisieIncorrectExeption exeption soulev� si le contact n'est pas dans le tableau
	 */
	// FIXME le type de l'exception est mal choisi
	// FIXME (FIXED)renvoyer un objet contact plut�t que l'adresse
	public Contact rechercheAdrContact(String nom) throws SaisieIncorrectExeption
	{
		int i=0;
		// FIXME(FIXED) la conjonction de conditions s'�crit &&
		while((i<=this.nombreDeContact)&&((this.contacts[i].getNomContact()).compareTo(nom)!=0))
		{
			i=i+1;
		}
		if(i>this.nombreDeContact)
		{
			// FIXME(FIXED) pas d'affichage console dans les m�thodes du mod�le -> exceptions
			throw new SaisieIncorrectExeption();
		}
		else
		{
			return this.contacts[i];
		}
		
	}
	
	// FIXME compl�ter le commentaire
	/**
	 * recherche le nom du contact d'adresse adrmac
	 * @param adrmac
	 * @return le nom associe a l'adresse mac
	 * 
	 */
	// FIXME renvoyer la valeur nulle si le contact n'est pas pr�sent
	// FIXME(FIXED) renvoyer un objet contact plut�t que le nom
	public Contact rechercheNomContact(String adrmac) throws SaisieIncorrectExeption
	{
		int i=0;
		while((i<=this.nombreDeContact)&((this.contacts[i].getAdrMac()).compareTo(adrmac)!=0))
		{
			i=i+1;
		}
		if(i>this.nombreDeContact)
		{
			throw new SaisieIncorrectExeption();
		}
		else
		{
			return this.contacts[i];
		}
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
	

	// FIXME(FIXED) red�finir la m�thode toString (en s'appuyant sur celle de Contact), afin d'avoir une repr�sentation texte du r�pertoire
	// FIXME �crire une application de test basique, cr�ant un r�pertoire et l'affichant
	// FIXME �crire une application testant l'ajout, le retrait, la recherche.
	public String toString()
	{
		String result="nombre de contact: "+this.nombreDeContact+"\n";
		result=result+"contenu de la table:\n";
		for (int i=0; i<this.nombreDeContact; i++)
		{
			result=result+"contact"+String.valueOf(i)+"\n"+this.contacts[i].toString();
		}
		return result;
	}

}
