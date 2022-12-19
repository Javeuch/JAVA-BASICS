package tableaux;

import java.util.Arrays;
import java.util.Scanner;

/* http://cours.pise.info/algo/enonces6.htm#En6.6  */
public class Ex134_ {
    public static void main(String[] args) {

        /** Exercice 6.6 */
/*        int i;
        int[] Suite = new int[8];
        Suite[0] = 1;
        Suite[1] = 1;
        for (i = 2; i <= 7; i++) {
            Suite[i] = Suite[i - 1] + Suite[i - 2];
        }
        for (i = 0; i <= 7; i++) {
            System.out.println(Suite[i]);
        }*/

        /** Exercice 6.3 et 6.7*/
            /*TODO Ecrire un algorithme qui déclare un tableau de 9 notes,
            dont on fait ensuite saisir les valeurs par l’utilisateur.*/
           /*TODO Ecrivez la fin de l’algorithme 6.3 afin que le calcul de la
            moyenne des notes soit effectué et affiché à l’écran.*/
/*        int[] notes = new int[9];
        int i;
        int nbNotes = 0;
        int sumNotes = 0;
        Scanner sc = new Scanner(System.in);

        for ( i = 0; i <= 8; i++) {
            System.out.println("Entrez une note:");
            notes[i] = sc.nextInt();
            sumNotes +=  notes[i];
            nbNotes = i + 1;
        }
        System.out.println("Moyenne = " + sumNotes/nbNotes);*/

        /**Exercice 6.9*/

/*        int[] table = {11, 13, 17, 19, 23, 29};
        table = new int[]{11, 13, 17, 19, 23, 29};  //? Equivalent
        int sumValuesTable = 0;
        // somme des valeurs d’un tableau
        for (int i = 0; i < table.length; i++) {
            sumValuesTable += table[i];
        }
        System.out.println("somme des valeurs " + sumValuesTable);*/

        /**Exercice 6.10*/

        /*TODO Ecrivez un algorithme constituant un tableau, à partir de deux tableaux de même longueur préalablement saisis.
                Le nouveau tableau sera la somme des éléments des deux tableaux de départ.*/
/*        int[] table1 = {
                4, 8, 7, 9, 1, 5, 4, 6
        };
        int[] table2 = {
                7, 6, 5, 2, 1, 3, 7, 4
        };
        int[] tableSum = new int[8];
        for (int i = 0; i <= 7; i++) {
            tableSum[i] = table1[i] + table2[i];
            System.out.println(tableSum[i]);
        }*/

        int[] temperature = new int[3];  // -12 -5 -137
            temperature[0] = -12;
            temperature[1] = -5;
            temperature[2] = -137;

        Arrays.sort(temperature);
        for (int t : temperature) {
            System.out.print(t + " ");
        }
    }
}
