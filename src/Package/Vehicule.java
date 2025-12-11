package Package;

public abstract class Vehicule {
    protected String modele;
    protected String marque;

    protected Vehicule(String modele, String marque) {
        this.marque = marque;
        this.modele = modele;
    }

    protected String getModele() {
        return modele;
    }

    protected void setModele(String modele) {
       this.modele = modele;
    }

    protected String getMarque() {
        return marque;
    }

    protected void setMarque(String marque) {
        this.marque = marque;
    }

    protected abstract  void seNommer();
    protected abstract void seDeplacer();
}
