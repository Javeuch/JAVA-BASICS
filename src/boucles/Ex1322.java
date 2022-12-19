package boucles;

import java.util.Scanner;

/*      Ecrire un algorithme qui demande un nombre de départ, et qui ensuite
        écrit la table de multiplication de ce nombre, présentée comme suit (cas
        où l'utilisateur entre le nombre 7) */
public class Ex1322 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le chiffre de la table de multiplication à afficher :");
        int number = sc.nextInt();
        System.out.println("Table de " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
