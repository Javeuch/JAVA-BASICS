package wayToLearnX.javaPartie3;

import java.util.Scanner;

/*      Écrivez un programme qui lit un nombre en Pieds, le convertit en Mètres et affiche le résultat. Un Pied mesure 0,305 mètre.
        Exemple:
        Entrer la valeur en Pied: 15
        Sortie prévue:
        15.0 pied -> 4.575 mètres */
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une valeur en pieds: ");
        float pied = sc.nextFloat();
        float metre = pied * 0.305F;
        System.out.println(pied + " pieds -> " + metre + " mètres");
    }
}
