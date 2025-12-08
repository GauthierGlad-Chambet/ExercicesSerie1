import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
        //double [] notes = new double[3];
        double somme = 0;
        int indice = 0;
        for(int i=0; i < 3; i++ ) {
            System.out.println("Entrez une note : ");
            Scanner scanner = new Scanner(System.in);
            somme += scanner.nextDouble();
            indice ++;
            //notes[i] = scanner.nextDouble();
        }
        System.out.println("La moyenne est : " + somme/indice);

    }

    public static void main(String[] args) {
      // pairImpair();
       moyenne();

    }
}