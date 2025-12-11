package Package;

import Interface.Motorise;

public class Voiture extends Vehicule implements Motorise {


    public Voiture(String modele, String marque) {
        super(modele, marque);
    }

    @Override
    public void seNommer() {
        System.out.println("Bonjour, je suis une " + this.getClass().getSimpleName().toLowerCase() + " " + this.getModele() + ", de la marque " + this.getMarque() + "." );
    }

    @Override
    public void seDeplacer() {
        System.out.println("Je roule grâce à mon moteur et mes quatre roues.");
    }

    @Override
    public void faireLePlein() {
        System.out.println("je fais le plein de carburant.");
    }
}
