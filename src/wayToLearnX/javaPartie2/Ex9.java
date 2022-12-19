package wayToLearnX.javaPartie2;

/*      Algèbre: résoudre des équations linéaires (2 équations, 2 inconnues)
        Vous pouvez utiliser la règle de Cramer pour résoudre le système d’équation linéaire (2 équations, 2 inconnues) suivant:
        ax + by = e         x = ed - bf	       y = af - ec
        cx + dy = f             ad - bc            ad - bc
        Écrivez un programme qui résout l’équation suivante et affiche la valeur de x et y:
        2.5x + 44.3y = 13.6
        3.1x + 6.6y = 2.9*/
public class Ex9 {
    public static void main(String[] args) {
        System.out.println("2.5x + 44.3y = 13.6");
        System.out.println("3.1x +  6.6y =  2.9");
        System.out.println("\n");
        System.out.println("x = (13.6 * 6.6) - (44.3 * 2.9)");
        System.out.println("    ----------------------------");
        System.out.println("    (2.5  * 6.6) - (44.3 * 3.1)");
        System.out.println("x = "+ (((13.6 * 6.6) - (44.3 * 2.9)) /
                ((2.5 * 6.6) - (44.3 * 3.1))));
        System.out.println("\n");
        System.out.println("y = (2.5 * 2.9) - (13.6 * 3.1)");
        System.out.println("    --------------------------");
        System.out.println("    (2.5 * 6.6) - (44.3 * 3.1)");
        System.out.println("y = "+ (((2.5 * 2.9) - (13.6 * 3.1)) /
                ((2.5 * 6.6) - (44.3 * 3.1))));
    }
}
