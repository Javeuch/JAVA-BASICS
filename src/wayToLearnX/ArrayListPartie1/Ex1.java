package wayToLearnX.ArrayListPartie1;

import java.util.ArrayList;
import java.util.Collection;

/*      Écrivez un programme Java pour créer un ArrayList nommé «languages»,
        ajoutez des chaîne(Ex: PHP, Java, C++, Python) et affichez la collection.
        Sortie prévue:
        [PHP, Java, C++, Python] */
public class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("PHP");
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");
        System.out.println(languages);
    }
}
