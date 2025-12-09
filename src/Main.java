package JSE.src;

import JSE.src.Package.Enseignant;
import JSE.src.Package.Etudiant;
import JSE.src.Package.Filiere;
import JSE.src.Package.Specialite;

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

        // Création d'un objet test
        //Personne gauthier = new Personne("Glad-Chambet", "Gauthier", 29);
        //gauthier.direBonjour();
        //System.out.println(gauthier.getNom());


        //POO - Exercice 1 : Affichage enseignant & specialite

        Specialite javaEE = new Specialite("JAVA/JEE");
        Specialite htmlCss = new Specialite("HTML/CSS");
        Specialite gestionDeProjet = new Specialite("Gestion de projet");
        Specialite js = new Specialite("JS");
        Specialite php = new Specialite("PHP");

        Specialite[] specialites = {javaEE, htmlCss, gestionDeProjet, js, php};

        Enseignant enseignant1 = new Enseignant("Jacques", "Lanoix", javaEE);
        Enseignant enseignant2 = new Enseignant("Michel", "Brunet", javaEE);
        Enseignant enseignant3 = new Enseignant("Paul",  "Kalkbrener", php);
        Enseignant enseignant4 = new Enseignant("Karine", "Lavendeuse", js);
        Enseignant enseignant5 = new Enseignant("Edouard", "Grills", gestionDeProjet);

        Enseignant[] enseignants = {enseignant1, enseignant2, enseignant3, enseignant4, enseignant5};

        System.out.println("\nListe des enseignants par spécialité :");
        for (Specialite specialite : specialites) {
            boolean vide =  true;
            int nb = 1;
            System.out.println("\nSpécialité : " + specialite.getNom());
            for (Enseignant enseignant : enseignants) {
                if (specialite == enseignant.getSpecialite()) {
                    System.out.println(nb + "- " + enseignant.getPrenom() + " " + enseignant.getNom());
                    vide = false;
                    nb++;
                }
            }
            if (vide) {
                System.out.println("Aucun enseignant");
            }
        }

        //POO - Exercice 2 : Affichage étudiant et filière

        Filiere cda = new Filiere("CDA", "01");
        Filiere marketing = new Filiere("Marketing", "02");
        Filiere assistanceDeVie = new Filiere("Assistance De Vie", "03");

        Filiere[] filieres = {cda, marketing, assistanceDeVie};

        Etudiant etudiant1 = new Etudiant("Simpson", "Homer", cda );
        Etudiant etudiant2 = new Etudiant("Simpson", "Bart", cda );
        Etudiant etudiant3 = new Etudiant("Vanessa", "Sultan", marketing );
        Etudiant etudiant4 = new Etudiant("Simpson", "Marge", marketing );
        Etudiant etudiant5 = new Etudiant("Simpson", "Lisa", marketing );

        Etudiant[] etudiants = {etudiant1, etudiant2, etudiant3, etudiant4, etudiant5};

        System.out.println("\nListe des étudiants par filière :");
        for (Filiere filiere : filieres ) {
            boolean vide =  true;
            int nb = 1;
            System.out.println("\nFilière : " + filiere.getLibelle());
            for (Etudiant etudiant : etudiants) {
                if (filiere == etudiant.getFiliere()) {
                    System.out.println(nb + "- " + etudiant.getPrenom() + " " + etudiant.getNom());
                    vide = false;
                    nb++;
                }
            }
            if (vide) {
                System.out.println("Pas d'inscrit");
            }
        }

        //POO - Exercice 3 : afficher formation, nom formateur, élèves
        enseignant1.setFiliere(cda, marketing);
        enseignant2.setFiliere(marketing, assistanceDeVie);
        enseignant3.setFiliere(cda);
        enseignant4.setFiliere(marketing);
        enseignant5.setFiliere(cda);

        System.out.println("\nListe des apprenants par filière :");
        for (Filiere filiere : filieres ) {
            boolean etuVide =  true;
            boolean formatVide =  true;
            boolean comaFlag = false;
            int nb = 1;

            System.out.println("\nFilière : " + filiere.getLibelle());
            System.out.print("Formateurs : ");
            for (Enseignant enseignant : enseignants) {
                if (enseignant.getFiliere() != null) {
                    for (Filiere filiereEns : enseignant.getFiliere()) {
                        if (filiere == filiereEns) {
                            System.out.print(comaFlag ?", ":"");
                            comaFlag = true;
                            System.out.print(enseignant.getPrenom() + " " + enseignant.getNom());
                            formatVide = false;
                        }
                    }
                }
            }
            if (formatVide) {
                System.out.println("Pas d'inscrit");
            }
            System.out.println("");
            for (Etudiant etudiant : etudiants) {
                if (filiere == etudiant.getFiliere()) {
                    System.out.println(nb + "- " + etudiant.getPrenom() + " " + etudiant.getNom());
                    etuVide = false;
                    nb++;
                }
            }
            if (etuVide) {
                System.out.println("Pas d'inscrit");
            }
        }



    }
}

