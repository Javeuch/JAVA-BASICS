package wayToLearnX.ArrayListPartie2;

import java.util.ArrayList;
import java.util.Collections;

/*      Écrivez un programme Java pour inverser les éléments d’un ArrayList.
        Exemple:
        [PHP, Java, C++, Ada]
        Sortie prévue:
        Liste avant l’inversion: [PHP, Java, C++, Python]
        Liste après l’inversion: [Python, C++, Java, PHP]   */
public class Ex2 {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("PHP");
        languages.add("Java");
        languages.add("C++");
        languages.add("Ada");
        System.out.println("Liste avant le tri: ");
        System.out.println(languages);
        Collections.reverse(languages);
//        Autre méthode qui fonctionne
//        Collections.sort(languages);
        System.out.println("Liste après le tri:");
        System.out.println(languages);
    }
}
