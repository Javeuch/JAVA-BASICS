
package boucles;

import java.util.Scanner;

/*      Ecrire un algorithme qui demande un
        nombre de départ, et qui ensuite affiche
        les dix nombres suivants. Par exemple, si
        l'utilisateur entre le nombre 17, le
        programme affichera les nombres de 18
        à 27.   */
public class Ex1312 {
    public static void main(String[] args) {
        System.out.println("Entrez un nombre : ");
        Scanner sc = new Scanner(System.in);
        int numberInput = sc.nextInt();
        int numberInputPluDix = numberInput + 10;
        while (numberInput < numberInputPluDix) {
            int i = 1;
            numberInput = numberInput + i;
            i++;
            System.out.println(numberInput);
        }
        sc.close();
    }
}



