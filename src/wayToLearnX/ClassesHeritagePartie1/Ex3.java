package wayToLearnX.ClassesHeritagePartie1;

import java.util.Scanner;

/*      Écrivez une classe Java appelée « Student » avec les membres suivant :
        nom (de type String),
        note1, note2 (de type int)
        Le programme demande à l’utilisateur d’entrer le nom et les notes.
        calc_moy() calcule la note moyenne et show() affiche le nom et la note moyenne. */
public class Ex3 {
    //* ***************** Main Class ***************************************/
    public static void main(String[] args) {

        Student student = new Student();

        Scanner in1 = new Scanner(System.in);

        System.out.println("Entrez le nom de l'élève: ");
        String nom = in1.nextLine();
        student.setNom(nom);

        Scanner in2 = new Scanner(System.in);

        System.out.println("Entrez la note 1: ");
        int note1 = in2.nextInt();
        student.setNote1(note1);

        System.out.println("Entrez la note 2: ");
        int note2 = in2.nextInt();
        student.setNote2(note2);

        in1.close();
        in2.close();

        student.show();
    }
    //* ***************** Student Class **************************************/
    public static class Student {
        //todo Attributs
        private String nom;
        private int note1;
        private int note2;

        //todo Default empty constructor
        public Student() {
        }

        //todo Constructor with all parameters
        public Student(String nom, int note1, int note2) {
            this.nom = nom;
            this.note1 = note1;
            this.note2 = note2;
        }

        //? Getters -----------------------/
        public String getNom() {
            return nom;
        }

        public int getNote1() {
            return note1;
        }

        public int getNote2() {
            return note2;
        }

        //? Setters -----------------------/
        public void setNom(String nom) {
            this.nom = nom;
        }

        public void setNote1(int note1) {
            this.note1 = note1;
        }

        public void setNote2(int note2) {
            this.note2 = note2;
        }

        //? Methods ------------------------/
        //? calc_moy()
        public float calc_moy(int note1, int note2) {
            return (float) (getNote1() + getNote2()) / 2;
        }
        //? show()
        public void show() {
            System.out.println("nom:" + getNom() + "\n" + "moyenne = " + calc_moy(note1, note2));
        }
    }
}

