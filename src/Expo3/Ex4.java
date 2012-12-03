/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Expo3;

/**
 *
 * @author Jay C Espinoza
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex4 {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("Prueba1.txt");
            outputStream = new FileWriter("Prueba2.txt");

            int c;
            while ( (c = inputStream.read()) != -1) {
                System.out.println("Escribiendo: " + (char)c);
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
