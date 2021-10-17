package TechStore;

import java.util.ArrayList;
import java.util.Scanner;

public class TechStore {
static boolean EstCeQueModifierChamp (String champ) {
	System.out.println ("Voulez changer "+ champ + " de l'article?");
    Scanner scanner= new Scanner(System.in);
	String decisionModification=scanner.next();
    if(decisionModification.equals("oui"))
    	return true;
    else return false;
}
public static void main (String [] args)
{


	    ArrayList<String> Nom = new ArrayList<String>();
	    ArrayList<Double> Prix = new ArrayList<Double>();
	    ArrayList<Long> Quantite = new ArrayList<Long>();

	    Nom.add("PC Portable Dell Vostro 3500");

	    Nom.add("Ecouteur JBL T125BT");

	    Nom.add("sMARTphone INFINIX Hot 10");

	    Nom.add("Smartphone NOKIA C1");

	    System.out.println(Nom);

	    Prix.add((double)1999);

	    Prix.add((double)129);

	    Prix.add((double)439);

	    Prix.add((double)9.900);

	    Prix.add((double)185);
	    Quantite.add((long) 5);
	    Quantite.add((long) 5);
	    Quantite.add((long) 5);
	    Quantite.add((long) 5);
		Stock stock = new Stock(Nom,Prix,Quantite);  
	    stock.affichageCroissant();
	    System.out.println("Soyez les bienvenus !!"); 
	    int choixUtilisateur;
       do {
        System.out.println("0: Gérant");
        System.out.println("1: Client");
        System.out.println("2: Quitter");

        Scanner scanner = new Scanner(System.in);
      
      
       do {
        choixUtilisateur= scanner.nextInt();
        if (choixUtilisateur==0)
           { 
           Administrateur gerant=new Administrateur();
           System.out.println("0: Ajouter un article");
           System.out.println("1: Ajouter exemplaires");
           System.out.println("2: Modifier un article");
           System.out.println("3: Supprimer un article");
           System.out.println("4: Consulter stock");
           System.out.println("5: Quitter");
	        int choixGerant;
	        do{     
	          System.out.println ("Veuillez choisir votre action:");
	          choixGerant = scanner.nextInt();
	          switch (choixGerant) {
	            case 0: 
	            	System.out.println ("Sélectionner la catégorie de l'article à ajouter:\n"
	            			+ "0: OrdinateurPortable\n"+ "1: OrdinateurDeBureau\n"+
	            			"2: Tablettes\n"+"3: Stockage\n"+
	            			"4: PeripheriquesEtAccessoires\n"+
	            			"5: Sacs_Scolaires\n"+"6: ComposantsInternes\n");
	                int choixCategorie = scanner.nextInt();
	                System.out.println ("Entrer le nom de l'article à ajouter:");
	                scanner.nextLine();
	                String choixNomArticle= scanner.nextLine();
	                System.out.println ("Entrer le prix de " + choixNomArticle);  
	                double choixPrixArticle= scanner.nextDouble();
	                System.out.println ("Entrer la quantité de" + choixNomArticle);  
	                Long choixQuantiteArticle= scanner.nextLong();
	                switch (choixCategorie) {
	                case 0:
		                gerant.ajouterArticle (stock,choixNomArticle, choixPrixArticle, choixQuantiteArticle);

	                case 1:
		                gerant.ajouterArticle (stock,choixNomArticle, choixPrixArticle, choixQuantiteArticle);

	                case 2:  
	                	 break;
	                case 3:  
	                	 break;
	                case 4: 
	                	 break;
	                case 5: 
	                	 break;
	                case 6:
	                	 break;
	                
	                }
	               // System.out.println("L'article:"+ choixNomArticle+ "est ajouté avec succès");
	                break;
	            case 1: 
	                System.out.println ("Entrer la référence de l'article dont le nombre d'exemplaires est à augmenter :");
	                String choixReferenceArticle1=   scanner.next();
	                System.out.println ("Entrer le nombre d'exemplaire à ajouter:");
	                long choixQuantiteArticle1=   scanner.nextLong();
	                gerant.ajouterArticle (stock,choixReferenceArticle1,choixQuantiteArticle1);
	              
	                break;
	            case 2: 
	                System.out.println ("Entrer la référence de l'article à modifier:");
	                String choixReferenceArticle2=   scanner.next();
	                Article articleAmodifier=stock.trouverArticle(choixNomArticle);
	                String choixNomArticle2=articleAmodifier.getNom();
	                if(EstCeQueModifierChamp ("le nom")	 )               
	                { System.out.println ("Entrer le nouveau nom de l'article:"); 
	                	scanner.nextLine();
	                	choixNomArticle2= scanner.nextLine();}
	               
	                double choixPrixArticle2=articleAmodifier.getPrix();
	                if(EstCeQueModifierChamp ("le prix")	 )               
                	{ System.out.println ("Entrer le nouveau prix de l'article:"); 
                	choixPrixArticle2= scanner.nextDouble();}
	                
	                long choixQuantiteArticle2=articleAmodifier.getQuantite();
	                if(EstCeQueModifierChamp ("la quantité")	 )               
                	{ System.out.println ("Entrer la nouvelle quantité de l'article:"); 
                	choixQuantiteArticle2= scanner.nextLong();}	            
	                gerant.modifierArticle (stock,choixReferenceArticle2, choixNomArticle2, choixPrixArticle2, choixQuantiteArticle2);
	                System.out.println ("L'article est modifié avec succès");   
	                break;
	           
	            case 3: 
	                System.out.println ("Entrer la référence de l'article à supprimer:");
	                String choixRefArticle= scanner.next();
	                gerant.supprimerArticle(stock,choixRefArticle);
	                System.out.println ("L'article de référence "+ 
	                choixRefArticle + " est supprimé avec succès");   
	                break;   
	                
	            case 4: 
	                gerant.afficherStock(stock);  
	                break; 
	            default:
	                System.out.println ("Cette action n'est pas autorisée, réessayer!");   
	        } } while (choixGerant!=5);
	   }
        else if (choixUtilisateur==1)
           {
           System.out.println("Bonjour cher/chère client(e)");
           Client client=new Client();
           //Client client2=new Client();
           int choixClient;
           do {
           System.out.println("0: Ajouter un article au panier");
           System.out.println("1: Consulter mon panier");
           System.out.println("2: Consulter les articles");
           System.out.println("3: Finaliser une commande");
           System.out.println("4: Quitter");
           //poursuivreAchat//ajouter au panier
           choixClient=scanner.nextInt();
           switch (choixClient) {
		   case 0: 
			
			break;
		   case 1: 
				
				break;
           case 2: 
               System.out.println ("0: Par odre croissant \n1: Par ordre décroissant");
               int choixFiltre= scanner.nextInt();
               if (choixFiltre==0)             
                   client.afficherStockCroissant(stock);
               else 
            	   client.afficherStockCroissant (stock);        
               break; 
           }}while (choixClient!=4);}

        else 
           System.out.println("Cette action n'est pas autorisée, réessayer!");
       } while (choixUtilisateur!=0&&choixUtilisateur!=1);
      }while (choixUtilisateur!=2);
		
	
}

	    

}
