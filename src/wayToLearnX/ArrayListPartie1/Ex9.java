package wayToLearnX.ArrayListPartie1;

import java.util.ArrayList;

/*      Écrivez un programme Java pour rechercher un élément dans un ArrayList Ex: [PHP, Java, C++, Python].
        Exemple:
        Java
        Sortie prévue:
        L’élément existe dans la liste  */
public class Ex9 {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("PHP");
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");
        // Méthode containd() - Sensible à la casse !
        boolean b = languages.contains("Java"); // Java true; java false!
        if (b) {
            System.out.println("L’élément existe dans la liste");
        } else {
            System.out.println("L’élément n'existe pas dans la liste");
        }
    }
}
