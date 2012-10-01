
/**
 * @author Tony
 *represente l'utilisateur
 */
public class Utilisateur {
	/**
	 * nom de l'utilisateur
	 */
	public String nom;
	/**
	 * code de l'utilisateur
	 */
	public String mdp;
	/**
	 * repertoire associe
	 */
	public Repertoire rep;
	

	/**
	 * @param nom
	 * @param mdp
	 */
	public Utilisateur(String nom,String mdp)
	{
		this.nom = nom;
		this.mdp = mdp;
		this.rep.nom = "repertoire par defaut";
		this.rep.nbcont = 0;
	}
	
	

}