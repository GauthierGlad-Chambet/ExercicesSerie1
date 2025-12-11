package Package;

import java.util.*;

public class Livre {
    private String titre;
    private String auteur;
    private double prix;

    public Livre(Scanner scanner) {
        System.out.println("Titre du livre ?");
        this.titre = scanner.nextLine();
        System.out.println("Auteur du livre ?");
        this.auteur = scanner.nextLine();
        System.out.println("Prix du livre ?");
        //boolean prixOk = scanner.hasNextDouble();
        boolean prixOk = false;
        while (!prixOk) {
            if (scanner.hasNextDouble()) {
                this.prix = scanner.nextDouble();
                prixOk = true;
            } else {
                System.out.println("Veuillez entrer un nombre sous le format : xx,xx");
                System.out.println("Prix du livre ?");
            }
            scanner.nextLine();
        }
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }


}
