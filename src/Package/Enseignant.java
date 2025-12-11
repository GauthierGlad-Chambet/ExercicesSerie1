package Package;

public class Enseignant {
    private String nom;
    private String prenom;
    private Specialite specialite;
    private Filiere[] filieres;

    public Enseignant(String prenom, String nom, Specialite specialite) {
        this.prenom = prenom;
        this.nom = nom;
        this.specialite = specialite;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public Filiere[] getFiliere() {
        return filieres;
    }

    public void setFiliere (Filiere... filieres) {
        this.filieres = filieres;
    }

    public String getNom () {
        return nom;
    }

    public String getPrenom () {
        return prenom;
    }
}
