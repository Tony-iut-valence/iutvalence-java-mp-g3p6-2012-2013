package fr.iutvalence.java.projets.chat;

// FIXME d�tailler le commentaire
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
	private final String nomUtilisateur;
	
	/**
	 * code de l'utilisateur
	 */
	private String mdp;
	
	/**
	 * repertoire associ�
	 */
	private Repertoire rep;
	
	
	// FIXME compl�ter le commentaire
	/**
	 * constructeur de la class utilisateur prenant en param�tre le nom et le mot de passe
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


	
		// FIXME �crire une application de test basique, cr�ant un utilisateur et l'affichant


	// FIXME compl�ter le commentaire
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String result="nom de l'utilisateur: "+this.nomUtilisateur+"\n";
		result=result+"Mot de passe: "+this.mdp+"\n";
		return result;
	}
	
	// FIXME compl�ter le commentaire
	/**
	 * @return renvoi le nom de l'utilisateur courant
	 */
	public String getNomUtilisateur()
	{
		return this.nomUtilisateur;
	}

	// FIXME compl�ter le commentaire
	/**
	 * @return renvoi le mot de passe de l'utilisateur courant
	 */
	public String getMdp()
	{
		return this.mdp;
	}
	
	// FIXME compl�ter le commentaire
	/**
	 * @return renvoi le repertoire de l'utilisateur courant
	 */
	public Repertoire getRepertoire()
	{
		return this.rep;
	}
	
	// FIXME compl�ter le commentaire
	/**
	 * creation d'un nouveau repertoire vide pour l'utilisateur courant
	 * @param nomrep
	 * 
	 */
	public void creeRep(String nomrep)
	{
		this.rep=new Repertoire(nomrep);
	}
	
	// FIXME compl�ter le commentaire
	/**
	 * @param rep remplace le repertoire de l'utilisateur courant par rep
	 */
	public void changerRep(Repertoire rep)
	{
		this.rep=rep;
	}
	
	// FIXME compl�ter le commentaire
	/**
	 * @param mdp remplace le mot de passe de l'utilisateur courant par mdp
	 */
	public void changerMotDePasse(String mdp)
	{
		this.mdp=mdp;
	}
	
}