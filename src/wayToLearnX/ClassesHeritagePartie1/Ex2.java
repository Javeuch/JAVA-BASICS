package wayToLearnX.ClassesHeritagePartie1;

import java.util.Scanner;

/*      Écrivez une classe « Somme » ayant deux variables « n1 » et « n2 » et une fonction membre « sum() »
        qui calcule la somme. Dans la méthode principale main demandez à l’utilisateur d’entrez deux entiers
        et passez-les au constructeur par défaut de la classe «Somme» et
        afficher le résultat de l’addition des deux nombres.    */
public class Ex2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Entrez un premier entier: ");
        int n1 = in.nextInt();
        System.out.println("Entrez un second entier: ");
        int n2 = in.nextInt();

        // Call default constructor
        Somme somme = new Somme(n1, n2);

        System.out.println("La somme = " + somme.sum());
    }

    public static class Somme {
        int n1, n2;

        // Default constructor
        Somme(int nb1, int nb2) {
            n1 = nb1;
            n2 = nb2;
            System.out.println("Les nombres sont initialisés.");
        }

        public int sum() {
            return n1 + n2;
        }
    }
}
