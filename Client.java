package TechStore;

import java.util.ArrayList;

public class Client extends Personne{
	
	public Client(ArrayList<Article> commannde) {
		super();
		this.commannde = commannde;
	}
	
	ArrayList<Article> commannde ;
	
	
	public ArrayList<Article> getCommannde() {
		return commannde;
	}

	public void setCommannde(ArrayList<Article> commannde) {
		this.commannde = commannde;
	}

	double genererFacture() {
		return 0;
	}
	
	

	void commander (Stock stock, String referenceArticle)
	{}
	
	void validerCommande (Stock stock)
	{}
	public int findArticleCommande (String referenceArticle){
		int i=0;
		while (i<this.getCommannde().size()&& 
		this.getCommannde().get(i).getReference()!=referenceArticle)
	        i++;
		if(i<this.getCommannde().size())
		return i;
		else return -1;
	}
	void modifierCommande (String referenceArticle)
	{int index=findArticleCommande(referenceArticle);
		commannde.remove(index);}
	
	void annulerCommande (String referenceArticle)
	{commannde.clear();}

	void afficherStockCroissant(Stock stock) 
	{
		stock.afficherCroissant();
	}

	void affichageStockDecroissant(Stock stock) 
	{
		stock.afficherDecroissant();
	}
}
