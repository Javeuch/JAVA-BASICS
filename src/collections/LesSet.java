package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

//todo: youtube video explanation: https://www.youtube.com/watch?v=rruCajMgvGA
// Set: non ordered guaranty
// Set: does not accept duplicate element
public class LesSet {
    public static void main(String[] args) {
        HashSet<String> setNonOrdered = new HashSet<>();    // <=> Set<String> setNonOrdered
        Set<String> setNaturalyOrdered = new TreeSet<>();   // <=> TreeSet<String> setNaturalyOrdered

        setNonOrdered.add("Maxime");
        setNonOrdered.add("Sébastien");
        setNonOrdered.add("Bob");
        setNonOrdered.add("Maxime"); // duplicate => removed !
        System.out.println(setNonOrdered); // [Bob, Maxime, Sébastien]

        setNonOrdered.add("1");
        setNonOrdered.add("2");
        System.out.println(setNonOrdered);  // [1, 2, Bob, Maxime, Sébastien]

        setNonOrdered.addAll(Set.of("Marine", "Fethi"));   // [1, 2, Marine, Bob, Maxime, Sébastien, Fethi]
        System.out.println(setNonOrdered);

        setNonOrdered.clear();  // delete all
        System.out.println("setNonOrderd = " + setNonOrdered);  // []

        Set<String> setNonOrdered2 = Set.of("Maxime", "1", "Sébastien", "2", "3");
        System.out.println(setNonOrdered2); // [3, 2, 1, Maxime, Sébastien]

/*        setNaturalyOrdered = Set.of("Maxime","1", "Sébastien", "2", "3");
        System.out.println("setNaturalyOrdered =" + setNaturalyOrdered);*/

        setNaturalyOrdered = Set.of("2", "1", "3", "Sébastien", "Maxime");
        System.out.println("setNaturalyOrdered =" + setNaturalyOrdered);

        // Java 5 loop
        for (String e : setNaturalyOrdered) {   //description of each element of setNaturalyOrdered
            System.out.print(e + " ");
        }

        // With API Stream
        Stream<String> stream1 = setNaturalyOrdered.stream();
        System.out.println(" \n TreeSet affiché avec Stream: ");
        stream1.forEach((e) -> {
            System.out.print(e + " ");
        });

    }
}
