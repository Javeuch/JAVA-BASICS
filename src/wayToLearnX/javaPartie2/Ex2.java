package wayToLearnX.javaPartie2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {

        int[] table = new int[4];
        table[0] = 1;
        table[1] = 2;
        table[2] = 9;
        table[3] = 4;
        int max = getMaxValue(table);
        System.out.println("La valeur max de table est " + max);
    }

    public static int getMaxValue(int[] table) {
        //TODO Version Java 1.1
//        int max = 0;
//        for (int i = 1; i < table.length; i++) {
//            if (table[i] > table[i - 1]) {
//                max = table[i];
//            }
//        }
//        return max;

        //TODO Version Java 5 for-each
        int max = table[0];
        for (int item : table) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }
}
                /**  ============================  */
        //TODO Avec une liste

/*        List<Integer> table = new ArrayList<Integer>();
        //    <=>    ArrayList<Integer> table = new ArrayList<Integer>();
        table.add(1);
        table.add(2);
        table.add(9);
        table.add(4);
        System.out.println("Le maximum de ce tableau (List) est: " + Collections.max(table));   */