package wayToLearnX.javaPartie3;

import java.util.Scanner;

/*      Écrivez un programme qui lit une température en degrés Celsius dans une valeur double,
        puis le convertit en Fahrenheit et affiche le résultat. La formule de conversion est la suivante:
        Fahrenheit = (9/5) * Celsius + 32
        Exemple:
        Entrez une température en degrés celsius : 12
        Sortie prévue:
        12.0 Celsius -> 53.6 Fahrenheit*/
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une température en °C: ");
        double temperatureCelsius = sc.nextDouble();
        double temperatureFahrenheit = ((9F / 5) * temperatureCelsius) + 32;    // possible 9.0 <=> 9F

        System.out.println(temperatureFahrenheit + " °F");
    }
}
