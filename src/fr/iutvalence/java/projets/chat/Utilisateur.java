package fr.iutvalence.java.projets.chat;
import java.net.*;
/**
 * class qui represente un utilisateur, il ce constitue d'un nom et d'un mot de passe
 * 
 * @author Tony (Tony-iut-valence <tony.chizat@iut-valence.fr>)
 */
public class Utilisateur
{
	/**
	 * constante de nom par defaut d'un repertoire
	 */
	final static String REPERTOIRE_PAR_DEFAUT = "repertoire par defaut";

	/**
	 * l'utilisateur
	 */
	private Contact utilisateur;

	/**
	 * code de l'utilisateur
	 */
	private String mdp;

	/**
	 * repertoire associé
	 */
	private RepertoireTableau rep;
	

	private DatagramSocket dataS;
	/**
	 * constructeur de la class utilisateur prenant en paramètre le nom et le mot de passe innitialise rep avec un
	 * nouveau repertoire de nom: REPERTOIRE_PAR_DEFAUT
	 * 
	 * @param nom
	 * @param mdp
	 * 
	 */
	public Utilisateur(String nom, String mdp)
	{
		try
		{
		this.dataS=new DatagramSocket();
		}
		catch(SocketException e)
		{
			
		}
		InetSocketAddress addr;
		this.utilisateur =new Contact(nom,null);
		this.mdp = mdp;
		try
		{
		addr=new InetSocketAddress(InetAddress.getLocalHost(),0);
		this.utilisateur.setSocketAddr(addr);
		}
		catch(UnknownHostException e)
		{
			System.out.println("erreur:l'adresse IP na pas pu être trouvé");
		}
		this.rep = new RepertoireTableau(REPERTOIRE_PAR_DEFAUT);
	}

	/**
	 * Redéfinition de la methode toString pour la class contact, conduit a un affichage du type: nom de l'utilisateur:
	 * (nomUtilisateur) Mot de passe: (mdp)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String result = "nom de l'utilisateur: " + this.getNomUtilisateur() + "\n";
		result = result + "Mot de passe: " + this.mdp + "\n";
		return result;
	}

	/**
	 * renvoi le nom de l'utilisateur courant
	 * 
	 * @return nomUtilisateur
	 */
	public String getNomUtilisateur()
	{
		return this.utilisateur.getNom();
	}

	/**
	 * renvoi le mot de passe de l'utilisateur courant
	 * 
	 * @return Mdp
	 */
	public String getMdp()
	{
		return this.mdp;
	}
	/**
	 * renvoi l'IP de l'utilisateur courant
	 * 
	 * @return adresseIP
	 */
	public InetSocketAddress getAdresseIP()
	{
		return this.utilisateur.getsocketAddr();
	}
	
	/**
	 * remplace l'IP de l'utilisateur courant par ip
	 * @param ip 
	 * 
	 */
	public void setAdresseIP(InetSocketAddress ip)
	{
		 this.utilisateur.setSocketAddr(ip);
	}
	/**
	 * renvoi le repertoire de l'utilisateur courant
	 * 
	 * @return le repertoire de l'utilisateur courant
	 */
	public RepertoireTableau getRepertoire()
	{
		return this.rep;
	}

	/**
	 * creation d'un nouveau repertoire vide de nom nomrep pour l'utilisateur courant
	 * 
	 * @param nomrep
	 * 
	 */
	public void creeRep(String nomrep)
	{
		this.rep = new RepertoireTableau(nomrep);
	}

	/**
	 * remplace le repertoire de l'utilisateur courant par le repertoire donné rep
	 * 
	 * @param rep
	 */
	public void changerRep(RepertoireTableau rep)
	{
		this.rep = rep;
	}

	/**
	 * remplace le mot de passe de l'utilisateur courant par la chaine donné mdp
	 * 
	 * @param mdp
	 */
	public void changerMotDePasse(String mdp)
	{
		this.mdp = mdp;
	}

	/**
	 * deux utilisateurs sont égaux si ils ont le même nom et le même mot de passe
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	// FIXME attention : il faut redéfinir également hashCode !
	// FIXME ne pas comparer les chaines avec == ou !=, ça ne marche pas !
	public boolean equals(Object o)
	{
		if (!(o instanceof Utilisateur))
			return false;
		if (((Utilisateur) o).getNomUtilisateur() != this.getNomUtilisateur())
			return false;
		if (((Utilisateur) o).getMdp() != this.getMdp())
			return false;
		return true;
	}

}