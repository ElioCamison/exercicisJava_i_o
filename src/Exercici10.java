import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
* Escriu un programa que llegeixi els continguts d’un fitxer de text i ho
* introdueixi dins un array de caràcters.
* */
public class Exercici10 {

    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader r = new BufferedReader(new FileReader("/etc/passwd"));
        String line;
        while ((line = r.readLine()) != null){
            System.out.println(line);
        }
    }
}
