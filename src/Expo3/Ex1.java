/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Expo3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jay C Espinoza
 */
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Abriendo archivo para escritura...");
        System.out.println("...Hecho.");
        
        String caracteres = "$";
        FileWriter fw = null;
        
        System.out.println("Exscriba algo:");
        caracteres = new Scanner(System.in).nextLine();
        try {
            fw = new FileWriter(new File("Prueba1.txt"));
            fw.write(caracteres);
            System.out.println("'" + caracteres + "' fue escrito al archivo.");
        } catch (IOException ex) {

            System.out.println(ex);
        }

        if(fw != null)
            try {
                System.out.println("Cerrando archivo...");
                fw.close();
                System.out.println("...Hecho.");
        } catch (IOException ex) {
                System.out.println("Algo improbable pasó");
        }
    }
}
