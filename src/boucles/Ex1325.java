package boucles;

import java.util.Scanner;

/*      Ecrire un algorithme qui demande successivement 10 nombres à l’utilisateur,
        et qui lui dise ensuite quel était le plus grand parmi ces 20 nombres :
        Entrez le nombre numéro 1 : 12
        Entrez le nombre numéro 2 : 14
        etc.
        Entrez le nombre numéro 10 : 6
        Le plus grand de ces nombres est  : 14 */
public class Ex1325 {
    public static void main(String[] args) {
        int maxValue = 0;
        int inputNumber = 0;

        System.out.println("Nous vous demandons de saisir 10 nombres");
        for (int i = 1; i <= 10; i++) {

            // number ne sert que dans la boucle; je l'initialise ici:
            int number = 0;

            System.out.println("Nombre " + i + " :");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            if (number > maxValue) {
                maxValue = number;
                inputNumber = i;
            }
        }
        System.out.println("L'entrée n° " + inputNumber + " dont la valeur est " +
                maxValue + " fut la plus élevée de votre saisie.");
    }
}
