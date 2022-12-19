package wayToLearnX.ArrayListPartie1;

import java.util.ArrayList;

/*      Écrivez un programme Java pour insérer l’élément « Pascal » en première position dans l’ArrayList.
        Exemple:
        [PHP, Java, C++, Python]
        Sortie prévue:
        [Pascal, PHP, Java, C++, Python] */
public class Ex3 {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("PHP");
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");
        //  add(int indice, Object o)
        languages.add(0, "Pascal");
        System.out.println(languages);
    }
}
