package wayToLearnX.javaPartie3;

/*      Écrivez une méthode qui renvoie le nième élément d’une séquence de Fibonacci.
        Une séquence de Fibonacci est une série de nombres: 0, 1, 1, 2, 3, 5, 8, 13, 21, …
        Le nombre suivant est trouvé en additionnant les deux nombres précédents.
        Supposons que les index commencent à 0, par exemple, fibonacci(0) = 0, fibonacci(1) = 1, etc…
        Exemple:
        fibonacci(8)
        Sortie prévue:
        21*/
public class Ex6 {
    public static void main(String[] args) {
        int nbr = 8;
        System.out.println("Le résultat vaut: " + fibonacci(nbr));
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

