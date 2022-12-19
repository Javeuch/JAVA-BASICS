package wayToLearnX.javaPartie2;

/*      Écrivez un programme Java pour afficher la valeur ascii d’un caractère donné.
        Sortie prévue:
        La valeur ASCII de A est: 65*/
public class Ex3 {
    public static void main(String[] args) {
        int hexa = transormAscii('A');
        System.out.println("La valeur ASCII de A est: " + hexa);
    }

    private static int transormAscii(char a) {
        return 65;
    }
}
