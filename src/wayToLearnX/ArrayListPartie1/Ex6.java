package wayToLearnX.ArrayListPartie1;

import java.util.ArrayList;

/*      Écrivez un programme Java pour mettre à jour le troisième élément de l’ArrayList par «COBOL».
        Exemple:
        [PHP, Java, C++, Python]
        Sortie prévue:
        [PHP, Java, COBOL, Python]  */
public class Ex6 {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("PHP");
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");
//        Ma version simpliste
//        languages.remove(2);
//        languages.add(2, "COBOL");
        languages.set(2, "COBOL");
        System.out.println(languages);
    }
}
