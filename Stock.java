package TechStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class SortbyPrice implements Comparator<Article> {
    // Used for sorting in ascending order of
    // roll number
    public int compare(Article a, Article b)
    {
        return (int)Math.ceil(a.getPrix() - b.getPrix());
        
    }
}
public class Stock {
ArrayList <Article> articleList;

public Stock() {
	this.articleList = new ArrayList <Article> ();
	
}

public Stock(ArrayList<Article> articleList) {
	this.articleList = articleList;
}

public Stock( ArrayList<String> nomList, ArrayList<Double> prixList, ArrayList<Long> quantiteList) {
	this();
	for(int i=0; i<nomList.size();i++)
		this.ajouterArticle(nomList.get(i), prixList.get(i), quantiteList.get(i)); 
}

public ArrayList<Article> getArticleList() {
	return articleList;
}

public void setArticleList(ArrayList<Article> articleList) {
	this.articleList = articleList;
}


public void ajouterArticle (String nomArticle, double prixArticle, /*Categorie categorieArticle, */long quantiteArticle){
	Article article=new Article(nomArticle, prixArticle, quantiteArticle/*, categorieArticle,*/);
	ajouterArticle (article);
}

public void ajouterArticle (Article article){
	Article articleOld=this.trouverArticle (article.getReference());	
	if (articleOld==null)
        this.getArticleList().add(article);
	else  {
		articleOld.incrementerQuantiteArticle(article.getQuantite());
	}
}


public Article trouverArticle (String referenceArticle){
	int i=0;
	while (i<this.getArticleList().size()&& 
	this.getArticleList().get(i).getReference()!=referenceArticle)
        i++;
	if(i<this.getArticleList().size())
	return getArticleList().get(i);
	else return null;
}

public void modifierArticle (String referenceArticle, String nomArticle, double prixArticle, /*Categorie categorieArticle,*/ long quantiteArticle){
    Article article=this.trouverArticle(referenceArticle);
    article.modifierArticle(nomArticle, prixArticle, /*categorieArticle,*/ quantiteArticle); 
}


public void supprimerArticle (String referenceArticle){
	Article article=this.trouverArticle (referenceArticle);	
	if (article!=null)
        this.getArticleList().remove(article);
}

public void decrementerQuantiteArticle (String referenceArticle){
	Article article=this.trouverArticle (referenceArticle);	
	if (article!=null)
        article.decrementerQuantiteArticle();
}
public void decrementerQuantiteArticle (String referenceArticle,  long quantiteArticle){
	Article article=this.trouverArticle (referenceArticle);	
	if (article!=null)
        article.decrementerQuantiteArticle(quantiteArticle);
}
public void incrementerQuantiteArticle (String referenceArticle, long quantiteArticle){
	Article article=this.trouverArticle (referenceArticle);	
	if (article!=null)
        article.incrementerQuantiteArticle(quantiteArticle);
}

public String toString() {
	String articleDescription= "";
	for(int i=0; i<articleList.size();i++)
		articleDescription+= getArticleList().get(i).toString()+ " \n ";
	return articleDescription;
}
public String toString(Article [] articleTable) {
	String articleDescription= "";
	for(int i=0; i<articleTable.length;i++)
		articleDescription+= articleTable[i].toString()+ " \n ";
	return articleDescription;
}

public Article []  filtrerPrix() {
	Article [] articleTable = new Article [articleList.size()];
	for(int i=0; i< articleList.size();i++)
	{articleTable[i] = articleList.get(i);
	}
	Arrays.sort(articleTable, new SortbyPrice());
	return (articleTable);
}

public void afficherCroissant() {
	Article [] articleTable = filtrerPrix();
	System.out.println(toString(articleTable));
}
public void afficherDecroissant() {
	Article [] articleTable = filtrerPrix();
	Arrays.sort(articleTable,  Collections.reverseOrder( new SortbyPrice()));
	System.out.println(toString(articleTable));
}
}