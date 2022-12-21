package wayToLearnX.ClassesHeritagePartie1;

/*      Écrivez une classe «Rectangle» ayant deux variables «a» et «b» et
        une fonction membre «surface()» qui retournera la surface du rectangle. */
import java.util.*;
public class Ex1 {
    public static class Rectangle {
        public int a, b;

        public Integer surface() {
            return a * b;
        }
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner in = new Scanner(System.in);

        System.out.println("Entrez la largeur(a) du rectangle :");
        rectangle.a = in.nextInt();
        System.out.println("Entrez la longueur(b) du rectangle :");
        rectangle.b = in.nextInt();
        System.out.println("Surface : "+ rectangle.surface());

        in.close();
    }
}
