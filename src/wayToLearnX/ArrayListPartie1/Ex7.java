package wayToLearnX.ArrayListPartie1;

import java.util.ArrayList;

/*      Écrivez un programme Java pour supprimer le troisième élément d’un ArrayList.
        Exemple:
        [PHP, Java, C++, Python]
        Sortie prévue:
        [PHP, Java, Python] */
public class Ex7 {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("PHP");
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");

        languages.remove(2);

        System.out.println(languages);
    }
}
