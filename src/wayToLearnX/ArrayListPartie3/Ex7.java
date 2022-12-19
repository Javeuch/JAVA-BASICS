package wayToLearnX.ArrayListPartie3;

import java.util.ArrayList;

/*      Écrivez un programme Java pour vider un ArrayList.
        Exemple:
        [A, B, C, D]
        Sortie prévue:
        []  */
//TODO La méthode removeAll() en Java – Les collections https://waytolearnx.com/2020/03/la-methode-removeall-en-java-les-collections.html
public class Ex7 {
    public static void main(String[] args) {
        ArrayList<Character> liste= new ArrayList<Character>();
        liste.add('A');
        liste.add('B');
        liste.add('C');
        liste.add('D');
        System.out.println("liste avant: " + liste);
        liste.removeAll(liste);
        System.out.println("liste après: " + liste);
    }
}
