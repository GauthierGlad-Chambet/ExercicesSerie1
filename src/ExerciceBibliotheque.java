import java.util.ArrayList;
import java.util.Scanner;

import Package.Livre;

public class ExerciceBibliotheque {

    private static final Scanner scanner = new Scanner(System.in);
    private static ArrayList<Livre> listeLivre = new ArrayList<>();


    static void creerLivre() {
        System.out.println("Combien de livres allez-vous entrer ?");
        if (scanner.hasNextInt()) {
            int cpt = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0 ; i < cpt ; i++ ) {
                listeLivre.add(new Livre(scanner));
                System.out.println("Nouveau livre créé : \n Titre : " + listeLivre.get(i).getTitre() + "\n Auteur : " + listeLivre.get(i).getAuteur() + "\n Prix: " + listeLivre.get(i).getPrix() + "€.\n");
            }
        } else {
            System.out.println("Veuillez entrer un nombre entier.");
            scanner.nextLine();
            creerLivre();
        }
    }

    static void afficherAuteurs(ArrayList<Livre> listeLivre) {
        System.out.println("Liste des auteurs référencés :");
        for (Livre livre : listeLivre) {
            System.out.println("- "+livre.getAuteur()+"\n");
        }
    }

    static void afficherTotalPrix(ArrayList<Livre> listeLivre){
        double totalPrix = 0;
        System.out.println("Total des prix des livres :");
        for (Livre livre : listeLivre) {
            totalPrix += livre.getPrix();
        }
        System.out.println(totalPrix+"€ \n");
    }

    static void afficherBibliotheque(ArrayList<Livre> listeLivre){
        System.out.println("Liste des livres :");
        for (Livre livre : listeLivre) {
            System.out.println("Titre : " + livre.getTitre() + ", auteur: " + livre.getAuteur() + ", prix: " + livre.getPrix() + "€.\n");
        }
    }

    public static void exerciceBibliotheque() {
        String choix1 = "1 - Entrer de nouveaux livres.";
        String choix2 = "2 - Afficher toute la bibliothèque.";
        String choix3 = "3 - Afficher la liste des auteurs référencés.";
        String choix4 = "4 - Afficher le total du prix des livres.";
        System.out.println("Que souhaitez-vous faire ?");
        System.out.println(choix1);
        System.out.println(choix2);
        System.out.println(choix3);
        System.out.println(choix4);

        String choix = scanner.nextLine();

        if (choix1.toLowerCase().trim().contains(choix.toLowerCase().trim())) {
            creerLivre();
            exerciceBibliotheque();
        } else if (choix2.toLowerCase().trim().contains(choix.toLowerCase().trim())) {
            afficherBibliotheque(listeLivre);
            exerciceBibliotheque();
        } else if (choix3.toLowerCase().trim().contains(choix.toLowerCase().trim())){
            afficherAuteurs(listeLivre);
            exerciceBibliotheque();

        } else if (choix4.toLowerCase().trim().contains(choix.toLowerCase().trim())) {
            afficherTotalPrix(listeLivre);
            exerciceBibliotheque();
        } else {
            System.out.println("Choix incorrect.");
            exerciceBibliotheque();
        }
    }

}
