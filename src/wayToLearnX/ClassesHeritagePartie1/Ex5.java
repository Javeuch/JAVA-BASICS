package wayToLearnX.ClassesHeritagePartie1;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/*      Créez une classe appelée «Point». Cette classe doit avoir 2 entiers (x, y) en tant que membres privés.
        Le constructeur doit définir les valeurs de x et y via des paramètres.
        La classe doit avoir une méthode publique appelée «distance».
        Cela prend un seul paramètre(Point) et renvoie la distance entre les 2 points.
        Exemple:
        P1 (5,6)
        P2 (3,2)
        La distance entre P1 et P2 est : 4.47214*/
public class Ex5 {
    //* ***************** Main Class ***************************************/
    public static void main(String[] args) {

        Point point1 = new Point();
        Point point2 = new Point();

        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        // Point 1
        System.out.println("Entrez l'abscisse du point 1: ");
        int x1 = in1.nextInt();
        point1.setX(x1);

        System.out.println("Entrez l'ordonnée du point 1: ");
        int y1 = in1.nextInt();
        point1.setY(y1);
        // Point visualization
        point1.showPoint(x1, y1);

        // Point 2
        System.out.println("Entrez l'abscisse du point 2: ");
        int x2 = in2.nextInt();
        point2.setX(x2);

        System.out.println("Entrez l'ordonnée du point 2: ");
        int y2 = in2.nextInt();
        point2.setY(y2);
        // Point visualization
        point2.showPoint(x2, y2);

        in1.close();
        in2.close();
        // Distance point1 point2
        System.out.println("La distance entre les points est = " + point1.ditance(point2));

    }

    //* ***************** Point Class **************************************/
    public static class Point {

        //? Attributs ----------------------/
        private int x;
        private int y;

        //? Empty constructor ---------------------/
        Point() {
        }

        //? Constructor (2 params)-------------/
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        //? Getters -----------------------/
        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        //? Setters -----------------------/
        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        //? Methods ------------------------/
        public double ditance(Point p) {    // p represents coordonnates x, y of the other point
            double abscissaToX = this.getX() - p.getX(); // this. can be removed
            double ordinateToY = this.getY() - p.getY();
            return Math.sqrt(Math.pow(abscissaToX, 2) + Math.pow(ordinateToY, 2));
        }

        public void showPoint(double x, double y) {
            System.out.println("(" + getX() + ";" + getY() + ")");
        }

    }
}
