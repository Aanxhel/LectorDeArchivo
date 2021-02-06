
package formatarchivo;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FormatArchivo {

    public static void main(String[] args) throws IOException {
        
        String locaArchivo;// = "./Archivo/archivo.txt";
        String locaSalisa = "./Archivo/arcSal.txt";
        String locaSalisa2 = "./Archivo/arcSal2.txt";
        
        System.out.print("Estatus de archivo:");
        Scanner sc = new Scanner(System.in);
        locaArchivo = JOptionPane.showInputDialog("Introduzca direccion de archivo: ");
        
        //locaArchivo = sc.nextLine();
        
        
        Operadores archivo = new Operadores();

        archivo.analizarRuta(locaArchivo);
        archivo.lecturaArchivoConca(locaArchivo,locaSalisa);
        archivo.lecturaArchivoComi(locaSalisa,locaSalisa2);
        
        
        System.out.println("fin del programa");
        
    }// static void main
}//fin class FormatArchivo
