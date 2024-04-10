package Excepciones.TP;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Probando_IOexcepcion {
    public static void main(String[] args) {
        try {
            // Intenta leer un archivo que no existe
            BufferedReader reader = new BufferedReader(new FileReader("archivo_que_no_existe.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            // Captura la excepción y muestra un mensaje de error
            System.out.println("Se produjo una IOException: " + e.getMessage());
        }
    }
}

