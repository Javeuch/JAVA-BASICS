package wayToLearnX.ArrayListPartie2;

/*      Corrigez la méthode suivante displayEvenElements afin qu’elle affiche tous les
        nombres entiers pairs qui figurent dans l’ArrayList transmise en argument.
        Exemple:
        Sortie prévue:
        {2, 4, 6, 8}*/

import java.util.*;

public class Ex6 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<Integer>();
        int[] nbrs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < nbrs.length; i++) {
            liste.add(nbrs[i]);
        }
        displayEvenElements(liste);
    }
    // Personal version
    public static void displayEvenElements(ArrayList<Integer> liste) {
        for (int i = 0; i < liste.size(); i++) {
            if ((liste.get(i) % 2) == 0) {
                System.out.print(liste.get(i) + " ");
            }
        }
    }
}

// WayToLearnX version
//    public static void displayEvenElements(ArrayList liste) {
//        for (int i = 0; i < liste.size(); i++) {
//            if ((int) liste.get(i) % 2 == 0) {  // transtyping (int) liste
//                System.out.print(liste.get(i) + " ");
//            }
//        }
//    }


