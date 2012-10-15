package fr.iutvalence.java.projets.chat;


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
	private String nomUtilisateur;
	
	/**
	 * code de l'utilisateur
	 */
	private String mdp;
	
	/**
	 * repertoire associe
	 */
	private Repertoire rep;
	
	
	// FIXME compléter le commentaire
	/**
	 * constructeur de la class utilisateur prenant en paramètre le nom et le mot de passe
	 * @param nom
	 * @param mdp
	 * 
	 */
	public Utilisateur(String nom,String mdp)
	{
		this.nomUtilisateur = nom;
		this.mdp = mdp;
		
		this.rep=new Repertoire(REPERTOIRE_PAR_DEFAUT);
	}



	
	
	/**
	 * @return renvoi le nom de l'utilisateur courant
	 */
	public String getNomUtilisateur()
	{
		return this.nomUtilisateur;
	}

	/**
	 * @return renvoi le mot de passe de l'utilisateur courant
	 */
	public String getMdp()
	{
		return this.mdp;
	}
	
	/**
	 * @return renvoi le repertoire de l'utilisateur courant
	 */
	public Repertoire getRepertoire()
	{
		return this.rep;
	}
	
	// FIXME compléter le commentaire
	/**
	 * creation d'un nouveau repertoire vide pour l'utilisateur courant
	 * @param nomrep
	 * 
	 */
	public void creeRep(String nomrep)
	{
		this.rep=new Repertoire(nomrep);
	}
	
	/**
	 * @param rep remplace le repertoire de l'utilisateur courant par rep
	 */
	public void changerRep(Repertoire rep)
	{
		this.rep=rep;
	}
	
	/**
	 * @param mdp remplace le mot de passe de l'utilisateur courant par mdp
	 */
	public void changerMotDePasse(String mdp)
	{
		this.mdp=mdp;
	}
	
}