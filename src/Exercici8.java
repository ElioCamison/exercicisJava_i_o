import java.io.File;
import java.util.Scanner;

public class Exercici8 {

    public static void main(String[] args) {
        //Escriu un programa que compari dos fitxers de text byte
        // per byte, i ens digui, si són diferents, la posició en la qual són diferents.

        System.out.println("Escriu el nom del fitxers 1:");
        Scanner sc = new Scanner(System.in);
        String fitxer1 = sc.next();
        System.out.println("Escriu el nom del fitxers 2:");
        String fitxer2 = sc.next();

        File f1 = new File(fitxer1);
        File f2 = new File(fitxer2);




        System.out.println(f1.compareTo(f2));
    }
}
