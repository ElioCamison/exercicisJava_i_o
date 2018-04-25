import java.io.File;
import java.util.Scanner;

public class Exercici4 {

    public static void main(String[] args) {
        //Escriu un programa que ens demani un nom de directori o fitxer
        // i ens digui si tenim permís d’escriptura i/o de lectura.

        System.out.println("Escriu el nom del directori, on voleu vore els fitxers:");
        Scanner sc = new Scanner(System.in);
        String nomFitxer = sc.next();

        File f = new File(nomFitxer);

        // s'ha d'escriure bé es nom del fitxer
        System.out.println(f.canRead());
        System.out.println(f.canWrite());




    }
}
