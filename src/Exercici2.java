import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Exercici2 {

    public static void main(String[] args) {

        /* ********************** */
        /*        EXERCICI 2      */
        /* ********************** */

        // Escriu un programa que ens demani un nom de directori i una extensió de fitxer
        // i llisti tots els fitxers d’aquell directori amb l’extensió donada.


        System.out.println("Escriu el nom del directori, on voleu vore els fitxers:");
        Scanner sc = new Scanner(System.in);
        String nomFitxer = sc.next();
        System.out.println("Escriu la extensió del fitxers:");
        String extensio = sc.next();


        File f = new File(nomFitxer);
        File[] files = f.listFiles();

        for (File file : files) {
            if (file.getName().endsWith(extensio)){
                System.out.println(file);
            }
        }
    }
}
