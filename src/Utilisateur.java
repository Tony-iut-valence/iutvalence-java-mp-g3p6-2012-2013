
/**
 * Represente l'utilisateur
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Utilisateur {
	
	// FIXME la valeur de l'attribut peut-elle changer une fois le message cr�� ?
	// FIXME r�fl�chir � la visibilit� de l'attribut
	/**
	 * nom de l'utilisateur
	 */
	public String nom;
	
	// FIXME la valeur de l'attribut peut-elle changer une fois le message cr�� ?
	// FIXME r�fl�chir � la visibilit� de l'attribut
	/**
	 * code de l'utilisateur
	 */
	public String mdp;
	
	// FIXME la valeur de l'attribut peut-elle changer une fois le message cr�� ?
	// FIXME r�fl�chir � la visibilit� de l'attribut
	/**
	 * repertoire associe
	 */
	public Repertoire rep;
	
	// FIXME compl�ter le commentaire
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

	// FIXME compl�ter le commentaire
	// FIXME respecter les conventions d'�criture
	/**
	 * @param nomrep cree un repertoire de nom nomrep
	 */
	public void CreeRep(String nomrep)
	{
		this.rep=new Repertoire(nomrep);
	}
	

}