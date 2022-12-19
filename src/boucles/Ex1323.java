package boucles;

import java.util.Scanner;

/*      Ecrire un algorithme qui demande un nombre de départ,
        et qui calcule la somme des entiers jusqu’à ce nombre.
        Par exemple, si l’on entre 5, le programme doit calculer :
        1 + 2 + 3 + 4 + 5 = 15 */
public class Ex1323 {
    public static void main(String[] args) {
        System.out.println("Entrez le nombre dont on recherche la somme des entiers pour y arriver:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sumOfIntegers = 0;
        for (int i= 0; i <= number; i++) {
            sumOfIntegers += i;
        }
        System.out.println("La somme des entiers de " + number + " est " + sumOfIntegers);
    }

}
