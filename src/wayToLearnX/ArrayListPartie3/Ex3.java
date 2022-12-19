package wayToLearnX.ArrayListPartie3;

import java.util.ArrayList;
import java.util.List;

/*      Écrivez un programme Java pour comparer deux ArrayList. Affiche TRUE si il existe dans la première liste sinon FALSE
        Exemple:
        ArrayList 1 : [PHP, Java, C++, Python]
        ArrayList 2 : [PHP, Java, C, Python]
        Sortie prévue:
        [TRUE, TRUE, FALSE, TRUE]   */
//TODO Comparer deux ArrayList en utilisant la méthode contains() https://www.codeurjava.com/2015/09/comparer-deux-arraylist-en-java.html
public class Ex3 {
    public static void main(String[] args) {

        // Personal version
/*
        String[] languages1 = {"PHP", "Java", "C++", "Python"};
        String[] languages2 = {"PHP", "Java", "C", "Python"};
        //todo Since Java 9, we can use List.of() to fill in ArrayList from table
        ArrayList<String> liste1 = new ArrayList<String>(List.of(languages1));
        ArrayList<String> liste2 = new ArrayList<String>(List.of(languages2));
//        System.out.println(liste1); OK!
//        System.out.println(liste2); OK! We've got our 2 lists
        System.out.print(compareList(liste1, liste2));
    }
    public static ArrayList<String> compareList(ArrayList<String> liste1, ArrayList<String> liste2) {
        ArrayList<String> liste3 = new ArrayList<String>();

        for (int i = 0; i < liste1.size(); i++) {
            if (liste1.get(i).equals(liste2.get(i))) {
                liste3.add(i, "TRUE");
            } else {
                liste3.add(i, "FALSE");
            }
        }
        return liste3;
 */

        //* WayToLearnX version: using contains()

        List<String> lang1 = new ArrayList<String>();
        lang1.add("PHP");
        lang1.add("Java");
        lang1.add("C++");
        lang1.add("Python");
        List<String> lang2 = new ArrayList<String>();
        lang2.add("PHP");
        lang2.add("Java");
        lang2.add("C");
        lang2.add("Python");
        //Stocker la comparaison dans un ArrayList
        ArrayList<String> lang3 = new ArrayList<String>();
        for (String l : lang1)
            lang3.add(lang2.contains(l) ? "TRUE" : "FALSE");    //! ternaire Java
        System.out.println(lang3);
    }
}
