package wayToLearnX.ArrayListPartie3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*      Écrivez un programme Java pour concaténer deux listes.
        Exemple:
        [A, B] [C, D]
        Sortie prévue:
        [A, B, C, D]    */
public class Ex6 {
    public static void main(String[] args) {

        ArrayList<Character> liste1 = new ArrayList<Character>();
        liste1.add('A');
        liste1.add('B');
        System.out.println("liste1: " + liste1);
        ArrayList<Character> liste2 = new ArrayList<Character>();
        liste2.add('C');
        liste2.add('D');
        System.out.println("liste2: " + liste2);
        // méthode List.addAll()
        liste1.addAll(liste2);
        System.out.println("liste1 + liste2: " +liste1);
    }
}
