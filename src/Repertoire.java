
/**
 * @author Tony
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
