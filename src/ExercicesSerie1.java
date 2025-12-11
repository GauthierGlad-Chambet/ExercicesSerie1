import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Package.Enseignant;
import Package.Etudiant;
import Package.Filiere;
import Package.Specialite;

public class ExercicesSerie1 {

    private static Scanner scanner = new Scanner(System.in);

    public static void exercicesSerie1() {

        Specialite javaEE = new Specialite("JAVA/JEE");
        Specialite htmlCss = new Specialite("HTML/CSS");
        Specialite gestionDeProjet = new Specialite("Gestion de projet");
        Specialite js = new Specialite("JS");
        Specialite php = new Specialite("PHP");

        Specialite[] specialites = {javaEE, htmlCss, gestionDeProjet, js, php};

        Enseignant jacques = new Enseignant("Jacques", "Lanoix", javaEE);
        Enseignant michel = new Enseignant("Michel", "Brunet", javaEE);
        Enseignant paul = new Enseignant("Paul",  "Kalkbrener", php);
        Enseignant karine = new Enseignant("Karine", "Lavendeuse", js);
        Enseignant edouard = new Enseignant("Edouard", "Grills", gestionDeProjet);

        Enseignant[] enseignants = {jacques, michel, paul, karine, edouard};

        Filiere cda = new Filiere("CDA", "01");
        Filiere marketing = new Filiere("Marketing", "02");
        Filiere assistanceDeVie = new Filiere("Assistance De Vie", "03");

        Filiere[] filieres = {cda, marketing, assistanceDeVie};

        Etudiant homer = new Etudiant("Simpson", "Homer", cda );
        Etudiant bart = new Etudiant("Simpson", "Bart", cda );
        Etudiant vanessa = new Etudiant("Vanessa", "Sultan", marketing );
        Etudiant marge = new Etudiant("Simpson", "Marge", marketing );
        Etudiant lisa = new Etudiant("Simpson", "Lisa", marketing );

        Etudiant[] etudiants = {homer, bart, vanessa, marge, lisa};

        jacques.setFiliere(cda, marketing);
        michel.setFiliere(marketing, assistanceDeVie);
        paul.setFiliere(cda);
        karine.setFiliere(marketing);
        edouard.setFiliere(cda);

        //Exercice 1 : Nombre Pair ou Impair
        // pairImpair();

        //Exercice 2 : Calcul de moyenne
        // moyenne();

        // Exercice 3 : afficher table de multiplication
        // multiplication();

        // Exercice 4 : devinette
        // devinette();

        //Exercice 5 : Tableau et calculs
        // tableauCalculs();

        // Exercice 6 : Comptage de voyelles
        // compterVoyelles();

        //POO - Exercice 1 : Affichage enseignant & specialite
        // afficherEnseignantsSpecialite(specialites, enseignants);

        //POO - Exercice 2 : Affichage étudiant et filière
        // afficherEtudiantFilieres(filieres, etudiants);

        //POO - Exercice 3 : afficher formation, nom formateur, élèves
        // afficherFormationFormateurEleve(filieres, etudiants, enseignants);

        //POO - Exercice 4 : Rechercher de personne par prénom ou filière
        // choixRecherche(enseignants, etudiants, filieres);
    }

    //Exercice 1 : Nombre Pair ou Impair
    public static void pairImpair() {
        System.out.println("Entrez un nombre : ");
        int nombre = scanner.nextInt();
        System.out.println(nombre%2==0?"le nombre est pair":"le nombre est impair");
    }

