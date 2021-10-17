package TechStore;

public class Peripheriques extends Article{

	String technologieDeConnexion;  
	String interfaceAvecOrdinateur;
	
	public Peripheriques(String nomArticle, double prixArticle, long quantiteArticle, String technologieDeConnexion, 
	String interfaceAvecOrdinateur) {
		super(nomArticle, prixArticle, quantiteArticle);
		this.technologieDeConnexion=technologieDeConnexion;  
		this.interfaceAvecOrdinateur=interfaceAvecOrdinateur;
		// TODO Auto-generated constructor stub
	}

	public String getTechnologieDeConnexion() {
		return technologieDeConnexion;
	}

	public void setTechnologieDeConnexion(String technologieDeConnexion) {
		this.technologieDeConnexion = technologieDeConnexion;
	}

	public String getInterfaceAvecOrdinateur() {
		return interfaceAvecOrdinateur;
	}

	public void setInterfaceAvecOrdinateur(String interfaceAvecOrdinateur) {
		this.interfaceAvecOrdinateur = interfaceAvecOrdinateur;
	}
	
}
