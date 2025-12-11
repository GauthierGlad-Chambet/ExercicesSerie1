import Package.Voiture;
import Package.Velo;

public class ExerciceVehicule {
    static Voiture maVoiture = new Voiture("206", "Peugeot");
    static Velo monVelo = new Velo("RockRider", "Décathlon");
    public static void exerciceVehicule(){
        utiliserMaVoiture();
        utiliserMonVelo();
    }

    public static void presenterMonVelo() {
        monVelo.seNommer();
    }

    public static void deplacerMonVelo() {
        monVelo.seDeplacer();
    }

    public static void utiliserMonVelo() {
        presenterMonVelo();
        deplacerMonVelo();
    }

    public static void presenterMaVoiture() {
        maVoiture.seNommer();
    }

    public static void deplacerMaVoiture() {
        maVoiture.seDeplacer();
    }

    public static void faireLePleinDeMaVoiture() {
        maVoiture.faireLePlein();
    }

    public static void utiliserMaVoiture() {
        presenterMaVoiture();
        faireLePleinDeMaVoiture();
        deplacerMaVoiture();
    }
}
