package wayToLearnX.javaPartie2;
// Écrivez une méthode qui inverse une chaîne.
// Exemple:
// reverse(‘WayToLearnX’)
// Sortie prévue: XnraeLoTyaW

public class Ex1 {
    public static void main(String[] args) {
        String str = "WayToLearnX";
        String rev = reverse(str);
        System.out.print(rev);
    }

    public static String reverse(String str) {
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            rev += str.charAt(str.length() - i - 1);
        }
        return rev;
    }
}