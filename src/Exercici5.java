import java.io.File;
import java.util.Scanner;

public class Exercici5 {

    public static void main(String[] args) {
        // Escriu un programa que ens demani una ruta i ens digui
        // si es tracta d’un fitxer o d’un directori (si existeix).

        System.out.println("Escriu el nom del directori, on voleu vore els fitxers:");
        Scanner sc = new Scanner(System.in);
        String nomFitxer = sc.next();

        File f = new File(nomFitxer);

        // És un fitxer
        System.out.println("És un fitxer " + f.isFile());

        // És un directori
        System.out.println("És un directori " +f.isDirectory());
    }
}
