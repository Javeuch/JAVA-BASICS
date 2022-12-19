package wayToLearnX.ArrayListPartie2;
import java.util.ArrayList;
import static wayToLearnX.ArrayListPartie2.Ex4.euch;

public class testGail {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<String>();
        languages.add("PHP");
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");
        ArrayList<String> frameworks = new ArrayList<String>();
        frameworks.add("Spring");
        frameworks.add("Hibernate");
        frameworks.add("Laravel");
        frameworks.add("Symfony");

//        Ex4 gail = new Ex4();
        System.out.println("Languages: " + languages);
        System.out.println("frameworks: " + frameworks);
        System.out.println("copie...");
        System.out.println("languages: " + languages);
        System.out.println("frameworks: " + euch(languages));
    }
}
