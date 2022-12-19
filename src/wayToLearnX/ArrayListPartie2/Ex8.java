package wayToLearnX.ArrayListPartie2;

import java.util.ArrayList;

/*Complétez le programme Java suivant pour augmenter la taille d’un ArrayList.*/
//TODO ArrayList: la méthode ensureCapacity() en Java https://www.codeurjava.com/2015/09/arraylist-la-methode-ensurecapacity-en.html
public class Ex8 {
    public static void main(String[] args) {

        ArrayList nbrs = new ArrayList(4);

        nbrs.add(1);
        nbrs.add(2);
        nbrs.add(3);
        nbrs.add(4);
        // Increase minimal capacity value
        nbrs.ensureCapacity(9);
        nbrs.add(5);
        nbrs.add(6);
        nbrs.add(7);
        nbrs.add(8);
        nbrs.add(9);

        System.out.println(nbrs);
    }
}

