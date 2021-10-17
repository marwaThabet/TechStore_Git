package TechStore;

public class Administrateur  extends Personne {

	
	
	
	
	void ajouterArticle(Stock stock, Article article) 
	{
		stock.ajouterArticle(article);

	}
	void ajouterArticle(Stock stock, String nomArticle, double prixArticle, long quantiteArticle) 
	{
		stock.ajouterArticle(nomArticle, prixArticle, quantiteArticle);
	}
	void ajouterArticle(Stock stock, String referenceArticle, long quantiteArticle) 
	{
		stock.incrementerQuantiteArticle(referenceArticle, quantiteArticle);
	}
	void modifierArticle(Stock stock, String referenceArticle, String nomArticle, double prixArticle, long quantiteArticle) 
	{
		stock.modifierArticle(referenceArticle, nomArticle, prixArticle, quantiteArticle);
	}	
	
	void supprimerArticle(Stock stock, String referenceArticle) 
	{
				stock.supprimerArticle(referenceArticle);
	}
	public void afficherStock(Stock stock) {
		System.out.println(stock.toString());
    }
	
}
