package tableaux;

import java.util.Scanner;

/*      Ecrivez un algorithme permettant à l’utilisateur de saisir
        un nombre quelconque de valeurs, qui devront être
        stockées dans un tableau. L’utilisateur doit donc
        commencer par entrer le nombre de valeurs qu’il
        compte saisir. Il effectuera ensuite cette saisie. Enfin, une
        fois la saisie terminée, le programme affichera le
        nombre de valeurs négatives et le nombre de valeurs
        positives.  */
public class Ex1342 {
    public static void main(String[] args) {

        System.out.println("Entrez le nombre de valeurs composant votre tableau:");
        Scanner sc1 = new Scanner(System.in);
        int sizeTable = sc1.nextInt();
        System.out.println("Votre tableau va contenir " + sizeTable + " valeurs");
        int negative = 0;
        int positive = 0;

        System.out.println("Saisissez les valeurs");
        for (int i = 0; i <= sizeTable - 1; i++) {
            int[] table = new int[sizeTable];

            System.out.println("Valeur" + i);
            Scanner sc2 = new Scanner(System.in);
            table[i]= sc2.nextInt();
            if (table[i] < 0) {
                negative++;
            }else{
                positive++;
            }
        }
        System.out.println("Il y a " + negative + " nombre(s) négatif(s) et " + positive + " nombre(s) positifs.");
    }
}
