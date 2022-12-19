package boucles;

import java.util.Scanner;

/*      Réécrire l’algorithme Ex1325, mais cette fois-ci on ne connaît pas d’avance
        combien l’utilisateur souhaite saisir de nombres.
        La saisie des nombres s’arrête lorsque l’utilisateur entre un zéro. */
public class Ex1326 {
    public static void main(String[] args){

        int maxValue = 0;
        int inputNumber = 0;
        int number = 0; // Je mets 0 car je fais une DO WHILE sinon mettre par ex -1
        int index = 0;
        System.out.println("Nous vous demandons de saisir des nombres, arretez quand bon vous semble en entrant 0");
        do{
            System.out.println("Nombre:");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            index++;
            if (number > maxValue) {
                maxValue = number;
                inputNumber = index;
            }
        }while(number != 0);
        System.out.println("L'entrée n° " + inputNumber + " dont la valeur est " +
                maxValue + " fut la plus élevée de votre saisie.");
    }
}
