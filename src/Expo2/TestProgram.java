/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Expo2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jay C Espinoza
 */
public class TestProgram {
    private static final Scanner sc = new Scanner(System.in);
    //Using try-catch
    public static void main(String[] args) {
        //Prueba 1
        if(sc.next().equals("1"))
            causarError();
        atraparError();
        
        //Prueba 2
        if(sc.next().equals("1"))
            causaError2();
        atraparError2();
    }

    private static double raiz2(double h) {
        if(h < 0)
            throw new IllegalArgumentException();
        return Math.sqrt(h);
    }

    private static void causarError() {
        int h = -25;
        System.out.println("Square root of " + h + " --> " + raiz2(h));
    }

    private static void atraparError() {
        int h = -25;
        try{
            System.out.println("Square root of " + h + " --> " + raiz2(h));
        }catch(IllegalArgumentException iac){
            System.out.println("No se puede sacar raiz cuadrada a un numero negativo (" + h + ")");
        }
    }

    private static void causaError2() {
        do{
            System.out.println("Prueba 2. Ingrese un numero. PROHIBIDO escribir letras aqui.");
            int entero = sc.nextInt();
        }while(true);
    }

    private static void atraparError2() {
        boolean getOut = false;
        do{
            try{
                System.out.println("Prueba 2. Ingrese un numero. PROHIBIDO escribir letras aqui.");
                int entero = sc.nextInt();
                System.out.println("Bien! valor --> " + entero);
            }catch(InputMismatchException infe){
                System.out.println("ups! Ingreso caracteres no numericos!");
            }finally{
                getOut = true;
            }
        }while(!getOut);
    }
}
