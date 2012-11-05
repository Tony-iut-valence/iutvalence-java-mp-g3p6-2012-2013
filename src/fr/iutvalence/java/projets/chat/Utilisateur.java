package fr.iutvalence.java.projets.chat;

// FIXME(FIXED) d�tailler le commentaire
/**
 * class qui represente un utilisateur, il ce constitue d'un nom et d'un mot de passe
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
	
	
	// FIXME(FIXED) compl�ter le commentaire
	/**
	 * constructeur de la class utilisateur prenant en param�tre le nom et le mot de passe
	 * innitialise rep avec un nouveau repertoire de nom: REPERTOIRE_PAR_DEFAUT
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


	
		// FIXME(FIXED) �crire une application de test basique, cr�ant un utilisateur et l'affichant


	// FIXME(FIXED) compl�ter le commentaire
	/**
	 * Red�finition de la methode toString pour la class contact, conduit a un affichage du type:
	 * nom de l'utilisateur: (nomUtilisateur)
	 * Mot de passe: (mdp)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String result="nom de l'utilisateur: "+this.nomUtilisateur+"\n";
		result=result+"Mot de passe: "+this.mdp+"\n";
		return result;
	}
	
	// FIXME(FIXED) compl�ter le commentaire
	/**
	 * renvoi le nom de l'utilisateur courant
	 * @return nomUtilisateur
	 */
	public String getNomUtilisateur()
	{
		return this.nomUtilisateur;
	}

	// FIXME(FIXED) compl�ter le commentaire
	/**
	 * renvoi le mot de passe de l'utilisateur courant
	 * @return Mdp
	 */
	public String getMdp()
	{
		return this.mdp;
	}
	
	// FIXME(FIXED) compl�ter le commentaire
	/**
	 *  renvoi le repertoire de l'utilisateur courant
	 * @return rep
	 */
	public Repertoire getRepertoire()
	{
		return this.rep;
	}
	
	// FIXME(FIXED) compl�ter le commentaire
	/**
	 * creation d'un nouveau repertoire vide de nom nomrep pour l'utilisateur courant
	 * @param nomrep
	 * 
	 */
	public void creeRep(String nomrep)
	{
		this.rep=new Repertoire(nomrep);
	}
	
	// FIXME(FIXED) compl�ter le commentaire
	/**
	 * remplace le repertoire de l'utilisateur courant par le repertoire donn� rep
	 * @param rep 
	 */
	public void changerRep(Repertoire rep)
	{
		this.rep=rep;
	}
	
	// FIXME(FIXED) compl�ter le commentaire
	/**
	 * remplace le mot de passe de l'utilisateur courant par la chaine donn� mdp
	 * @param mdp 
	 */
	public void changerMotDePasse(String mdp)
	{
		this.mdp=mdp;
	}
	
}