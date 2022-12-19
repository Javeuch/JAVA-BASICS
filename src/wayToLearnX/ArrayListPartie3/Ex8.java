package wayToLearnX.ArrayListPartie3;

import java.util.ArrayList;

/*  Écrivez un programme Java pour vérifier qu’un ArrayList est vide ou non.    */
//TODO isEmpty() en Java – Les collections https://waytolearnx.com/2020/03/la-methode-isempty-en-java-les-collections.html
public class Ex8 {
    public static void main(String[] args) {
        ArrayList<Character> liste = new ArrayList<Character>();
        liste.add('A');
        liste.add('B');
        liste.add('C');
        liste.add('D');
        System.out.println("liste avant: " + liste);  // size(liste) = 4

        //* Personal versions   ***************************************//
        //? Test empty liste
/*        liste.removeAll(liste);  // size(liste) = 0
        if (liste.size() == 0) {
            System.out.println("Liste vide !");
            }*/

        //? Test avec des éléments
        /*
        liste.remove(2);    // 'C' removed
        if (liste.size() == 0) {
            System.out.println("Liste vide");
        } else {
            System.out.println("liste a " + liste.size() + " éléments: " + liste);
        }
        */
        //* WayToLearnX method (with boolean)   ***********************//

        System.out.println(liste.isEmpty());  //false
        liste.removeAll(liste);
        System.out.println(liste.isEmpty());  //true
    }
}
