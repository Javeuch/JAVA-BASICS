package wayToLearnX.ArrayListPartie2;

import java.util.ArrayList;
import java.util.List;

/*      Écrivez un programme Java pour extraire une partie d’un ArrayList.
        Exemple:
        [1, 2, 3, 4, 5, 6, 7, 8, 9]
        Sortie prévue:
        [4, 5, 6]   */
//TODO Obtenir une sublist de ArrayList en Java https://www.codeurjava.com/2015/08/obtenir-une-sublist-de-arraylist-en-java.html
//TODO List subList(int fromIndex, int toIndex)
public class Ex7 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<Integer>();
        int[] nbrs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < nbrs.length; i++) {
            liste.add(nbrs[i]);
        }
        List<Integer> sousListe = liste.subList(3, 6);  //! 3 <= index < 6 (ATTENTION pour out: 4,5,6)
        System.out.println("Liste: " + liste);
        System.out.println("Sous-liste: " + sousListe);
    }
}
