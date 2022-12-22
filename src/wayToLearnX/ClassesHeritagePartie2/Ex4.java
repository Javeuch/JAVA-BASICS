package wayToLearnX.ClassesHeritagePartie2;

/*      Créez une classe «House», avec un attribut «surface», un constructeur qui définit sa valeur
        et une méthode «Display» pour afficher «Je suis une maison,
        ma surface est de XXX m2» (XXX: la valeur de surface).
        Incluez aussi des getters et des setters pour la surface.
        La classe «House» contiendra une porte (Door). Chaque porte aura un attribut «color» (de type String),
        et une méthode «Display» qui affichera «Je suis une porte, ma couleur est bleu» (ou quelle que soit la couleur).
        Inclure un getter et un setter. Créez également la méthode «GetDoor» dans la classe «House».
        La classe «Apartment» est une sous-classe de la classe «House», avec une surface prédéfinie de 50m2.
        Créez également une classe Person, avec un nom (de type String). Chaque personne aura une maison.
        La méthode «Display» pour une personne affichera son nom, les données de sa maison et les données
        de la porte de cette maison.
        Écrivez un Main pour créer un Apartment, une personne pour y vivre et pour afficher les données de la personne.
        Exemple:
        Je m'appele Thomas.
        Je suis un appartement, ma surface est 50 m2
        Je suis une porte, ma couleur est blue. */
public class Ex4 {
    //* ***************** Main Class **************************************/
    public static void main(String[] args) {

        Apartment apartment = new Apartment();
        Person person = new Person();
        person.nom = "Thomas";
        person.house = apartment;
        person.display();
    }

    //* ***************** House Class **************************************/
    public static class House {
        //? Attributs ----------------------/
        private int surface;
        private Door door;
        //? Constructor (params)-------------/
        public House(int surface) {
            this.surface = surface;
            door = new Door();
        }
        //? Getters -----------------------/
        public int getSurface() {
            return surface;
        }
        public Door getDoor() {
            return door;
        }
        //? Setters -----------------------/
        public void setSurface(int surface) {
            this.surface = surface;
        }
        public void setDoor(Door door) {
            this.door = door;
        }
        //? Methods ------------------------/
        public void display() {
            System.out.println("Je suis une maison, ma surface est de " + getSurface() + " m2");
        }
    }

    //* ***************** Door Class **************************************/
    public static class Door {
        //? Attributs ----------------------/
        private String color;
        //? Constructors --------------------/
        public Door() {
            color = "bleue";
        }
        public Door(String color) {
            this.color = color;
        }
        //? Getter -------------------------/
        public String getColor() {
            return color;
        }
        //? Setters ------------------------/
        public void setColor(String color) {
            this.color = color;
        }
        //? Methods ------------------------/
        public void display() {
            System.out.println("Je suis une porte, ma couleur est " + getColor());
        }
    }

    //* ***************** Apartment Class **************************************/
    public static class Apartment extends House {
        //? Constructor (1 params)-------------/
        Apartment() {
            super(50);
        }

        //? Method ------------------------/
        public void display() {
            System.out.println("Je suis un appartement, ma surface est " + getSurface() + " m2");
        }
    }

    //* ***************** Person Class **************************************/
    public static class Person {
        //? Attributs ----------------------/
        private String nom;
        private House house;
        //? Constructors --------------------/
        public Person() {
            nom = "Thomas";
            house = new House(150);
        }
        public Person(String nom, House house) {
            this.nom = nom;
            this.house = house;
        }
        //? Getters -----------------------/
        public String getNom() {
            return nom;
        }
        public House getHouse() {
            return house;
        }
        //? Setters -----------------------/
        public void setNom(String nom) {
            this.nom = nom;
        }
        public void setHouse(House house) {
            this.house = house;
        }

        //? Methods ------------------------/
        public void display() {
            System.out.println("Je m'appele " + getNom() + ".");
            house.display();
            house.door.display();
        }
    }
}