package wayToLearnX.ArrayListPartie2;

import java.util.ArrayList;
import java.util.Collections;

/*      Écrivez un programme Java pour mélanger les éléments d’un ArrayList.
        Sortie prévue:
        Liste avant de mélanger: [PHP, Java, C++, Python]
        Liste après mélange: [Python, Java, PHP, C++] */
public class Ex5 {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("PHP");
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");

        System.out.println("Before shuffling Arraylist: " + languages);
        Collections.shuffle(languages);
        System.out.println("After shuffling Arraylist: " + languages);
    }

}
