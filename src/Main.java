package JSE.src;

import JSE.src.Personne;

import java.util.Random;
import java.util.Scanner;

public class Main {

    //Exercice 1 : Nombre Pair ou Impair
    public static void pairImpair() {
        System.out.println("Entrez un nombre : ");
        Scanner scanner = new Scanner(System.in);
        int nombre = scanner.nextInt();
        System.out.println(nombre%2==0?"le nombre est pair":"le nombre est impair");
    }

    //Exercice 2 : Calcul de moyenne
    public static void moyenne() {
        Scanner scanner = new Scanner(System.in);
        double somme = 0;
        System.out.println("Combien de notes ?");
        int indice = scanner.nextInt();
        for(int i=0; i < indice; i++ ) {
            System.out.println("Entrez une note : ");
            somme += scanner.nextDouble();
        }
        System.out.println("La moyenne est : " + somme/indice);
    }
    // Exercice 3 : afficher table de multiplication
    public static void multiplication() {
        Scanner scanner = new Scanner(System.in);

        //demander le nombre
        System.out.println("Entrez un entier");
        int nombre = scanner.nextInt();

        //afficher la table
        System.out.println("Table de : " + nombre);
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.println(nombre + "x" + i + "=" + nombre*i);
        }
    }

// Exercice 4 : devinette
    public static void devinette() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int nombreSecret = random.nextInt(1,100);
        int i = 101;

        //Question et demander proposition
        System.out.println("Devinez le nombre entre 0 et 100 !");
        while (i != nombreSecret) {
            System.out.println("Entrez votre proposition : ");
            i = scanner.nextInt();

            //condition de réponse
            if (i != nombreSecret) {
                System.out.println(i < nombreSecret ?"Trop petit !":"Trop grand !");
            } else {
                System.out.println("gg wp");
            }
        }
    }

    //Exercice 5 : Tableau et calculs
    public static void tableauCalculs() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Combien de nombres voulez-vous saisir ?");
        int quantite = scanner.nextInt();
        double tableau[] = new double[quantite];
        double somme = 0;

        //saisie des valeurs
        for (int i = 0; i < quantite ; i++) {
            System.out.println("Entrez le nombre "+ (i+1) );
            tableau[i] = scanner.nextDouble();
        }

        //parcours du tableau pour faire la somme
        for(int i=0; i < quantite ; i++ ) {
            somme += tableau[i];
        }

        //calcul de la moyenne
        double moyenne = somme/quantite;
        System.out.println("Somme : " + somme + " | " + "Moyenne : " + moyenne);
    }

    // Exercice 6 : Comptage de voyelles
    public static void compterVoyelles() {
        Scanner scanner = new Scanner(System.in);
        int compteur = 0;
        System.out.println("Entrez un texte : ");
        char[] phrase = scanner.nextLine().toLowerCase().toCharArray();
        for (char c : phrase) {
            if (       c == 'a'
                    || c == 'e'
                    || c == 'i'
                    || c == 'o'
                    || c == 'u'
                    || c == 'y') {
                compteur += 1;
            }
        }
        System.out.println(compteur);
    }

    public static void main(String[] args) {
      // pairImpair();
      // moyenne();
      // multiplication();
      // devinette();
      // tableauCalculs();
      // compterVoyelles();

        Personne gauthier = new Personne("Glad-Chambet", "Gauthier", 29);
        gauthier.direBonjour();

        System.out.println(gauthier.getNom());
    }


}

