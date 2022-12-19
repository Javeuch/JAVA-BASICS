package wayToLearnX.ArrayListPartie2;

import java.util.ArrayList;

/*      Réécrivez le code suivant afin qu’il remplisse les valeurs de l’ArrayList
        avec les éléments du tableau à l’aide d’une boucle for-each au lieu d’une boucle for.*/
//TODO Boucle for each | Java https://waytolearnx.com/2020/05/boucle-for-each-java.html
public class Ex9 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<Integer>();

        int[] nbrs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Boucle for-each
        for (int nbr : nbrs) {  // Attention type same as table "int"
            liste.add(nbr);
        }
        System.out.println("liste: " + liste);
    }
}
