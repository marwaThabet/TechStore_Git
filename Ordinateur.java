package TechStore;

public final class Ordinateur extends Article {

	double resoulutionEcran;
	String processeur;
	long ram;
	public Enum SysExploitation {FreeDos, Windows, Ubuntu, Android, IOS};
    			+ " - Système d'exploitation: FreeDos - Mémoire RAM: 4 Go - Disque dur: 1To"
			+ " - Carte graphique: NVIDIA GeForce MX330 
	
	
	public Ordinateur(String nomArticle, double prixArticle, long quantiteArticle) {
		super(nomArticle, prixArticle, quantiteArticle);
		// TODO Auto-generated constructor stub
	}

}
