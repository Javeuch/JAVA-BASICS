package wayToLearnX.ArrayListPartie3;

import java.util.ArrayList;

/*      Terminez la méthode suivante addNegVal pour renvoyer la somme de tous les nombres négatifs dans l’ArrayList.
        Exemple:
        [1, -2, 3, -4, -5, 6, 7]
        Sortie prévue:
        -11 */
public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<Integer>();
        int[] nbrs = {1, -2, 3, -4, -5, 6, 7};
        // On remplit la liste avec le tableau (for-each)
        for (int nbr : nbrs) {
            liste.add(nbr);
        }
        System.out.println("Somme des nombres négatifs = " + addNegVal(liste));
    }

    private static int addNegVal(ArrayList<Integer> liste) {
        int sumNegVal = 0;
        for (int l : liste) {
            if (l < 0) {
                sumNegVal += l;
            }
        }
        return sumNegVal;
    }
}
