package ex1td;

public class Livre {
    private String titre, auteur;
    private int nbPages;
    private double prix;
    private boolean prixFixe ;

    
    public Livre(String titre, String auteur, int nbPages) {
        this.titre = titre;
        this.auteur = auteur;
        
        if (nbPages > 20) {
            this.nbPages = nbPages;
        } else {
            System.out.println("Le nombre indiqué est faible. Le nombre de pages doit être supérieur à 20.");
            this.nbPages = 0; 
        }
    }
    public Livre(String titre, String auteur, int nbPages, double prix) {
        this.titre = titre;
        this.auteur = auteur;
     
        if (nbPages > 20) {
            this.nbPages = nbPages;
        } else {
            System.out.println("Le nombre indiqué est faible. Le nombre de pages doit être supérieur à 20.");
            this.nbPages = 0; 
        }
        this.prix = prix;
    }

  
    public Livre() {
        this.titre = "";
        this.auteur = "";
        this.nbPages = 0;
    }

    
    public Livre(String auteur, String titre) {
        this.auteur = auteur;
        this.titre = titre;
        this.nbPages = 0;
        this.prixFixe =false;
    }
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        if (nbPages > 20) {
            this.nbPages = nbPages;
        } else {
            System.out.println("Le nombre indiqué est faible. Le nombre de pages doit être supérieur à 20.");
        }
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        if (!prixFixe) {
            this.prix = prix;
            prixFixe = true; 
        } else {
            System.out.println("Le prix ne peut pas être modifié car il a déjà été fixé.");
        }
    }

    @Override
    public String toString() {
        String prixFixeStr = prixFixe ? "Prix fixé" : "Prix non fixé";
        return "Livre intitulé '" + titre + "' de l'auteur '" + auteur + "' avec " + nbPages + " pages. " + prixFixeStr;
    }
    public void decrire() {
        System.out.println(toString());
    }

    
    public boolean testPrix(Livre autreLivre) {
        return this.prix == autreLivre.prix;
    }
}
