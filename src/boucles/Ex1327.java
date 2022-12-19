package boucles;

import java.util.Scanner;

/*      Ecrire un algorithme qui demande un nombre de départ, et qui calcule la
        moyenne des entiers jusqu'à ce nombre. Par exemple si l'on tape 4 ,
        l’algorithme doit calculer: 1 + 2 + 3+ 4 = 10/4 =2.5    */
public class Ex1327 {
    public static void main(String[] args) {
        System.out.println("Entrez un nombre: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        float nbIntsUntilNumber = 0.0F;
        float avgIntsUntilNumber = 0.0F;
        float sumIntsUntilNumber = 0.0F;
        for (int i = 1; i <= number; i++) {
            sumIntsUntilNumber += i;
            nbIntsUntilNumber++;
        }
        avgIntsUntilNumber = sumIntsUntilNumber / nbIntsUntilNumber;
        System.out.println("La moyenne de la somme des entiers jusqu'à " + number + " est " + avgIntsUntilNumber);
    }
}
