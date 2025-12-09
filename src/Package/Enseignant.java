package JSE.src.Package;

public class Enseignant {
    private String nom;
    private Specialite specialite;

    public Enseignant(String nom, Specialite specialite) {
        this.nom = nom;
        this.specialite = specialite;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public String getNom () {
        return nom;
    }
}
