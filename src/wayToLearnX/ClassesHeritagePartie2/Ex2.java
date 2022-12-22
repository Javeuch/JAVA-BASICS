package wayToLearnX.ClassesHeritagePartie2;

/*      – Créez une classe «Person»
        – Créez une classe «Student» et une autre classe «Teacher», les deux héritent de la classe «Person».
        – La classe «Student» aura une méthode publique «GoToClasses», qui affichera à l’écran «I’m going to class.».
        – La classe «Teacher» aura une méthode publique «Explain», qui affichera à l’écran «Explanation begins». En plus, il aura un attribut privé «subject» de type string.
        – La classe «Person» doit avoir une méthode «SetAge(int n)» qui indiquera la valeur de leur âge (par exemple, 15 years old).
        – La classe «Student» aura une méthode publique «DisplayAge» qui écrira sur l’écran «My age is: XX years old».
        – Vous devez créer une autre classe de test appelée «Test» qui contiendra «Main» et:
        – Créez un objet Person et faites-lui dire «Hello»
        – Créer un objet Student, définir son âge à 15 ans, faites-lui dire «Hello», «I’m going to class.» et afficher son âge
        – Créez un objet Teacher, 40 ans, demandez-lui de dire «Hello» puis commence l’explication.*/
public class Ex2 {

    //* ***************** Main Class ***************************************/
    public static void main(String[] args) {

        Person person = new Person();
        person.sayHello();

        Student student = new Student();
        student.setAge(15);
        student.sayHello();
        student.displayAge();
        student.GoToClasse();


        Teacher teacher = new Teacher();
        teacher.setAge(40);
        teacher.sayHello();
        System.out.println("J'ai " + teacher.getAge() + " ans");
        teacher.Explain();
    }

    //* ***************** Person Class ***************************************/
    public static class Person {
        //? Attributs ----------------------/
        private int age;

        //? Getter -----------------------/
        public int getAge() {
            return age;
        }

        //? Setter -----------------------/
        public void setAge(int age) {
            this.age = age;
        }

        //? Method -----------------------------/
        public void sayHello() {
            System.out.println("Hello");
        }
    }

    //* ***************** Student Class ***************************************/
    public static class Student extends Person {

        //? Method -----------------------------/
        public void GoToClasse() {
            System.out.println("I’m going to class.");
        }

        public void displayAge() {
            System.out.println("My age is: " + getAge() + " years old");
        }
    }

    //* ***************** Teacher Class ***************************************/
    public static class Teacher extends Person {

        //? Attributs ----------------------/
        private String subject;

        //? Method -------------------------/
        public void Explain() {
            System.out.println("Explanation begins");
        }
    }
}
