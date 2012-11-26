package fr.iutvalence.java.projets.chat;

/**
 * @author chizatto
 *
 */
public class Annuaire implements InterfaceAnnuaire
{
	private final static int UTILISATEUR_MAXIMUM = 200;
	private Utilisateur[] utilisateurs;
	private int nombreUtilisateur;
	
	public AnnuaireTableau()
	{
		this.nombreUtilisateur=0;
		this.utilisateurs= new Utilisateur[UTILISATEUR_MAXIMUM];
	}
	
	
	/**
	 * @return le nombre d'utilisateurs du repertoire
	 * 
	 * @return le nombre d'utilisateurs du repertoire
	 */
	public int getNombreUtilisateurs()
	{
		return this.nombreUtilisateur;
	}
	/**
	 * supprime le contact de nom nom tout en conservant l'ordre renvoi une exceptionsi le contact n'est pas trouvé
	 * 
	 * @param nom
	 * @throws NomIncorrectException
	 * 
	 */
	public boolean supprimeUtilisateur(String nom)
	{
		int i=0;
		while((i<this.nombreUtilisateur)&&(this.utilisateurs[i].getNomUtilisateur()!=nom))
		{
			i++;
		}
		if(i<this.nombreUtilisateur)
			return false;
		while(i<this.nombreUtilisateur)
		{
			this.utilisateurs[i]=this.utilisateurs[i+1];
			i=i+1;
		}
		this.nombreUtilisateur=this.nombreUtilisateur-1;
	}
	/**
	 * recherche l'adresse correspondant au contact de nom nom renvoi null si le contact n'est pas trouvé
	 * 
	 * @param nom
	 * @return l'adresse IP correspondant au nom
	 * 
	 */
	public Utilisateur rechercheUtilisateurParNom(String nom)
	{
		int i=0;
		while((i<this.nombreUtilisateur)&&(this.utilisateurs[i].getNomUtilisateur()!=nom))
		{
			i++;
		}
		if(i<this.nombreUtilisateur)
			return null;
		return this.utilisateurs[i];
	}
	/**
	 * recherche le nom du contact d'adresse adrIP renvoi null si l'adresse n'appartien pas au repertoire
	 * 
	 * @param adrIP
	 * @return le nom associe a l'adresse IP
	 * 
	 */
	public Utilisateur rechercheUtilisateurParAdresse(String adrIP)
	{
		
	}
	
	
	/**
	 * ajoute en conservant l'ordre un contact dans le repertoire courant a partir du nom et de l'adresse IP peut
	 * renvoyer une erreur en cas de saisie incorrect
	 * 
	 * @param nom
	 * @param adrIP
	 * @throws NomIncorrectException
	 * 
	 */
	public void ajouterUtilisateur(String nom, String adrIP) throws NomIncorrectException,CapaciteDepasseeException
	{
		
	}
	/**
	 * Obtenir le contact de position i renvoi une erreur si la position est supérieur au nombre de contact
	 * 
	 * @param i  
	 * @return le contact de position i
	 * @throws PositionIncorrecteExeption   
	 */
	public Utilisateur getUtilisateur(int i)throws PositionIncorrecteExeption
	{
		
	}
	
}
