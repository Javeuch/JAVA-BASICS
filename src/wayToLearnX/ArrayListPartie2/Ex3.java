package wayToLearnX.ArrayListPartie2;

/*      Corrigez la méthode suivante displayEvenIndex afin qu’elle affiche les entiers aux index pairs de la liste passée en argument.
        Sortie prévue: */

import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<Integer>();

        int[] nbrs = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < nbrs.length; i++) {
            liste.add(nbrs[i]);
        }
        displayEvenIndex(liste);
    }

    public static void displayEvenIndex(ArrayList liste) {

        for (int i = 0; i < liste.size(); i++) {
//            Ma version: attention à voir que liste[0] fait 1 et que les positions des nbs nég. est dans les i poirs
//            if (i % 2 != 0) {
//                System.out.print(liste.get(i - 1) + " ");
//            }
            if (i % 2 == 0) // indique les positions des nbs impairs
            {
                System.out.print(liste.get(i) + " ");
            }
        }
    }
}

