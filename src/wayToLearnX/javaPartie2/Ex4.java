package wayToLearnX.javaPartie2;
import java.io.File;
public class Ex4 {
    public static void main(String[] args) {
        File myFile = new File("/home/max/Images/img-perso/max-marcel.jpg");
        // Taille en bytes / octets
        double byteSize = myFile.length();
        // Taille en kilobytes / Ko
        double kilobyteSize = byteSize / 1000; // myFile.length()/1000;
        System.out.println("La taille du fichier \"max-marcel\" est: " + myFile.length() + " octets");
        System.out.println("La taille du fichier \"max-marcel\" est de " + myFile.length()/1000 + " Ko");
    }
}
