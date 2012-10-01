
/**
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 *contient les contacts de l'utilisateur
 */
public class Repertoire {
	/**
	 * nom du repertoire
	 */
	public String nom;
	/**
	 * tableau de contactes
	 */
	public Contact[] contactes;
	/**
	 * nombre de contacte
	 */
	public int nbcont;
	
	/**
	 * @param nomrep
	 */
	public Repertoire(String nomrep)
	{
		this.nom=nomrep;
		this.nbcont=0;
		
	}
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
		while((i<this.nbcont)&((this.contactes[i].nom).compareTo(nom)<0))
		{
			i=i+1;
			
		}
		if (i==this.nbcont)
		{
			this.contactes[i].nom=nom;
			this.contactes[i].adrmac=adrmac;
		}
		else
		{
			if((this.contactes[i].nom).compareTo(nom)==0)
			{
				System.out.println("Il y a déjà un contact de ce nom.");
			}
			
			else
			{
				cont1=this.contactes[i];
				this.contactes[i].nom=nom;
				this.contactes[i].adrmac=adrmac;
				i=i+1;
	
				while(i<=this.nbcont)
				{
					cont2=this.contactes[i];
					this.contactes[i]=cont1;
					cont1=cont2;
					i=i+1;
	
					
				}
			}		
		}
			
	}
	
	/**
	 * @param nom
	 * @return l'adresse mac correspondant au nom
	 */
	public String RechercheAdrContact(String nom)
	{
		int i=0;
		while((i<=this.nbcont)&((this.contactes[i].nom).compareTo(nom)!=0))
		{
			i=i+1;
		}
		if(i>this.nbcont)
		{
			System.out.println("Ce contact n'existe pas.");
		}
		else
		{
			return this.contactes[i].adrmac;
		}
		return "00:00:00:00:00:00";
		
	}
	
	/**
	 * @param adrmac
	 * @return le nom associe a l'adresse mac
	 */
	public String RechercheNomContact(String adrmac)
	{
		int i=0;
		while((i<=this.nbcont)&((this.contactes[i].adrmac).compareTo(adrmac)!=0))
		{
			i=i+1;
		}
		if(i>this.nbcont)
		{
			System.out.println("Cette adresse mac est introuvable.");
		}
		else
		{
			return this.contactes[i].nom;
		}
		return "Paul";
		
	}
	
	/**
	 * @param nom
	 * supprime le contact de nom nom
	 */
	public void SupprimeContact(String nom)
	{
		int i=0;
		while((i<=this.nbcont)&((this.contactes[i].nom).compareTo(nom)!=0))
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
				this.contactes[i]=this.contactes[i+1];
				i=i+1;
			}
			this.nbcont=this.nbcont-1;
		}
			
	}
	
	/**
	 * @param nom du contact a modifier
	 * @param adrmac nouvelle adrmac du contact
	 */
	public void ModifieAdrContact(String nom,String adrmac)
	{
		int i=0;
		while((i<=this.nbcont)&((this.contactes[i].nom).compareTo(nom)!=0))
		{
			i=i+1;
		}
		if(i>this.nbcont)
		{
			System.out.println("Ce contact n'existe pas.");
		}
		else
		{
			this.contactes[i].adrmac=adrmac;
		}
			
	}

}
