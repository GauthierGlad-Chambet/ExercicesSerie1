package Package;

public class Velo extends Vehicule {

    public Velo(String modele, String marque) {
        super(modele, marque);
    }

    @Override
    public void seNommer() {
        System.out.println("Bonjour, je suis un " + this.getClass().getSimpleName().toLowerCase() + " " + this.getModele() + ", de la marque " + this.getMarque() + "." );
    }

    @Override
    public void seDeplacer() {
        System.out.println("Je roule grâce à l'énergie des molets et mes deux roues.");
    }
}
