package wayToLearnX.javaPartie2;

public class Ex7 {
    public static void main(String[] args) {
        int kilometres = 15;
        float miles = kilometres /1.6F; // miles
        float duration = 50*60 + 10; // secondes
        float milesSpeed = miles / (duration / 3600); // mi/h

        System.out.println("VITESSE MOYENNE = " + milesSpeed + " mi/h \n soit " + milesSpeed * 1.6 + " km/h");
        //! L'exercice propose une réponse fausse
        float sortiePrevue = (15/30.10F)/1.6F;
        System.out.println("Sortie prévue " + sortiePrevue + " mi/h, me semble fausse !");

    }
}
