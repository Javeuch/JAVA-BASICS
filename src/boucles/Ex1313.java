package boucles;

/*      La population des Sims Alpha est de 10 000 000 d'habitants et augmente de 500 000 par an.
        Sims Beta compte 5 000 000 d'habitants et augmente de 3% par an.
        Ecrire un programme java pour déterminer combien d'années la population des Sims Beta dépassera celle des Sims Alpha*/
public class Ex1313 {
    public static void main(String[] args){
        Long habsAlpha = 10000000L;
        Long habsBeta = 5000000L;
        int year = 0;
        do{
            habsAlpha = habsAlpha + 5000000L;
            habsBeta += habsBeta * 3/100;
            year++;
        }while(habsBeta < habsAlpha);
        System.out.println("Le nombre d'habitants Sims Alpha sera inférieur à celui de Sims Beta en " + year + " ans");
    }
}
