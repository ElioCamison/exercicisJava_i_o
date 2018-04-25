import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Exercici1 {

    public static void main(String[] args) {

        /* ********************** */
        /*        EXERCICI 1      */
        /* ********************** */

        // Escriu un programa que ens demani un nom de directori
        // i llisti tots els fitxers que hi ha a dins

        // Exemple: /home/ecamisonc/Escriptori
        System.out.println("Escriu el nom del directori, on voleu vore els fitxers:");
        Scanner sc = new Scanner(System.in);
        String nomFitxer = sc.next();

        File f = new File(nomFitxer);
        File[] files = f.listFiles();
        System.out.println(Arrays.toString(files));


    }

}
