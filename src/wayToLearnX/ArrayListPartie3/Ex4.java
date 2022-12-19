package wayToLearnX.ArrayListPartie3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*      Écrivez un programme Java pour permuter le 1er élément (index 0) avec le 3e élément (index 2) d’un ArrayList.
        Exemple:
        [PHP, Java, C++, Python]
        Sortie prévue:
        [C++, Java, PHP, Python]    */
//TODO La méthode swap() en Java – Les collections https://waytolearnx.com/2020/05/la-methode-swap-en-java-les-collections.html
public class Ex4 {
    public static void main(String[] args) {

        String[] languages = {"PHP", "Java", "C++", "Python"};
        ArrayList<String> listeIn = new ArrayList<String>(List.of(languages));

        // Personal version
/*        ArrayList<String> listeOut = new ArrayList<String>(4);
        listeOut.add(0, listeIn.get(2));
        listeOut.add(1, listeIn.get(1));
        listeOut.add(2, listeIn.get(0));
        listeOut.add(3, listeIn.get(3));
        System.out.println("listeIn avec les index 0 et permutés: " + listeOut);*/

        // WayToLearnX version
        Collections.swap(listeIn, 0, 2);    // swap: "échanger"
        System.out.println("listeIn avec les index 0 et permutés: " + listeIn);
    }
}
