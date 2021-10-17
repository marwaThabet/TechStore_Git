package TechStore;

public class Stockage extends Article{

	long capacite;
	
	
	public Stockage(String nomArticle, double prixArticle, long quantiteArticle,long capacite) {
		super(nomArticle, prixArticle, quantiteArticle);
		// TODO Auto-generated constructor stub
		this.capacite=capacite;
	}


	public long getCapacite() {
		return capacite;
	}


	public void setCapacite(long capacite) {
		this.capacite = capacite;
	}
	
	
}

