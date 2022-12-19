package wayToLearnX.javaPartie3;

/*      Un palindrome est un mot qui s’écrit de la même manière après l’inversion de ce dernier. ‘ada’ est un palindrome.
        Écrivez une méthode qui vérifie si une chaîne est un palindrome.
        Astuce: utilisez str.charAt(i) pour récupérer le caractère à la position i.
        Exemple:
        isPalindrome(‘ada’)
        Sortie prévue:
        true    */
public class Ex7 {
    public static void main(String[] args) {
        String str = "ada";
        Character[] chars = stringToCharArray(str);
        System.out.println(isPalindrome(chars));
    }
    // Méthode de conversion d'une "String" en "tableau de chars"
    public static Character[] stringToCharArray(String str) {
        if (str == null) {
            return null;
        }
        Character[] chars = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }
    // Méthode de vérification du palindrome
    public static boolean isPalindrome(Character[] chars) {
        boolean isPalindrome = false;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i].equals(chars[chars.length -1 - i])) {
                return true;
            }
        }
        return isPalindrome;
    }
}