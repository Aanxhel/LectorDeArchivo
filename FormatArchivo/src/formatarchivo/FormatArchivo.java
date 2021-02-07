
package formatarchivo;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FormatArchivo {

    public static void main(String[] args) throws IOException {
        
        String locaArchivo;// = "./Archivo/archivo.txt";
        String locaSalisa = "./Archivo/temp/arcSal1.txt";
        String locaSalisa2 = "./Archivo/temp/arcSal2.txt";
        String locaSalisa3 = "./Archivo/temp/arcSal3.txt";
        String salida = "./Archivo/archivo.txt";
        
        System.out.print("Estatus de archivo:");
        Scanner sc = new Scanner(System.in);
        locaArchivo = JOptionPane.showInputDialog("Introduzca direccion de archivo: ");
        
        //locaArchivo = sc.nextLine();
        
        
        Operadores archivo = new Operadores();

        archivo.analizarRuta(locaArchivo);
        archivo.ConcatPath(locaArchivo,locaSalisa);
        archivo.comiFormat(locaSalisa,locaSalisa2);
        archivo.dateFormat(locaSalisa2,salida);
        //archivo.MesArchivo(locaSalisa3,salida);
        
        
        System.out.println("fin del programa");
        
    }// static void main
}//fin class FormatArchivo
