package wayToLearnX.ArrayListPartie2;

import java.util.ArrayList;
import java.util.Collections;

/*      Écrivez un programme Java pour copier un ArrayList dans un autre.
        Exemple:
        Languages: [PHP, Java, C++, Python] Frameworks: [Spring, Hibernate, Laravel, Symfony]
        Sortie prévue:
        Languages: [PHP, Java, C++, Python]
        Frameworks: [Spring, Hibernate, Laravel, Symfony]
        copie…
        Languages: [Spring, Hibernate, Laravel, Symfony]
        Frameworks: [Spring, Hibernate, Laravel, Symfony]   */

// TODO go to see Collections.copy() https://waytolearnx.com/2020/05/la-methode-copy-en-java-les-collections.html
// TODO go to see Copier/cloner un ArrayList dans un autre en Java https://www.codeurjava.com/2015/09/copier-cloner-un-arraylist-dans-un-autre-en-java.html
public class Ex4 {
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

        System.out.println("Languages: " + languages);
        System.out.println("frameworks: " + frameworks);
        System.out.println("copie...");
/*
        // Personal version 2
        System.out.println("languages: " + frameworks.clone());

        //  WayToLearnX Version
        Collections.copy(languages, frameworks);
        System.out.println("Languages: " + languages);

        System.out.println("frameworks: " + frameworks);*/

//        ArrayList<String> copied;
//        copied = euch(frameworks);
        System.out.println("languages: " + euch(frameworks));
        System.out.println("frameworks" + frameworks);
    }
// Personal version 1 (without interface)
    public static ArrayList<String> euch(ArrayList<String> arrayToCopy) {
        ArrayList<String> copied = new ArrayList<>();
        for (String atc : arrayToCopy) {
            copied.add(atc);
        }
        return copied;
    }

}
