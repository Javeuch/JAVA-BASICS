package boucles;

import java.util.Scanner;

/*      Ecrire un algorithme qui demande un nombre de départ, et qui calcule sa factorielle.
        NB : la factorielle de 8, notée 8 !, vaut
        1 x 2 x 3 x 4 x 5 x 6 x 7 x 8 */
public class Ex1324 {
    public static void main(String[] args) {

        System.out.println("Entrez le nombre dont on recherche la factorielle:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factorielle = 1;

        for (int i = 2; i <= number; i++) {
            factorielle *= i;
        }
        System.out.println(number + "! = " + factorielle);
    }
}
