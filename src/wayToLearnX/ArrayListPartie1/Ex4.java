package wayToLearnX.ArrayListPartie1;

import java.util.ArrayList;

/*      Écrivez un programme Java pour récupérer le troisième élément à partir d’un ArrayList.
        Exemple:
        [PHP, Java, C++, Python]
        Sortie prévue:
        Le troisième élément: C++   */
public class Ex4 {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("PHP");
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");

        System.out.println(languages.get(2));
    }
}
