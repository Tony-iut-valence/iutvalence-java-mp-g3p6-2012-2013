package fr.chat;




/**
 *  class qui represente un repertoire -> tableau de conctats
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Repertoire {
	
	
	// FIXME ne pas utiliser de valeur erreur, mais plut�t une r�f�rence nulle ou une exception
	// FIXME visibilit� ?
	/**
	 * valeur de retour d'adresse en cas d'erreur
	 */
	final static String ADR_ERREUR="00:00:00:00:00:00";
	
	/**
	 * nombre maximum de contacts dans un repertoire
	 */
	// FIXME visibilit� ?
	// FIXME renommer la constante
	final static int MAX_CONTACT=200;

	/**
	 * nom du repertoire
	 */
	protected String nom;
	
	
	/**
	 * tableau de contacts
	 */
	private Contact[] contacts;
	

	/**
	 * nombre de contacts
	 */
	// FIXME pourquoi protected ?
	// FIXME renommer l'attribut
	protected int nbContact;
	
	
	// FIXME compl�ter le commentaire
	/**
	 * Constructeur de repertoire avec pour param�tre le nom du repertoire
	 * @param nomrep
	 * 
	 */
	public Repertoire(String nomrep)
	{
		this.nom=nomrep;
		this.nbContact=0;
		this.contacts=new Contact[MAX_CONTACT];
		
	}
	
	
	// FIXME compl�ter le commentaire
	/**
	 * ajoute en conservant l'ordre un contact dans le repertoire courant a partir du nom et de l'adresse mac
	 * @param nom
	 * @param adrmac
	 * 
	 */
	public void ajouterContact(String nom,String adrmac)
	{
		Contact cont1,cont2;
		int i=0;
		this.nbContact=this.nbContact+1;
		while((i<this.nbContact)&((this.contacts[i].nom).compareTo(nom)<0))
		{
			i=i+1;
			
		}
		if (i==this.nbContact)
		{
			this.contacts[i].nom=nom;
			this.contacts[i].adrmac=adrmac;
		}
		else
		{
			if((this.contacts[i].nom).compareTo(nom)==0)
			{
				System.out.println("Il y a d�j� un contact de ce nom.");
			}
			
			else
			{
				cont1=this.contacts[i];
				this.contacts[i].nom=nom;
				this.contacts[i].adrmac=adrmac;
				i=i+1;
	
				while(i<=this.nbContact)
				{
					cont2=this.contacts[i];
					this.contacts[i]=cont1;
					cont1=cont2;
					i=i+1;
	
					
				}
			}		
		}
			
	}
	
	
	/**
	 * @author chizatto
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
	public String rechercheAdrContact(String nom) throws SaisieIncorrectExeption
	{
		int i=0;
		while((i<=this.nbContact)&((this.contacts[i].nom).compareTo(nom)!=0))
		{
			i=i+1;
		}
		if(i>this.nbContact)
		{
			System.out.println("Ce contact n'existe pas.");
		}
		else
		{
			return this.contacts[i].adrmac;
		}

		throw new SaisieIncorrectExeption();
		
	}
	
	// FIXME compl�ter le commentaire
	/**
	 * recherche le nom du contact d'adresse adrmac
	 * @param adrmac
	 * @return le nom associe a l'adresse mac
	 * 
	 */
	public String rechercheNomContact(String adrmac)
	{
		int i=0;
		while((i<=this.nbContact)&((this.contacts[i].adrmac).compareTo(adrmac)!=0))
		{
			i=i+1;
		}
		if(i>this.nbContact)
		{
			System.out.println("Cette adresse mac est introuvable.");
		}
		else
		{
			return this.contacts[i].nom;
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
		while((i<=this.nbContact)&((this.contacts[i].nom).compareTo(nom)!=0))
		{
			i=i+1;
			
		}
		if (i>this.nbContact)
		{
			System.out.println("Ce contact n'existe pas introuvable.");

		}
		else
		{
			
			while(i<this.nbContact)
			{
				this.contacts[i]=this.contacts[i+1];
				i=i+1;
			}
			this.nbContact=this.nbContact-1;
		}
			
	}
	

	// FIXME corriger le commentaire
	/**
	 * remplace l'adresse mac du contact de nom nom par adrmac
	 * @param nom du contact a modifier
	 * @param adrmac nouvelle adrmac du contact
	 * 
	 * 
	 */
	public void modifieAdrContact(String nom,String adrmac)
	{
		int i=0;
		while((i<=this.nbContact)&((this.contacts[i].nom).compareTo(nom)!=0))
		{
			i=i+1;
		}
		if(i>this.nbContact)
		{
			System.out.println("Ce contact n'existe pas.");
		}
		else
		{
			this.contacts[i].adrmac=adrmac;
		}
			
	}

}
