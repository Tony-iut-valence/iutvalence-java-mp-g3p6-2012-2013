package fr.iutvalence.java.projets.chat;


/**
 *  class qui represente un repertoire -> ensemble de contacts
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Repertoire {
	
	
	
	
	
	
	
	/**
	 * nombre maximum de contacts dans un repertoire
	 */
	private final static int CONTACTS_MAXIMUM=200;

	/**
	 * nom du repertoire
	 */
	private String nom;
	
	/**
	 * tableau de contacts
	 */
	private Contact[] contacts;
	

	// FIXME(FIXED) renommer l'attribut (les contacts peuvent �tre multiples)
	/**
	 * nombre de contacts
	 */
	private int nombreDeContacts;
	
	
	// FIXME(FIXED) compl�ter le commentaire
	/**
	 * Constructeur de repertoire avec pour param�tre le nom du repertoire met par defaut le nombre
	 * de contact a 0 et initialise la valeur de contacts avec un nouveau tableau de contact
	 * @param nomrep
	 * 
	 */
	public Repertoire(String nomrep)
	{
		this.nom=nomrep;
		this.nombreDeContacts=0;
		this.contacts=new Contact[CONTACTS_MAXIMUM];
		
	}	
	
	// FIXME(FIXED) compl�ter le commentaire
	/**
	 * ajoute en conservant l'ordre un contact dans le repertoire courant a partir du nom et de l'adresse mac
	 * peut renvoyer une erreur en cas de saisie incorrect
	 * @param nom
	 * @param adrmac
	 * @throws NomIncorrectException 
	 * 
	 */
	// FIXME(FIXED) le nom de l'exception n'est pas g�nial
	
	public void ajouterContact(String nom,String adrmac) throws NomIncorrectException
	{
		Contact cont1,cont2;
		int i=0;
		
	
		while((i<this.nombreDeContacts)&&((this.contacts[i].getNom()).compareTo(nom)<0))
		{
			i=i+1;
			
		}
		if (i==this.nombreDeContacts)
		{
			this.contacts[i]=new Contact(nom,adrmac);
			this.nombreDeContacts=this.nombreDeContacts+1;
		}
		else
		{
			if((this.contacts[i].getNom()).compareTo(nom)==0)
			{
				throw new NomIncorrectException();
			}
			
			else
			{
				cont1=this.contacts[i];
				this.contacts[i]=new Contact(nom,adrmac);
				i=i+1;
	
				while(i<=this.nombreDeContacts)
				{
					cont2=this.contacts[i];
					this.contacts[i]=cont1;
					cont1=cont2;
					i=i+1;
	
					
				}
				this.nombreDeContacts=this.nombreDeContacts+1;
			}		
		}
			
	}
	
	

	// FIXME(FIXED) compl�ter le commentaire
	/**
	 * recherche l'adresse correspondant au contact de nom nom renvoi null si le contact n'est pas trouv�
	 * @param nom
	 * @return l'adresse mac correspondant au nom
	 * 
	 */
	// FIXME(FIXED remplac� par return null) le type de l'exception est mal choisi
	public Contact rechercheAdrContact(String nom)
	{
		int i=0;

		while((i<=this.nombreDeContacts)&&((this.contacts[i].getNom()).compareTo(nom)!=0))
		{
			i=i+1;
		}
		if(i>this.nombreDeContacts)
		{
			return null;
		}
		else
		{
			return this.contacts[i];
		}
		
	}
	
	// FIXME(FIXED) compl�ter le commentaire
	/**
	 * recherche le nom du contact d'adresse adrmac renvoi null si l'adresse n'appartien pas au repertoire
	 * @param adrmac
	 * @return le nom associe a l'adresse mac
	 * 
	 */
	// FIXME(FIXED) renvoyer la valeur nulle si le contact n'est pas pr�sent
	public Contact rechercheNomContact(String adrmac)
	{
		int i=0;
		while((i<=this.nombreDeContacts)&((this.contacts[i].getAdrMac()).compareTo(adrmac)!=0))
		{
			i=i+1;
		}
		if(i>this.nombreDeContacts)
		{
			return null;
		}
		else
		{
			return this.contacts[i];
		}
	}
	
	// FIXME(FIXED) compl�ter le commentaire
	/**
	 * supprime le contact de nom nom tout en conservant l'ordre renvoi une exceptionsi le contact n'est pas trouv�
	 * @param nom
	 * @throws NomIncorrectException 
	 *  
	 */
	public void supprimeContact(String nom) throws NomIncorrectException
	{
		int i=0;
		while((i<=this.nombreDeContacts)&((this.contacts[i].getNom()).compareTo(nom)!=0))
		{
			i=i+1;
			
		}
		if (i>this.nombreDeContacts)
		{
			throw new NomIncorrectException();

		}
		else
		{
			
			while(i<this.nombreDeContacts)
			{
				this.contacts[i]=this.contacts[i+1];
				i=i+1;
			}
			this.nombreDeContacts=this.nombreDeContacts-1;
		}
			
	}
	


	// FIXME(FIXED) �crire une application de test basique, cr�ant un r�pertoire et l'affichant
	// FIXME(FIXED) �crire une application testant l'ajout, le retrait, la recherche.

	
	// FIXME(FIXED) compl�ter le commentaire
	
	/**
	 * Red�finition de la methode toString pour la class Repertoire, conduit a un affichage du type:
	 * nombre de contact: (nombreDeContat)
	 *contenu de la table:
	 * contact(0)
	 * nom du contact: (nom 0)
	 * adresse mac: (adr 0)
	 *  |
	 *  V
	 *  contact(nombreDeContat)
	 * nom du contact: (nom nombreDeContat)
	 * adresse mac: (adr nombreDeContat)
	 * @see java.lang.Object#toString()
	 */
	public String toString()	
	{
		String result="nom du repertoire: "+this.nom+"\n";
		result=result+"nombre de contact: "+this.nombreDeContacts+"\n";
		result=result+"contenu de la table:\n";
		for (int i=0; i<this.nombreDeContacts; i++)
		{
			result=result+"contact"+String.valueOf(i)+"\n"+this.contacts[i].toString();
		}
		return result;
	}

}
