package collections;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        //todo Déclaration de ma Collection d'interface List
        ArrayList<String>names = new ArrayList<String>();
        //todo Ajout d'éléments à ArrayList
        names.add("Maxime");
        System.out.println("Ma liste ordonnée \"names\" contient: " + names);
        //todo Ajout d'éléments à ArrayList
        names.add("Sébastien");
        System.out.println("Désormais liste ordonnée \"names\" contient: " + names);
        //todo Ajout d'éléments à ArrayList
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
    }
}
