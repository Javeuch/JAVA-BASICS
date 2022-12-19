package boucles;


import java.util.Scanner;

/*      Ecrire un algorithme qui demande un nombre compris entre 10 et 20, jusqu’à ce
        que la réponse convienne. En cas de réponse supérieure à 20, on fera
        apparaître un message : « Plus petit ! », et inversement, « Plus grand ! » si le nombre
        est inférieur à 10.*/
public class Ex1311 {
    public static void main(String[] args) {

        System.out.println("Saisissez un nombre entre 10 et 20 : ");
        Scanner sc = new Scanner(System.in);
        int nombre = sc.nextInt();
        while (nombre < 10 || nombre > 20) {
            if (nombre < 10) {
                System.out.println("Saississez un nombre + grand : ");
                nombre = sc.nextInt();
            }
            if (nombre > 20) {
                System.out.println("Saississez un nombre + petit : ");
                nombre = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Vous avez entré " + nombre);
    }
}