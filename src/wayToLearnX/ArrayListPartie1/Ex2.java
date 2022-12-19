package wayToLearnX.ArrayListPartie1;

import java.util.ArrayList;

/*      Écrivez un programme Java pour parcourir tous les éléments d’un ArrayList, en utilisant la boucle for.
        Exemple:
        [PHP, Java, C++, Python]
        Sortie prévue:
        PHP
        Java
        C++
        Python  */
public class Ex2 {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("PHP");
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");
        for (String language : languages){
            System.out.println(language);
        }
    }
}
