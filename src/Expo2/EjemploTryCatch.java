

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edgardo Castellanos
 */
public class EjemploTryCatch {
    
 public static void main(String args[]){
     // Programa par convertir una cadena a un entero.
  
     
     String cadena="1";
     int y=2;
     
    try{
    
      int x = Integer.parseInt(cadena);
      System.out.println("Valor de x: "+x);
  }
    
    catch(NumberFormatException ex){
        
        System.out.println("Error: No es un numero, es una cadena de texto.");
  }
    catch(Exception ex){
        System.out.println("Error general");
    }
   
    finally{
        System.out.println("Valor de y: "+y);
    }
 }
}

    

