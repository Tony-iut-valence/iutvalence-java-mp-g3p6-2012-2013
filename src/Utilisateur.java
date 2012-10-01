
/**
 * Represente l'utilisateur
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Utilisateur {
	
	// FIXME la valeur de l'attribut peut-elle changer une fois le message créé ?
	// FIXME réfléchir à la visibilité de l'attribut
	/**
	 * nom de l'utilisateur
	 */
	public String nom;
	
	// FIXME la valeur de l'attribut peut-elle changer une fois le message créé ?
	// FIXME réfléchir à la visibilité de l'attribut
	/**
	 * code de l'utilisateur
	 */
	public String mdp;
	
	// FIXME la valeur de l'attribut peut-elle changer une fois le message créé ?
	// FIXME réfléchir à la visibilité de l'attribut
	/**
	 * repertoire associe
	 */
	public Repertoire rep;
	
	// FIXME compléter le commentaire
	/**
	 * @param nom
	 * @param mdp
	 */
	public Utilisateur(String nom,String mdp)
	{
		this.nom = nom;
		this.mdp = mdp;
		
		//FIXME constante
		this.rep.nom = "repertoire par defaut";
		this.rep.nbcont = 0;
	}

	// FIXME compléter le commentaire
	// FIXME respecter les conventions d'écriture
	/**
	 * @param nomrep cree un repertoire de nom nomrep
	 */
	public void CreeRep(String nomrep)
	{
		this.rep=new Repertoire(nomrep);
	}
	

}