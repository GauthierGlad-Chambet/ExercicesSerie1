package JSE.src.Package;

public class Etudiant {
    private String nom;
    private String prenom;
    private Filiere filiere;



    public Etudiant(String nom, String prenom, Filiere filiere) {
        this.nom = nom;
        this.prenom = prenom;
        this.filiere = filiere;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public String getNom () {
        return nom;
    }

    public String getPrenom () {
        return prenom;
    }
}
