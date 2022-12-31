package collections;

import java.util.ArrayList;
import java.util.Iterator;
/*import java.util.List;*/ //* Fonctionne avec l'interface List comme avec la Classe ArrayList

public class arrayList {
    public static void main(String[] args) {
        //todo Déclaration de ma Collection d'interface List
      ArrayList<String> names = new ArrayList<String>();

        //todo Ajout d'éléments à ArrayList
        names.add("Maxime");
        System.out.println("Ma liste ordonnée \"names\" contient: " + names);
        names.add("Sébastien");
        System.out.println("Désormais liste ordonnée \"names\" contient: " + names);
        names.add("Nicolas");
        names.add("Marine");
        names.add("Fethi");
        System.out.println("Ma liste devient bien remplie: " + names + " , elle compte " + names.size() + " prénoms !");
        System.out.println("Nicolas, Marine et Fethi sont séniors et seuls les Juniors font partis de la liste !");

        //todo Suppression d'éléments à ArrayList
        names.remove("Nicolas");
        names.remove("Marine");
        names.remove("Fethi");
        System.out.println("Ma liste de Juniors est : " + names);

        //todo remplacement d'éléments dans la liste  //Maxime-Sébastien-Nicolas-Marine-Fethi
        names.set(1, "Roger");  // remplace Sébastien
        names.add("Nicolas");
        names.add("Marine");
        names.add("Fethi");
        Iterator iterator = names.iterator();
        System.out.println("La liste avec iterator: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next() +"");
        }

        //todo On remet ce pauvre Sébastien à sa place (2ème position)
      names.add(1, "Sébastien");
      System.out.println("Liste complète: " + names);
    }
}
