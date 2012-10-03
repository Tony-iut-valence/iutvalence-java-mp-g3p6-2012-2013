package fr.chat;


/**
 * Represente l'utilisateur
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Utilisateur {
	/**
	 * constante de nom par defaut d'un repertoire
	 */
	final static String REPERTOIRE_PAR_DEFAUT="repertoire par defaut";

	/**
	 * nom de l'utilisateur
	 */
	private String nom;
	
	/**
	 * code de l'utilisateur
	 */
	private String mdp;
	
	/**
	 * repertoire associe
	 */
	private Repertoire rep;
	
	/**
	 * @param nom
	 * @param mdp
	 * constructeur de la class utilisateur prenant en paramètre le nom et le mot de passe
	 */
	public Utilisateur(String nom,String mdp)
	{
		this.nom = nom;
		this.mdp = mdp;
		
		this.rep=new Repertoire(REPERTOIRE_PAR_DEFAUT);
	}


	/**
	 * @param nomrep
	 * creation d'un nouveau repertoire vide pour l'utilisateur courant
	 */
	public void creeRep(String nomrep)
	{
		this.rep=new Repertoire(nomrep);
	}
	

}