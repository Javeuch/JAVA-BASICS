package wayToLearnX.javaPartie3;

import java.util.Scanner;

//! Fizz Buzz
/*      Écrivez une méthode qui renvoie « Fizz » pour des multiples de trois et « Buzz » pour des multiples de cinq.
        Pour les nombres qui sont des multiples de trois et de cinq, retournez « FizzBuzz ».
        Pour les nombres qui ne sont ni l’un ni l’autre, renvoyez le nombre saisi.
        Exemple:
        fizzBuzz(15)
        Sortie prévue:
        FizzBuzz    */
public class Ex4 {
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre entier: ");
        int number = sc.nextInt();*/
        int number = 0;
        for (int i = 0; i <= 100; i++) {
            number = i;
            if (number == 0) {
                System.out.println(0);
            } else if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }
    }
}

