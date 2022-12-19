package wayToLearnX.ArrayListPartie3;

import java.util.ArrayList;

/*      Terminez la méthode suivante deleteLongStrings qui vérifie chaque élément de la liste et supprime ceux qui sont strictement supérieurs à 4 caractères.
        Exemple:
        [Bob, Ali, Thomas, Alex, Nermine]
        Sortie prévue:
        [Bob, Ali, Alex]    */
public class Ex5 {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<String>();
        liste.add("Bob");
        liste.add("Ali");
        liste.add("Thomas");
        liste.add("Alex");
        liste.add("Nermine");

        deleteLongStrings(liste);

        System.out.println(liste);
    }
    public static void deleteLongStrings(ArrayList<String> liste) {
        int itemList = 0;
        while (itemList < liste.size()) {
            if (liste.get(itemList).length() > 4) {
                liste.remove(itemList);
            }
            itemList++;
        }
    }
}

