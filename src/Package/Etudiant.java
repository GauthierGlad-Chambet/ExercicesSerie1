package JSE.src.Package;

public class Etudiant {
    private String nom;
    private String prenom;
    private Filiere filiere;



    public Etudiant(String nom, Specialite specialite) {
        this.nom = nom;
        this.filiere = filiere;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public String getNom () {
        return nom;
    }
}
