import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Exercici6 {

    public static void main(String[] args) {
        // Escriu un programa que ens demani un nom de fitxer
        // i ens digui la data de darrera modificació d’aquest.

        System.out.println("Escriu el nom del directori, on voleu vore els fitxers:");
        Scanner sc = new Scanner(System.in);
        String nomFitxer = sc.next();

        File f = new File(nomFitxer);

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        System.out.println("Last updated : " + sdf.format(f.lastModified()));
    }
}
