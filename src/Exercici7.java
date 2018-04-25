import java.io.File;
import java.util.Scanner;

public class Exercici7 {

    public static void main(String[] args) {
        // Escriu un programa que ens demani un nom de fitxer
        // i ens digui la grandària en KB, d’aquest.

        System.out.println("Escriu el nom del directori, on voleu vore els fitxers:");
        Scanner sc = new Scanner(System.in);
        String nomFitxer = sc.next();

        File f = new File(nomFitxer);

        System.out.println(f.length());
    }
}
