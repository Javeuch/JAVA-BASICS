package boucles;

import java.util.Scanner;

/*      Lire la suite des prix (en euros entiers et terminée par
        zéro) des achats d’un client. Calculer la somme qu’il
        doit lire, la somme qu’il paye, et simuler la remise de
        la monnaie en affichant les textes "10 Euros", "5
        Euros" et "1 Euro" autant de fois qu’il y a de coupures
        de chaque sorte à rendre.
        Exemple :
        somme due : 17 €
        montant versé : 30 €
        Billets de 10€ : 1
        Billets de 5€ : 0
        Pièces : 3 €    */
public class Ex1328 {
    public static void main(String[] args) {
        int totalPriceArticles = 0;
        int PriceArticle = 0;
        System.out.println("Entrez le montant de chaque article et terminez par 0");
        do {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Prix de l'article = ");
            PriceArticle = sc1.nextInt();
            totalPriceArticles += PriceArticle;
        } while (PriceArticle != 0);
        System.out.println("Montant à régler = " + totalPriceArticles + " €");
        System.out.println("Indiquez le montant versé =");

        Scanner sc2 = new Scanner(System.in);
        final int AMOUNT_PAID = sc2.nextInt();
        int amountReturned = AMOUNT_PAID - totalPriceArticles;
        System.out.println("Montant à rendre = " + amountReturned + " €");

        int nbUnEuro = 0;
        int nbCinqEuros = 0;
        int nbDixEuros = 0;

        nbDixEuros = amountReturned / 10;
        if ((amountReturned % 10) >= 5) {
            nbCinqEuros = 1;
            nbUnEuro = (amountReturned % 10) - 5;
        }
        if ((amountReturned % 10) < 5) {
            nbUnEuro = amountReturned % 10;
        }
        System.out.println("Détail devMax: " + nbDixEuros + " Billet(s) de 10 €, " + nbCinqEuros + " billet de 5 euros, et " + nbUnEuro + " pièce(s) de 1 Euro");
    }
}

