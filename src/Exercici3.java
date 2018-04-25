import java.io.File;
import java.util.Scanner;

public class Exercici3 {

    public static void main(String[] args) {

        // Escriu un programa que ens demani un nom de directori
        // o fitxer i ens digui si aquest existeixo no.

        System.out.println("Escriu el nom del directori, on voleu vore els fitxers:");
        Scanner sc = new Scanner(System.in);
        String nomFitxer = sc.next();
        System.out.println("Escriu la extensió del fitxers:");
        String extensio = sc.next();


        File f = new File(nomFitxer);
        File[] files = f.listFiles();

        for (File file : files) {
            if (file.getName().endsWith(extensio)){
                System.out.println(true);
            } else{
                System.out.println(false);
            }
        }
    }
}
