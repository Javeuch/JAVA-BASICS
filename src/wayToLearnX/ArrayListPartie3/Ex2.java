package wayToLearnX.ArrayListPartie3;

import java.util.ArrayList;

/*Écrivez un programme Java pour réduire la capacité d’un ArrayList à la taille de la liste actuelle.*/
public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<Integer>(10);
        int[] nbrs = {1, -2, 3, -4, -5, 6, 7};
        // On remplit la liste avec le tableau (for-each)
        for (int nbr : nbrs) {
            liste.add(nbr);
        }
        liste.trimToSize();
        System.out.println("La nouvelle taille ajustée à la liste actuelle: " + liste.size());
    }
}
