package wayToLearnX.javaPartie3;

import java.util.Scanner;

import static java.lang.Math.sqrt;

/*      Un nombre premier est un nombre naturel supérieur à 1 qui n’a pas de diviseurs positifs que 1 et lui même.
        Écrivez une méthode qui vérifie si un nombre est un nombre premier.
        Exemple:
        check(2)
        Sortie prévue:
        true    */

//?        Pour déterminer si un nombre entier naturel n supérieur ou égal 2 est un nombre premier, on doit chercher un diviseur de n parmi les nombres premiers successifs (2, 3, 5, 7, 11 …) jusqu'à la valeur n−−√.
//?        En effet, si n n'admet aucun diviseur parmi les nombres premiers successifs jusqu'à la valeur sqrt(n) il n'en admettra pas non plus entre sqrt(n) et n car les diviseurs d'un nombre vont par paires : l'un compris entre 2 et sqrt(n), et l'autre compris entre sqrt(n)et n.
//?        Si n n'admet aucun diviseur parmi les nombres premiers successifs jusqu'à la valeur sqrt(n), c'est donc un nombre premier.
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre: ");
        int n = sc.nextInt();
        if(testPremier(n)){
            System.out.println("Ce nombre est premier !");
        }else{
            System.out.println("Ce nombre n'est pas premier...");
        }
    }

    public static Boolean testPremier(int n) {
        boolean nbrPremier = true;
        for (int i = 2; i < sqrt(n); i++) {     // sqrt pour minimiser le temps de calcul cf indice ci-dessus
            if (n % i == 0) {
                nbrPremier = false;
                break;
            }
        }
        return nbrPremier;
    }
}



