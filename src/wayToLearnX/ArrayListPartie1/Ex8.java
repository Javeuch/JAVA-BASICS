package wayToLearnX.ArrayListPartie1;

/*      Corrigez la classe suivante afin qu’elle soit compilée et que la méthode reverse renvoie un ArrayList
        contenant des entiers dans l’ordre inverse de la liste des paramètres ArrayList.
        Exemple:
        [1, 2, 3, 4, 5, 6, 7]
        Sortie prévue:
        [7, 6, 5, 4, 3, 2, 1]   */

import java.util.ArrayList;
import java.util.Collections;

public class Ex8 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<Integer>();

        int[] nbrs = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < nbrs.length; i++) {
            liste.add(nbrs[i]);
        }
        ArrayList<Integer> res = reverse(liste);
        System.out.println(liste);
        System.out.println(res);
/*      En utilisant l'interface Collections'
        Collections.reverse(liste);
        System.out.println(liste);  */
    }
    public static ArrayList reverse(ArrayList<Integer> liste) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (Integer i: liste) {
            res.add(0, i);  // l'index à 0 va introduire l'élément du tour suivant de la liste avant
                                  // 0, puis 1<-0, puis 2<-1<-0, puis 3<-2<-1<-0, ..., 7<-6<-5<-4<-3<-2<-1<-0
        }
        return res;
    }
}
