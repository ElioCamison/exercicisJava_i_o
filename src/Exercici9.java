import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Exercici9 {

    public static void main(String[] args) {
        // Escriu un programa que llegeixi els continguts
        // d’un fitxer i ho introdueixi dins un array de bytes.

        System.out.println("Escriu el nom del directori, on voleu vore els fitxers:");
        Scanner sc = new Scanner(System.in);
        String nomFitxer = sc.next();

        File f = new File(nomFitxer);
        File[] files = f.listFiles();
        System.out.println(Arrays.toString(files));
    }
}
