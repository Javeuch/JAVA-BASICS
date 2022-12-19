package boucles;

import java.util.Scanner;

/*      Réécrire l’algorithme précédant et qui demande un nombre de départ, et qui
        ensuite affiche les dix nombres suivants, en utilisant l’instruction POUR. Par
        exemple, si l'utilisateur entre le nombre 17, le programme affichera les
        nombres de 18 à 27. */
public class Ex1321 {
    public static void main(String[] args){
        System.out.println("Entrez un nombre : ");
        Scanner sc = new Scanner(System.in);
        int numberInput = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int nombre = numberInput + i;
            System.out.println(nombre);
        }
        sc.close();
    }
}
