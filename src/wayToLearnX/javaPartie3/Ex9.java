package wayToLearnX.javaPartie3;

import java.util.Scanner;

/*      Écrivez un programme qui lit un entier entre 0 et 1000 et calcul la somme de tous les chiffres.
        Par exemple, le nombre 122, la somme de tous ses chiffres est 5.
        Astuce: utilisez l’opérateur % pour extraire les chiffres et
        utilisez l’opérateur / pour supprimer le chiffre extrait.
        Par exemple, 122 % 10 = 2 et 122/10 = 12.   */
public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un entier strictement entre 0 et 1000:");
        // int n = sc.nextInt();
        int n = 122; // composé de 3 chiffres 1 - 2 - 2 (notés a - b - c)

        // On cherche le a puis b
        int a = n / 100; // 1
        int b = (n / 10) % 10; // 2
        // On cherche le c
        int c = n % 10; // 2
        int somme = a + b + c;
        System.out.println("La somme des chiffres du nombre = " + somme);
    }
}
