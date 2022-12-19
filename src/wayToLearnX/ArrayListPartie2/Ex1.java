package wayToLearnX.ArrayListPartie2;

import java.util.ArrayList;
import java.util.Collections;

/*      Écrivez un programme Java pour trier un ArrayList donné.
        Exemple:
        [PHP, Java, C++, Ada]
        Sortie prévue:
        Liste avant le tri: [PHP, Java, C++, Ada]
        Liste après le tri: [Ada, C++, Java, PHP]   */
public class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("PHP");
        languages.add("Java");
        languages.add("C++");
        languages.add("Ada");
        System.out.println("Liste avant le tri: ");
        System.out.println(languages);
//        Autre méthode qui fonctionne
//        Collections.reverse(languages);
        Collections.sort(languages);
        System.out.println("Liste après le tri:");
        System.out.println(languages);
    }
}
