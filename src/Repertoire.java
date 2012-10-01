// FIXME d�tailler le commentaire
/**
 *  Contient les contacts de l'utilisateur
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Repertoire {
	
	// FIXME la valeur de l'attribut peut-elle changer une fois le message cr�� ?
	// FIXME r�fl�chir � la visibilit� de l'attribut
	/**
	 * nom du repertoire
	 */
	public String nom;
	
	
	/**
	 * tableau de contacts
	 */
	public Contact[] contacts;
	
	// FIXME renommer l'attribut
	// FIXME r�fl�chir � la visibilit� de l'attribut
	/**
	 * nombre de contacts
	 */
	public int nbcont;
	
	// FIXME compl�ter le commentaire
	/**
	 * @param nomrep
	 */
	public Repertoire(String nomrep)
	{
		this.nom=nomrep;
		this.nbcont=0;
		
		// FIXME initialiser tous les attributs
	}
	
	
	// FIXME compl�ter le commentaire
	// FIXME respecter les conventions d'�criture
	/**
	 * @param nom
	 * @param adrmac
	 * ajoute un contact dans le repertoire courant
	 */
	public void AjouterContact(String nom,String adrmac)
	{
		Contact cont1,cont2;
		int i=0;
		this.nbcont=this.nbcont+1;
		while((i<this.nbcont)&((this.contacts[i].nom).compareTo(nom)<0))
		{
			i=i+1;
			
		}
		if (i==this.nbcont)
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
	
				while(i<=this.nbcont)
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
	// FIXME respecter les conventions d'�criture
	
	/**
	 * @param nom
	 * @return l'adresse mac correspondant au nom
	 */
	public String RechercheAdrContact(String nom)
	{
		int i=0;
		while((i<=this.nbcont)&((this.contacts[i].nom).compareTo(nom)!=0))
		{
			i=i+1;
		}
		if(i>this.nbcont)
		{
			System.out.println("Ce contact n'existe pas.");
		}
		else
		{
			return this.contacts[i].adrmac;
		}
		
		// FIXME d�finir une constante
		// FIXME remplacer par une exception
		return "00:00:00:00:00:00";
		
	}
	
	// FIXME compl�ter le commentaire
	// FIXME respecter les conventions d'�criture
	/**
	 * @param adrmac
	 * @return le nom associe a l'adresse mac
	 */
	public String RechercheNomContact(String adrmac)
	{
		int i=0;
		while((i<=this.nbcont)&((this.contacts[i].adrmac).compareTo(adrmac)!=0))
		{
			i=i+1;
		}
		if(i>this.nbcont)
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
	// FIXME respecter les conventions d'�criture
	/**
	 * @param nom
	 * supprime le contact de nom nom
	 */
	public void SupprimeContact(String nom)
	{
		int i=0;
		while((i<=this.nbcont)&((this.contacts[i].nom).compareTo(nom)!=0))
		{
			i=i+1;
			
		}
		if (i>this.nbcont)
		{
			System.out.println("Ce contact n'existe pas introuvable.");

		}
		else
		{
			
			while(i<this.nbcont)
			{
				this.contacts[i]=this.contacts[i+1];
				i=i+1;
			}
			this.nbcont=this.nbcont-1;
		}
			
	}
	
	// FIXME compl�ter le commentaire
	// FIXME respecter les conventions d'�criture
	/**
	 * @param nom du contact a modifier
	 * @param adrmac nouvelle adrmac du contact
	 */
	public void ModifieAdrContact(String nom,String adrmac)
	{
		int i=0;
		while((i<=this.nbcont)&((this.contacts[i].nom).compareTo(nom)!=0))
		{
			i=i+1;
		}
		if(i>this.nbcont)
		{
			System.out.println("Ce contact n'existe pas.");
		}
		else
		{
			this.contacts[i].adrmac=adrmac;
		}
			
	}

}
