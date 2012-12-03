/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Expo3;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Jay C Espinoza
 */
public class Ex2 {
    public static void main(String[] args) {
        String cars = "$";
        File f = new File("Prueba1.txt");
        
            System.out.println("Escriba algo:");
            cars = new Scanner(System.in).nextLine();
            
            try(FileWriter fw = new FileWriter(f, true)){
                
                if(cars.length() == 1){
                    fw.write(cars.charAt(0));
                    fw.write("\n".charAt(0));
                    System.out.println("Caracter '" + cars + "' escrito al archivo.");
                    return;
                }
                
                fw.write(cars);
                fw.append("\n".charAt(0));
                System.out.println(cars + " > escrito al archivo.");
                
            }catch(Exception ex){
                
                System.out.println("Ocurrio una: " + ex.getClass().getName());
                
            }
    }
}
