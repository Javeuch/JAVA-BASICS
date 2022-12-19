package tableaux;

/*  1- Ecrire un algorithme qui déclare et remplisse un tableau de 7 valeurs
numériques en les mettant toutes à zéro.
    2- Ecrire un algorithme qui déclare et remplisse un tableau contenant les
six voyelles de l’alphabet latin.   */
public class Ex1341 {
    public static void main(String[] args) {
/*  1-
        int[] table = new int[7];
        for (int i = 0; i < 7; i++) {
            table[i] = 0;
            System.out.println(table[i]);
        }*/

        /*  2- */
        char[] voyelle = new char[6];
        voyelle[0] = 'a';
        voyelle[1] = 'e';
        voyelle[2] = 'i';
        voyelle[3] = 'o';
        voyelle[4] = 'u';
        voyelle[5] = 'y';
        System.out.println(voyelle);
    }
}
