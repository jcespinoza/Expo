package Expo3;

import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author Jay C Espinoza
 */
public class Ex5 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            JFileChooser jf = new JFileChooser();

            System.out.println("Abriendo dialogo...\n\n");
            jf.showOpenDialog(null);
            fr = new FileReader(jf.getSelectedFile());
            
            System.out.println("************************************");
            System.out.println("******CONTENIDO DEL ARCHIVO*********");
            System.out.println("************************************");
            int caract;
            while( (caract = fr.read() ) != -1){
                System.out.print("" + (char)caract);
            }
            
        } catch (Exception ex) {
            System.out.println( "Ocurrio una: " + ex.getClass().getName() );

        } finally {
            try {
                fr.close();
            } catch ( Exception ex ) {
                System.out.println( "Ocurrio una: " + ex.getClass().getName() );
            }
        }
    }
}