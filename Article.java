package TechStore;

public class Article {
/*	public enum Categorie {OrdinateurPortable, OrdinateurDeBureau, Tablettes, Stockage, 
		PeripheriquesEtAccessoires, Serveurs, Sacs_Scolaires, ComposantsInternes};*/	
	private static int nextId;//=0
	
	static {nextId=0;//setId(0);
	       }
	private int id;
	private String nom;
	private String reference;
	private double prix;
	//private Categorie categorieArticle;
	private long quantite;
	
	
	public Article(String nomArticle, double prixArticle,// Categorie categorieArticle, 
			       long quantiteArticle) {
		this.id=nextId++;
		this.nom = nomArticle;
		this.reference=genererReference(id, nomArticle);
		this.prix= prixArticle;
		//this.categorieArticle = categorieArticle;
		this.quantite = quantiteArticle;
	}
	
	public static String genererReference (int idArticle, String nomArticle )
	{
	    String referenceArticle="";
	    for (int i=0; i<nomArticle.length();i+=5)
	        if(nomArticle.charAt(i)!=' ')
	             referenceArticle+=nomArticle.charAt(i);
	    referenceArticle+=idArticle;
	    return referenceArticle;
	}
	
	
	public static int getNextId() {
		return nextId;
	}

	public static void setNextId(int nextId) {
		Article.nextId = nextId;
	}

	public int getId() {
		return this.id;
	}
	public void setId(int idArticle) {
		this.id = idArticle;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nomArticle) {
		this.nom = nomArticle;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String referenceArticle) {
		this.reference = referenceArticle;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prixArticle) {
		this.prix = prixArticle;
	}
	/*public Categorie getCategorie() {
		return categorieArticle;
	}
	public void setCategorie(Categorie categorieArticle) {
		this.categorieArticle = categorieArticle ;
	}*/

	public long getQuantite() {
		return quantite;
	}

	public void setQuantite(long quantiteArticle) {
		this.quantite = quantiteArticle;
	}
	public void incrementerQuantiteArticle(long quantiteArticle) {
		this.setQuantite(this.getQuantite()+quantiteArticle);

		
	}

	public void decrementerQuantiteArticle() {
		// TODO Auto-generated method stub
		assert(this.quantite>0): "Le stock est épuisé";
		this.setQuantite(this.getQuantite()-1);

	}
	
	public void decrementerQuantiteArticle(long quantiteArticle) {
		// TODO Auto-generated method stub
		assert(this.quantite>=quantiteArticle): "La quantité demandée dépasse le stock";
		this.setQuantite(this.getQuantite()-quantiteArticle);

	}

	public void modifierArticle(String nomArticle, double prixArticle//, Categorie categorieArticle
			, long quantiteArticle) {
		// TODO Auto-generated method stub
		  if(!nomArticle.equals(this.getNom()))
			  this.modifierArticle(nomArticle);
		  if(prixArticle!=this.getPrix())
	          this.modifierArticle(prixArticle);
		  if(quantiteArticle!=this.getQuantite())
	          this.modifierArticle(quantiteArticle);
		
	}
	public void modifierArticle(String nomArticle)
	{   
		this.setNom(nomArticle);
		String referenceArticle=genererReference(getId(), nomArticle);
		this.setReference(referenceArticle); 
		
	}
	public void modifierArticle(double prixArticle)
	{this.setPrix(prixArticle);}
	/*public void modifierArticle(String categorieArticle)
	{}*/
	public void modifierArticle(long quantiteArticle)
	{this.setQuantite(quantiteArticle);}
	
	@Override
	public String toString() {
		String articleDescription= getId()+ "  " +getReference() + "  " + getNom() + "  " + getPrix()+ "  " + getQuantite()+ "  ";
		return articleDescription;
	}
}