    //Exercice 2 : Calcul de moyenne
    public static void moyenne() {
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
        System.out.println("Combien de nombres voulez-vous saisir ?");
        int quantite = scanner.nextInt();
        double[] tableau = new double[quantite];
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

    //POO - Exercice 1 : Affichage enseignant & specialite
    public static void afficherEnseignantsSpecialite(Specialite[] specialites, Enseignant[] enseignants) {
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
    }

    //POO - Exercice 2 : Affichage étudiant et filière
    public static void afficherEtudiantFilieres(Filiere[] filieres, Etudiant[] etudiants) {
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
    }

    //POO - Exercice 3 : afficher formation, nom formateur, élèves
    public static void afficherFormationFormateurEleve(Filiere[] filieres, Etudiant[] etudiants, Enseignant[] enseignants) {
        System.out.println("\nListe des apprenants par filière :");
        //pour chaque filiere
        for (Filiere filiere : filieres ) {
            boolean etuVide =  true;
            boolean formatVide =  true;
            boolean comaFlag = false;
            int nb = 1;

            System.out.println("\nFilière : " + filiere.getLibelle());
            System.out.println("Formateurs : ");
            //pour chaque enseignant
            for (Enseignant enseignant : enseignants) {

                //si le tableau filiere de l'enseignant n'est pas vide
                if (enseignant.getFiliere() != null) {

                    //pour chacune des filières de l'enseignant
                    for (Filiere filiereEns : enseignant.getFiliere()) {

                        //si la filière de l'enseignant correspond à la filiere en train d'etre parcourue (1ere boucle)
                        if (filiere == filiereEns) {
                            System.out.print(comaFlag ?", ":"");
                            comaFlag = true;

                            //on écrit le nom de l'enseignant
                            System.out.print(enseignant.getPrenom() + " " + enseignant.getNom());
                            formatVide = false;
                        }
                    }
                }
            }
            if (formatVide) {
                System.out.println("Pas encore de formateur");
            }
            System.out.println("");
            //pour chaque étudiant
            for (Etudiant etudiant : etudiants) {
                //si la filière de l'étudiant correspond à la filiere en train d'etre parcourue (1ere boucle)
                if (filiere == etudiant.getFiliere()) {
                    //on écrit le nom de l'étudiant
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

    //POO - Exercice 4 : Rechercher de personne par prénom ou filière
    public static void choixRecherche(Enseignant[] enseignants, Etudiant[] etudiants, Filiere[] filieres) {
        System.out.println("Comment voulez-vous rechercher ?");
        System.out.println("1 - Enseignant");
        System.out.println("2 - Filière");
        String choix = scanner.nextLine();
        if (choix.equalsIgnoreCase("1") || choix.toLowerCase().contains("enseignant")) {
            rechercherEnseignant(enseignants, etudiants);
        } else if (choix.equalsIgnoreCase("2") || choix.toLowerCase().contains("filière") || choix.toLowerCase().contains("filiere")) {
            rechercherFiliere(enseignants, etudiants, filieres);
        } else {
            System.out.println("Saisie erronée");
            choixRecherche(enseignants, etudiants, filieres);
        }
    }

    public static void rechercherEnseignant(Enseignant[] enseignants, Etudiant[] etudiants) {
        // Recherche par enseignant
        System.out.println("Saisissez un prénom :");
        String prenom = scanner.nextLine();
        Enseignant enseignantTrouve = null;
        ArrayList<Etudiant> etudiantFiliere = new ArrayList<>();
        for (Enseignant enseignant : enseignants) {
            if (enseignant.getPrenom().toLowerCase().contains(prenom.toLowerCase())) {
                enseignantTrouve = enseignant;
                break;
            }
        }
        // Si on trouve un enseignant
        if (enseignantTrouve != null){
            // Si l'enseignant possède au moins une filière
            if (enseignantTrouve.getFiliere() != null) {
                // Pour chaque filière que possède l'enseignant
                for (Filiere filiereEns : enseignantTrouve.getFiliere()) {
                    etudiantFiliere.clear();
                    // pour chaque étudiant
                    for (Etudiant etudiant : etudiants) {
                        // Si la filière possède au moins un étudiant et si la filière de l'étudiant correspond à la filiere en train d'etre parcourue (1ere boucle)
                        if (etudiant.getFiliere() != null && filiereEns == etudiant.getFiliere()){
                            //on écrit le nom de l'étudiant
                            etudiantFiliere.add(etudiant);
                        }
                    }
                    if (!etudiantFiliere.isEmpty()) {
                        System.out.println("\n" + enseignantTrouve.getPrenom() + " anime la formation " + filiereEns.getLibelle() + " avec " + etudiantFiliere.size() + " apprenants.");
                        for (Etudiant etudiant : etudiantFiliere) {
                            System.out.println((etudiantFiliere.indexOf(etudiant)+1) + "- " + etudiant.getPrenom() + " " + etudiant.getNom());
                        }
                    } else {
                        System.out.println("Pas d'inscrit");
                    }
                }
            } else {
                System.out.println(enseignantTrouve.getPrenom() + " n'anime aucune formation.");
            }
        } else {
            System.out.println("Aucun enseignant ne porte ce prénom.");
        }
    }

    public static void rechercherFiliere(Enseignant[] enseignants, Etudiant[] etudiants, Filiere[] filieres) {
        System.out.println("Saisissez une filière :");
        String filiereEtu = scanner.nextLine();
        Filiere filiereTrouve = null;
        ArrayList<Etudiant> etudiantFiliere = new ArrayList<>();
        ArrayList<Enseignant> enseignantsFiliere = new ArrayList<>();


        // Recherche par nom de filière
        for (Filiere filiere : filieres) {
            if (filiere.getLibelle().toLowerCase().contains(filiereEtu.toLowerCase())) {
                filiereTrouve = filiere;
                break;
            }
        }


        // Recupération des enseignants qui ont cette filière
        // Si on trouve une filière
        if (filiereTrouve != null){
            // Pour chaque enseignant
            for (Enseignant enseignant : enseignants) {
                //enseignantsFiliere.clear();
                // Pour chaque filière de chaque enseignant
                if (enseignant.getFiliere() != null) {
                    for (Filiere filiereEns : enseignant.getFiliere()) {
                        // Si les filières matchent
                        if (filiereEns == filiereTrouve) {
                            enseignantsFiliere.add(enseignant);
                        }
                    }
                }
            }
        }

        // récupération des étudiants qui ont cette filière
        if (filiereTrouve != null){
            for (Etudiant etudiant : etudiants) {
                if (etudiant.getFiliere() != null ) {
                    if(etudiant.getFiliere() == filiereTrouve) {
                        etudiantFiliere.add(etudiant);
                    }
                }
            }
        }
        if (filiereTrouve != null) {
            System.out.print(filiereTrouve.getLibelle() + " est animé par ");
            switch (enseignantsFiliere.size()) {
                case 0:
                    System.out.print("aucun enseignant");
                    break;
                case 1:
                    for (Enseignant enseignant : enseignantsFiliere) {
                        System.out.print(enseignant.getPrenom() + " " + enseignant.getNom());
                    }
                    break;
                default:
                    StringBuilder strEnseignants = new StringBuilder();
                    for (int i = 0 ; i < enseignantsFiliere.size() ; i++) {
                        strEnseignants.append(i == (enseignantsFiliere.size() - 1) ? " et " : (i != 0 ? ", " : "")).append(enseignantsFiliere.get(i).getPrenom()).append(" ").append(enseignantsFiliere.get(i).getNom());
                    }
                    System.out.print(strEnseignants);
            }
            System.out.println(" avec " + etudiantFiliere.size() + " apprenants.");
            for (Etudiant etudiant : etudiantFiliere) {
                System.out.println((etudiantFiliere.indexOf(etudiant)+1) + "- " + etudiant.getPrenom() + " " + etudiant.getNom());
            }
        } else {
            System.out.println("Aucune filière ne porte ce nom.");
        }
    }
}
