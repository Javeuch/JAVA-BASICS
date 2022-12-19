package wayToLearnX.javaPartie2;

/*      Supposons qu’un athlète parcourt 18 miles en 1 heure, 20 minutes, et 30 secondes.
        Écrivez un programme qui affiche la vitesse moyenne en kilomètres par heure.
        Notez que 1 mille = 1,6 kilomètre.
        Sortie prévue:
        VITESSE MOYENNE = 21.46583850931677 km/h */
public class Ex8 {
    public static void main(String[] args) {
        int miles = 18;
        float kms = miles * 1.6F;
        float duration = 60 * 60 + 20 * 60 + 30;  // secondes
        float kmsSpeed = kms / (duration / 3600); // km/h

        System.out.println("VITESSE MOYENNE = " + kmsSpeed);
    }
}
