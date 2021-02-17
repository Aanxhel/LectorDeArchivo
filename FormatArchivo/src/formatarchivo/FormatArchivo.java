
package formatarchivo;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FormatArchivo {

    public static void main(String[] args) throws IOException {
        
        String locaArchivo = "C:\\Users\\Angel Montiel\\Desktop\\esteNo.txt";// = "./Archivo/archivo.txt";
        String locaSalisa = "./Archivo/temp/arcSal1.txt";
        String locaSalisa2 = "./Archivo/temp/arcSal2.txt";
        String locaSalisa3 = "./Archivo/temp/arcSal3.txt";
        String locaSalisa4 = "./Archivo/temp/arcSal4.txt";
        String salida = "./Archivo/archivo.txt";
        
        System.out.print("Estatus de archivo:");
        
        //locaArchivo = JOptionPane.showInputDialog("Introduzca direccion de archivo: ");
        Operadores archivo = new Operadores();
        chancheDate chanche = new chancheDate();

        archivo.analizarRuta(locaArchivo);
        archivo.ConcatPath(locaArchivo,locaSalisa);
        archivo.comiFormat(locaSalisa,locaSalisa2);
        archivo.dateFormat(locaSalisa2,locaSalisa3);
        archivo.dateVocal(locaSalisa3,locaSalisa4);
        chanche.cambioFecha(locaSalisa4, salida);
        
        System.out.println("fin del programa");//marca fin del programa
        
    }// static void main
}//fin class FormatArchivo
