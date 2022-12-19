package wayToLearnX.javaPartie2;


import java.text.SimpleDateFormat;
import java.util.Calendar;

/*      Écrivez un programme Java pour afficher l’heure du système.
        Sortie prévue:
        La date du systéme est: Sun Apr 12 09:28:02 UTC 2020*/
public class Ex5_Ex6 {
    public static void main(String[] args) {

        //TODO Ex5
       /* System.out.format("La date du systéme est: %tc",
                System.currentTimeMillis());    */

        //TODO Ex6:
        String timeStamp = new SimpleDateFormat(" dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp);

    }
}
