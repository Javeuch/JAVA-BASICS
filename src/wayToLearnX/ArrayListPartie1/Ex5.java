package wayToLearnX.ArrayListPartie1;

import java.util.ArrayList;
import java.util.List;

/*  Corrigez le code suivant afin qu’il compile. Le code doit instancier un ArrayList de String nommée ‘persons’ et
    la remplir avec les chaînes du tableau ’employee’. Il devrait ensuite afficher les ‘persons’.*/
public class Ex5 {
    public static void main(String[] args) {
        List<String> persons = new ArrayList<String>();

        String[] employee = {"Alex", "Thomas", "Bob", "Yohan"};
        // < au lieu de <= pour ne pas être "Index 4 out of bounds for length 4"
        for (int i = 0; i < employee.length; i++) {
            persons.add(employee[i]);
        }
        System.out.println(persons);
    }
}
