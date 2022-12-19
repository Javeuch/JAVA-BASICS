package wayToLearnX.javaPartie3;

/*      Le PGCD ou le Plus Grand Commun Diviseur de deux entiers est le plus grand entier pouvant diviser exactement deux nombres (sans reste).
        Écrivez une méthode qui renvoie le PGCD de p et q.
        Exemple:
        pgcd(12, 8)
        Sortie prévue:4 */
public class Ex8 {
    public static void main(String[] args) {
        int p = 12;
        int q = 3;
        System.out.print(pgcd(p, q));
    }
    public static int pgcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        return pgcd(q, p % q);
    }
}