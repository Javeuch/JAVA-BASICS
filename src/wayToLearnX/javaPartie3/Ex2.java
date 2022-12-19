package wayToLearnX.javaPartie3;

import java.util.Scanner;


/*      Écrivez un programme qui lit le rayon et la hauteur d’un cylindre et calcule l’aire et le volume à l’aide des formules suivantes:
        aire = rayon * rayon * pi
        volume = aire * hauteur*/
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le rayon: ");
        float rayon = sc.nextFloat();
        System.out.println("Entrez la hauteur: ");
        float hauteur = sc.nextFloat();
        float aire = rayon * rayon * 3.14F;
        System.out.println("L'aire du cylindre = " + aire + " SI");
        System.out.println("Le volume du cylindre = " + aire * hauteur + " SI");
    }
}
