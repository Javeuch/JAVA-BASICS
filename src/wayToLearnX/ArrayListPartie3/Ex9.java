package wayToLearnX.ArrayListPartie3;

import java.util.ArrayList;

/*      Terminez la méthode findLongStr pour rechercher et renvoyer la chaîne la plus longue dans l’ ArrayList.
        Exemple:
        [Bob, Ali, Mélissandre, Alex, Thomas]
        Sortie prévue:
        Mélissandre */
public class Ex9 {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<String>();
        liste.add("Bob");
        liste.add("Ali");
        liste.add("Mélissandre");
        liste.add("Alex");
        liste.add("Thomas");

        System.out.println("La String la + longue est: " + findLongStr(liste));
    }
    public static String findLongStr(ArrayList<String> liste) {
        String strMax = "";
        for (String str : liste) {
            if (str.length() > strMax.length()) {
                strMax = str;
            }
        }
        return strMax;
    }
}
