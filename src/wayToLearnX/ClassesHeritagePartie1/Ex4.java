package wayToLearnX.ClassesHeritagePartie1;

import java.util.Scanner;

/*      Effectuez une opération d’addition sur des nombres complexes à l’aide d’une
        classe Java appelée « Complex ». Le programme doit demander
        la partie réelle et imaginaire de deux nombres complexes
        et afficher les parties réelle et imaginaire de leur somme. */
public class Ex4 {
    //* ***************** Main Class ***************************************/
    public static void main(String[] args) {

        Complex complex1 = new Complex();
        Complex complex2 = new Complex();

        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        // Complex number 1
        System.out.println("Entrez la partie réelle du nb 1: ");
        int real1 = in1.nextInt();
        complex1.setReal(real1);

        System.out.println("Entrez la partie imaginaire du nb 1: ");
        int imaginary1 = in1.nextInt();
        complex1.setImaginary(imaginary1);
        // Complex number visualization
        complex1.showComplexNumber(real1, imaginary1);

        // Complex number 2
        System.out.println("Entrez la partie réelle du nb 2: ");
        int real2 = in2.nextInt();
        complex2.setReal(real2);

        System.out.println("Entrez la partie imaginaire du nb 2: ");
        int imaginary2 = in2.nextInt();
        complex2.setImaginary(imaginary2);
        // Complex number visualization
        complex2.showComplexNumber(real2, imaginary2);

        in1.close();
        in2.close();
        // Sum of reals and imaginaries parts
        int sumReal = complex1.getReal() + complex2.getReal();
        int sumImaginary = complex1.getImaginary() + complex2.getImaginary();

        System.out.println("L'addition des 2 nombres complexes s'écrit: " + sumReal + "+" + sumImaginary + "i");
    }
    //* ***************** Complex Class **************************************/
    public static class Complex {
        //? Attributs ----------------------/
        private int real;
        private int imaginary;

        //? Default empty constructor (unusefull)-----------------------/
//        Complex(){
//
//        }

        //? Getters -----------------------/
        public int getReal() {
            return real;
        }
        public  int getImaginary() {
            return imaginary;
        }



        //? Setters -----------------------/
        public void setReal(int real) {
            this.real = real;
        }
        public void setImaginary(int imaginary) {
            this.imaginary = imaginary;
        }

        //? Methods ------------------------/
        public void showComplexNumber(int real, int imaginary) {
            System.out.println("Le nombre complexe s'écrit: " + getReal() + "+" + getImaginary() + "i");
        }

    }
}
